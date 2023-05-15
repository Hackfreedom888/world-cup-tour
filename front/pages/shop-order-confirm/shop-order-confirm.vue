<template>
	<view class="content">
		<form>
			<view v-if="seat!=1" @tap="onAddressTap" class="cu-form-group">
				<view class="title">地址</view>
				<view>
					<view>
						{{address.name}} {{address.phone}}
					</view>
					<view>
						{{address.address}}
					</view>
				</view>
			</view>
			<view class="cu-form-group">
				<view class="title">购买清单</view>
			</view>
			<view v-for="(item,index) in orderGoods " v-bind:key="index" class="cu-form-group">
				<image class="avator" :src="baseUrl+item.picture" mode=""></image>
				<view class="title">
					<view>{{item.goodname}}</view>
					<view v-if="seat!=1">
						x{{item.buynumber}}
						<text v-if="type==1||type==3" style="margin-left: 30upx;color: red;">￥{{item.price}}</text>
						<text v-if="type==2" style="margin-left: 30upx;color: red;">{{item.price}}积分</text>
					</view>
					<view v-else>
						{{item.address}}号
						<text v-if="type==1" style="margin-left: 30upx;color: red;">￥{{item.price}}</text>
						<text v-if="type==2" style="margin-left: 30upx;color: red;">{{item.price}}积分</text>
					</view>
				</view>
			</view>
			<view class="cu-form-group">
				<view v-if="type==1||type==3" class="title">总价</view>
				<view v-if="type==2" class="title">总积分</view>
				<view>
					<text v-if="type==1||type==3">￥{{total}}</text>
					<text v-if="type==2">{{total}}积分</text>
				</view>
			</view>
            <view class="cu-form-group">
                备注
                <input v-model="remark" name="remark" style="margin-left: 30upx; border-bottom: 1px solid #999999; height: 60upx; font-size: 28rpx;"></input>
            </view>
		</form>
		<view class="padding" style="text-align: center;">
			<button  v-if="type==1" @tap="onSubmitTap()" class="bg-red lg">确认支付</button>
			<button  v-if="type==2" @tap="onSubmitTap()" class="bg-red lg">确认兑换</button>
			<button  v-if="type==3" @tap="onGroupSubmitTap()" class="bg-red lg">确认支付</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				user: {},
				orderGoods: {},
				address: {},
				total: 0,
				type: 1,
				seat: 0,
                remark:'',
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onLoad(options) {
			this.type = options.type
			this.seat = options.seat
			// 获取订单信息，座位信息
			this.orderGoods = uni.getStorageSync('orderGoods');
			if (this.seat != 1) {
				for (let i = 0; i < this.orderGoods.length; i++) {
					if(this.total==0) {
						this.total = parseFloat(this.orderGoods[i].price) * this.orderGoods[i].buynumber
					} else {
						this.total = parseFloat(this.total) + parseFloat(this.orderGoods[i].price) * this.orderGoods[i].buynumber	
					}
				}
			}else{
				this.total = parseFloat(this.orderGoods[0].total)
				this.address = this.orderGoods[0].address
			}
			this.total= this.total.toFixed(2)
		},
		async onShow() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table)
			this.user = res.data
			if(this.seat!=1){
				let address = uni.getStorageSync('address')
				if(address&&this.user.id==address.userid){
					this.address = uni.getStorageSync('address');
				}else{
					res = await this.$api.defaultAddress(this.user.id);
					this.address = res.data
				}
			}
			
		},
		methods: {
			async onSubmitTap() {
				let _this = this;
				if(_this.seat!=1&&!_this.address){
					_this.$utils.msg(`请选择地址`);		
					return;
				}
				let table = uni.getStorageSync("nowTable");
				uni.showModal({
					title: '提示',
					content: '是否确认支付',
					success: async function(res) {
						if (res.confirm) {
							// 订单类型
							let type = _this.type;
							let isSuccess = true ;
							let orderStatus = 'Paid';
                            if(type==1){
								if (_this.user.money - _this.total < 0) {
									_this.$utils.msg('余额不足，请先充值');
									isSuccess = false;
									orderStatus = 'Unpaid';
								}
							}else if(type==2){
								if (_this.user.jf - _this.total < 0) {
									_this.$utils.msg('积分不足，兑换商品失败');
									isSuccess = false;
									return;
								}
							}
							for (let i = 0; i < _this.orderGoods.length; i++) {
								// 如果有限次模块 ，则减少商品的Inventory信息，不够则提示Inventory不足
                                // 当前商品是否相同表
                                if(_this.orderGoods[i].tablename == `zuqiuzhoubian`){
                                     // 获取Remaining 
                                     let res = await _this.$api.info('zuqiuzhoubian', _this.orderGoods[i].goodid);
                                     // 单次限次
                                     if(res.data.onelimittimes>0){
                                        // 超过单次限次购买Remaining
                                        if(_this.orderGoods[i].buynumber>res.data.onelimittimes){
                                             _this.$utils.msg(`${_this.orderGoods[i].goodname}超过可购买Remaining`);
                                            isSuccess = false
											break;
                                        }
                                     }
                                     // 如果Inventory小于当前购买Remaining
                                     if(res.data.alllimittimes<_this.orderGoods[i].buynumber){
                                        _this.$utils.msg(`${_this.orderGoods[i].goodname}已售罄`);
										isSuccess = false
                                        break;
                                     }else{
                                         if(_this.seat!=1){
                                            res.data.alllimittimes = res.data.alllimittimes - _this.orderGoods[i].buynumber;
                                         }else{
                                            res.data.selected =  res.data.selected  + "," + _this.orderGoods[i].activeSeat
                                         }
                                         if(isSuccess){
                                             // Inventory充足则减少InventoryRemaining
                                             await _this.$api.update(`zuqiuzhoubian`,  res.data);
                                         }
                                     }
                                }
								let order =  {
									orderid: _this.$utils.genTradeNo(),
									tablename: _this.orderGoods[i].tablename,
									userid: _this.user.id,
									goodid: _this.orderGoods[i].goodid,
									goodname: _this.orderGoods[i].goodname,
									picture: _this.orderGoods[i].picture,
									buynumber: _this.orderGoods[i].buynumber,
									discountprice: _this.orderGoods[i].price,
									price: _this.orderGoods[i].price,
									total: _this.orderGoods[i].price * _this.orderGoods[i].buynumber,
									discounttotal: _this.orderGoods[i].price * _this.orderGoods[i].buynumber,
									type: type,
                                    remark: _this.remark,
									address: _this.address.address,
									tel: _this.address.phone,
									consignee: _this.address.name,
									status: orderStatus
								}
								if(_this.seat == 1){
									order['address'] = _this.address;
									let buynumber = _this.address.split(",").length;
									order['buynumber'] = buynumber;
									order['total'] = _this.orderGoods[i].price * buynumber;
									order['discounttotal'] = _this.orderGoods[i].price * buynumber;
								}
                                // 添加订单
                                await _this.$api.add('orders', order);
								if (_this.orderGoods[i].id) {
									// 删除Cart对应的模块
									await _this.$api.del('cart', JSON.stringify([_this.orderGoods[i].id]))
									uni.removeStorageSync(`cart${_this.orderGoods[i].goodid}${_this.user.id}`)
								}
							}
							if(isSuccess){
								if(type==1){
									_this.$utils.msgBack('支付成功');
									// 减少余额
									_this.user.money = _this.user.money - _this.total;
									if(_this.user.jf||_this.user.jf==0){
										_this.user.jf = parseFloat(_this.user.jf) + parseFloat(_this.total);
									}
									await _this.$api.update(table, _this.user);
								}else if(type==2){
									_this.$utils.msgBack('兑换成功');
									// 减少积分
									_this.user.jf = _this.user.jf - _this.total;
									await _this.$api.update(table, _this.user);
								}
							}
						}
					}
				});
			},
			async onGroupSubmitTap() {
				let _this = this;
				if(!_this.address){
					_this.$utils.msg(`请选择地址`);		
					return;
				}
				let table = uni.getStorageSync("nowTable");
				uni.showModal({
					title: '提示',
					content: '是否确认支付',
					success: async function(res) {
						if (res.confirm) {
							// 订单类型
							let type = _this.type;
							let isSuccess = true ;
                            if (_this.user.money - _this.total < 0) {
                                _this.$utils.msg('余额不足，请先充值');
                                isSuccess = false;
                                return;
                            }
                            let peopleNum = 0;
                            let groupNo = '';
							for (let i = 0; i < _this.orderGoods.length; i++) {
								// 如果有限次模块 ，则减少商品的Inventory信息，不够则提示Inventory不足
                                // 当前商品是否相同表
                                if(_this.orderGoods[i].tablename == `zuqiuzhoubian`){
                                     // 获取Remaining 
                                     let res = await _this.$api.info('zuqiuzhoubian', _this.orderGoods[i].goodid);
                                     //团购人数
                                     peopleNum = res.data.curpeople;
                                     res.data.curpeople = Number(res.data.curpeople)+1
                                     if(res.data.curpeople>=res.data.grouppeople) {
                                         groupNo = _this.$utils.genTradeNo()
                                         //重置拼团人数
                                         res.data.curpeople = 0;
                                     }
                                     if(isSuccess){
                                         await _this.$api.update(`zuqiuzhoubian`,  res.data);
                                     }
                                }
								let order =  {
									orderid: _this.$utils.genTradeNo(),
									tablename: _this.orderGoods[i].tablename,
									userid: _this.user.id,
									goodid: _this.orderGoods[i].goodid,
									goodname: _this.orderGoods[i].goodname,
									picture: _this.orderGoods[i].picture,
									buynumber: _this.orderGoods[i].buynumber,
									price: _this.orderGoods[i].price,
									total: _this.orderGoods[i].price * _this.orderGoods[i].buynumber,
									type: type,
									address: _this.address.address,
									tel: _this.address.phone,
									consignee: _this.address.name,
									status: 'Group'
								}
                                // 添加订单
                                await _this.$api.add('orders', order);
                                if(groupNo) {
                                    order.groupno = groupNo
                                    await _this.$api.update('orders', order);
                                }
							}
							if(isSuccess){
                                if(groupNo) {
                                        _this.$utils.msgBack('拼团成功啦');
                                } else {
                                    if(peopleNum==0) {
                                        _this.$utils.msgBack('开团成功');
                                    } else {
                                        _this.$utils.msgBack('参团成功');
                                    }
                                }
                                // 减少余额
                                _this.user.money = _this.user.money - _this.total;
                                if(_this.user.jf||_this.user.jf==0){
                                    _this.user.jf = parseFloat(_this.user.jf) + parseFloat(_this.total);
                                }
                                await _this.$api.update(table, _this.user);
							}
						}
					}
				});
			},
			onAddressTap() {
				this.$utils.jump('../shop-address/shop-address');
			}
		}
	}
</script>

<style lang="scss">
	.avator {
		width: 150upx;
		height: 150upx;
		margin: 20upx 0;
	}
</style>
