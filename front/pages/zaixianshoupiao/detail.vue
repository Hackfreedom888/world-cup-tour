<template>
<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback">
	<view class="content">
		<view class="container" :style='{"width":"100%","padding":"0","position":"relative","background":"url(http://codegen.caihongy.cn/20221108/581bb1956ffe4c8182127ca1e196e95e.png) fixed","height":"auto"}'>
						<swiper :style='{"width":"100%","background":"#fff","height":"360rpx"}' class="swiper" :indicator-dots='false' :autoplay='true' :circular='false' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='5000' :vertical='false'>
				<swiper-item :style='{"width":"100%","background":"none","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index">
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"360rpx"}' mode="aspectFill" v-if="swiper.substring(0,4)=='http'" :src="swiper"></image>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"360rpx"}' mode="aspectFill" v-else :src="baseUrl+swiper"></image>
				</swiper-item>
			</swiper>
									            <view :style='{"width":"100%","padding":"24rpx","background":"none","height":"auto"}' class="detail-content">
				<view :style='{"boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 16rpx 0","borderColor":"#ccc","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"space-between","height":"auto"}' class="detail-list-item price">
					<view :style='{"padding":"0 0 0 24rpx","display":"flex"}' class="text">
						<text :style='{"color":"red","lineHeight":"80rpx","fontSize":"48rpx"}'>￥</text>
						<text :style='{"color":"red","lineHeight":"80rpx","fontSize":"32rpx"}'>{{detail.price}}</text>
					</view>
				</view>

				<view :style='{"boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 16rpx 0","borderColor":"#ccc","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="lable">Name：</view>
					<view :style='{"padding":"0px","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)"}' class="text">{{detail.qiupiaomingcheng}}</view>
				</view>

				<view class="detail-list-item" :style='{"boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 16rpx 0","borderColor":"#ccc","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>Number：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)"}'>{{detail.changcibianhao}}</view>
				</view>
				<view class="detail-list-item" :style='{"boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 16rpx 0","borderColor":"#ccc","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>Home：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)"}'>{{detail.zhuchangqiudui}}</view>
				</view>
				<view class="detail-list-item" :style='{"boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 16rpx 0","borderColor":"#ccc","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>Away：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)"}'>{{detail.kechangqiudui}}</view>
				</view>
				<view class="detail-list-item" :style='{"boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 16rpx 0","borderColor":"#ccc","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>Venue：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)"}'>{{detail.bisaididian}}</view>
				</view>
				<view class="detail-list-item" :style='{"boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 16rpx 0","borderColor":"#ccc","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>Time：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)"}'>{{detail.bisaishijian}}</view>
				</view>
				<view class="detail-list-item" :style='{"boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 16rpx 0","borderColor":"#ccc","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>Seats：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)"}'>{{detail.number}}</view>
				</view>



				<view class="detail-list-item rich" :style='{"margin":"0 0 24rpx 0","borderColor":"#ccc","borderWidth":"0 0 0px 0","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>Introduction</view>
					<view class="rich-text" :style='{"border":"2rpx solid #ccc","minHeight":"240rpx","padding":"20rpx","boxShadow":"0px 0.10rpx 2rpx #ccc","margin":"0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","width":"calc(100% - 160rpx)","lineHeight":"1.5"}'>
						<rich-text :nodes="detail.saishijieshao"></rich-text>
					</view>
				</view>

				<view class="seat-list">
					<view v-for="(item,index) in numberList " v-bind:key="index" class="seat-item">
						<image @tap="$utils.msg('该座位已被预定')" v-if="selectStr.indexOf(item)>=0" class="seat-icon"
							src="../../static/restaurant-detail/select.png" mode=""></image>
							<image @tap="unselectSeat(index+1)" v-else-if="activeSeat.indexOf('#'+item.replace('号','')+'#')>=0" class="seat-icon"
							src="../../static/restaurant-detail/select.png" mode=""></image>
						<image @tap="selectSeat(index+1)" v-else class="seat-icon" src="../../static/restaurant-detail/unselect.png" mode=""></image>
						<text>{{item}}</text>
					</view>
				</view>
				

				<view class="time-content" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","height":"auto"}'>
					<view class="comoment-header" :style='{"boxShadow":"rgb(0 0 0 / 20%) 0px 4rpx 8rpx","margin":"0 0 32rpx","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
						<view :style='{"padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333"}'>Comment</view>
						<view :style='{"padding":"0 20rpx","background":"#a9a7e5","display":"flex"}' @click="onCommentTap" class="btn-comment-content" style="display: flex;align-items: center;">
							<view :style='{"margin":"0 8rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#fff"}' class="cuIcon-add"></view>
							<view :style='{"color":"#fff","lineHeight":"80rpx","fontSize":"28rpx"}'>Add Comment</view>
						</view>
					</view>

					<view :style='{"width":"100%","boxShadow":"0 4rpx 6rpx rgb(0 0 0 / 20%)","padding":"24rpx","margin":"32rpx 0 32rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","height":"auto"}' v-for="(item,index) in commentList" v-bind:key="index" class="cu-item comment-item">
						<view :style='{"width":"100%","display":"flex","height":"auto"}'>
							<image :style='{"width":"60rpx","margin":"0 8rpx 0 0","borderRadius":"100%","display":"block","height":"60rpx"}' v-if="item.avatarurl" mode="aspectFill" :src="baseUrl+item.avatarurl"></image>
							<view :style='{"color":"#333","lineHeight":"60rpx","fontSize":"28rpx"}' class="text-grey">{{item.nickname}}</view>
						</view>
						<view :style='{"margin":"8rpx 0","lineHeight":"1.5","fontSize":"28rpx","color":"#666"}' class="text-gray text-content text-df">
							{{item.content}}
						</view>
						<view :style='{"color":"#999","lineHeight":"24rpx","fontSize":"24rpx"}' class="margin-top-sm text-gray text-df">{{item.addtime}}</view>
						<view v-if="item.reply" :style='{"margin":"8rpx 0","lineHeight":"1.5","fontSize":"28rpx","color":"#666"}' class="text-gray text-content text-df">
							回复:{{item.reply}}
						</view>
					</view>
				</view>
				<view class="bottom-content bg-white tabbar border shop" :style='{"width":"100%","padding":"10rpx 24rpx","flexWrap":"wrap","background":"rebeccapurple","display":"flex","height":"auto"}'>
				
					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","color":"rgb(255, 255, 255)","background":"brown","width":"auto","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="btn-submit cu-btn round bg-red">预定</button>
				</view>
			</view>
		</view>
	</view>
</mescroll-uni>
</template>

<script>
	export default {
		data() {
			return {
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				id: '',
				detail: {},
				swiperList: [],
				commentList: [],
				mescroll: null, //mescroll实例对象
				downOption: {
					auto: false //是否在初始化后,自动执行下拉回调callback; 默认true
				},
				upOption: {
					noMoreSize: 3, //如果列表已无数据,可设置列表的总Remaining要大于半页才显示无更多数据;避免列表数据过少(比如只有一条数据),显示无更多数据会不好看; 默认5
					textNoMore: '~ No more ~',
				},
				hasNext: true,
				user: {},
				numberList: [],
				selectStr: '',
				activeSeat: '',
				sfshIndex: -1,
				sfshOptions: ['通过','不通过', '待审核'],
				count: 0,
				timer: null
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
			SecondToDate: function() {
				var time = this.count;
				if (null != time && "" != time) {
					if (time > 60 && time < 60 * 60) {
						time =
							parseInt(time / 60.0) +
							"分钟" +
							parseInt((parseFloat(time / 60.0) - parseInt(time / 60.0)) * 60) +
							"秒";
					} else if (time >= 60 * 60 && time < 60 * 60 * 24) {
						time =
							parseInt(time / 3600.0) +
							"小时" +
							parseInt(
								(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
							) +
							"分钟" +
							parseInt(
								(parseFloat(
										(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
									) -
									parseInt(
										(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
									)) *
								60
							) +
							"秒";
					} else if (time >= 60 * 60 * 24) {
						time =
							parseInt(time / 3600.0 / 24) +
							"天" +
							parseInt(
								(parseFloat(time / 3600.0 / 24) - parseInt(time / 3600.0 / 24)) *
								24
							) +
							"小时" +
							parseInt(
								(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
							) +
							"分钟" +
							parseInt(
								(parseFloat(
										(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
									) -
									parseInt(
										(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
									)) *
								60
							) +
							"秒";
					} else {
						time = parseInt(time) + "秒";
					}
				}
				return time;
			}
		},
		async onLoad(options) {
			this.id = options.id;
			// 渲染数据
			this.init();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
            this.hasNext = true
			// 重新加载数据
			if (this.mescroll) this.mescroll.resetUpScroll()
			this.btnColor = this.btnColor.sort(()=> {
				return (0.5-Math.random());
			});
		},
		async onShow() {
			//更新座位
			if(Object.keys(this.detail).length!=0) {
				this.$api.update('zaixianshoupiao', this.detail);
			}
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
		},
		methods: {
			// 支付
			onPayTap(){
				uni.setStorageSync('paytable','zaixianshoupiao');
				uni.setStorageSync('payObject',this.detail);
				this.$utils.jump('../pay-confirm/pay-confirm?type=1')
			},
			selectSeat(idx) {
				if(this.activeSeat=="") {
					this.activeSeat = "#" + `${idx}` + "#"
				} else {
					this.activeSeat = this.activeSeat + "," + "#" + `${idx}` + "#"
				}
			},
			unselectSeat(idx){
				let array = this.activeSeat.split(",");
				let newarray = [];
				for(let i=0;i<array.length;i++){
					if(array[i]!=("#"+idx+"#")){
						newarray.push(array[i]);
					}
				}
				this.activeSeat = newarray.join(",");
			},
			onSubmitTap() {
				let _this = this;
				if (!this.activeSeat) {
					this.$utils.msg('请选择要预定的座位');
					return
				}
				uni.showModal({
					title: '提示',
					content: '是否确认预定',
					success: async function(res) {
						if (res.confirm) {
							let activeSeatReplace=_this.activeSeat.replace(/#/g,"")
							if (_this.detail.selected) {
								_this.detail.selected = _this.detail.selected + "," + activeSeatReplace
							} else {
								_this.detail.selected = _this.detail.selected + activeSeatReplace
							}
							let data = {
								orderid: _this.$utils.genTradeNo(),
								tablename: 'zaixianshoupiao',
								userid: _this.user.id,
								goodid: _this.detail.id,
								goodname: _this.detail.qiupiaomingcheng,
								picture: _this.swiperList ? _this.swiperList[0] : "",
								buynumber: 1,
								discountprice: 0,
								total: 0,
								discounttotal: 0,
								type: 1,
								address: activeSeatReplace,
								activeSeat: activeSeatReplace,
								status: 'Paid',
								tablename: 'zaixianshoupiao',
								discountprice: _this.detail.vipprice
							}
							if (_this.detail.price) {
								data['status'] = 'Unpaid'
								data['price'] = _this.detail.price
								data['total'] = data['price'] * activeSeatReplace.split(",").length
								uni.setStorageSync('orderGoods', [data]);
								_this.$utils.jump('../shop-order-confirm/shop-order-confirm?seat=1&type=1');
							} else {
								data['price'] = 0
								await _this.$api.add('orders', data);
								await _this.$api.update('zaixianshoupiao', _this.detail);
								_this.$utils.msgBack('预定成功');
							}
						}
					}
				});
			},
            onDetailTap(item) {
                uni.setStorageSync("useridTag",this.userid);
                this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
            },
			// 收藏
			// 跨表
			onAcrossTap(tableName,statusColumnName,tips,statusColumnValue){
				uni.setStorageSync('crossTable','zaixianshoupiao');
				uni.setStorageSync(`crossObj`, this.detail);
				uni.setStorageSync(`statusColumnName`, statusColumnName);
				uni.setStorageSync(`statusColumnValue`, statusColumnValue);
				uni.setStorageSync(`tips`, tips);
				if(statusColumnName!=''&&!statusColumnName.startsWith("[")) {
					var obj = uni.getStorageSync('crossObj');
					for (var o in obj){
						if(o==statusColumnName && obj[o]==statusColumnValue){
							_this.$utils.msg(tips);
							return
						}
					}
				}
				this.$utils.jump(`../${tableName}/add-or-update?cross=true`);
			},
			// 获取详情
			async init(){
				let res = await this.$api.info('zaixianshoupiao', this.id);
				this.detail = res.data;
				// 轮播图片
				this.swiperList = this.detail.fengmian ? this.detail.fengmian.split(",") : [];
				for (let i = 1; i <= this.detail.number; i++) {
					this.numberList.push(`${i}号`);
				}
				if (this.detail.selected) {
					let selected = this.detail.selected.split(",");
					let selectList = []
					for (let i = 0; i < selected.length; i++) {
						selectList.push(`${selected[i]}号`);
					}
					this.selectStr = selectList.join(",")
				}
			},

			// mescroll组件初始化的回调,可获取到mescroll对象
			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},

			/*下拉刷新的回调 */
			downCallback(mescroll) {
				this.hasNext = true
				mescroll.resetUpScroll()
			},

			/*上拉加载的回调: mescroll携带page的参数, 其中num:当前页 从1开始, size:每页数据条数,默认10 */
			async upCallback(mescroll) {
                		let res = await this.$api.list('discusszaixianshoupiao', {
					page: mescroll.num,
					limit: 10,
					refid: this.id
				});
				// 如果是第一页数据置空
				if (mescroll.num == 1) this.commentList = [];
				this.commentList = this.commentList.concat(res.data.list);
				if (res.data.list.length == 0) this.hasNext = false;
				mescroll.endSuccess(mescroll.size, this.hasNext);

            },

			onChatTap() {
				this.$utils.jump('../chat/chat')
			},
			// 下载
			download(url){
				let _this = this;
				uni.downloadFile({
					url: _this.$base.url + 'file/download?fileName=' + url.replace('upload/',''),
					success: (res) => {
						if (res.statusCode === 200) {
							_this.$utils.msg('下载成功');
							 window.open(url);
						}
					}
				});
			},
			// Add Comment
			async onCommentTap() {
                                let params = {
                                        page: 1,
                                        limit: 1,
					status: 'Completed',
					goodid: this.detail.id
                                }
                                let res = await this.$api.page('orders', params);
                                if (res.data.list.length == 0) {
					this.$utils.msg('请完成订单后再Comment');
					return;
				}
				this.$utils.jump(`../discusszaixianshoupiao/add-or-update?refid=${this.id}`)
			},

		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	
	.seat-list {
		display: flex;
		align-items: center;
		flex-wrap: wrap;
		background: #FFFFFF;
		margin: 20upx;
		border-radius: 20upx;
		padding: 20upx;
		font-size: 30upx;
		.seat-item {
			width: 33.33%;
			display: flex;
			align-items: center;
			flex-direction: column;
			margin-bottom: 20upx;
	
			.seat-icon {
				width: 50upx;
				height: 50upx;
				margin-bottom: 10upx;
			}
		}
	}
	
	audio {
		display: flex;
		flex-direction: column;
	}
	
	.audio /deep/ .uni-audio-default {
		width: inherit;
	}
</style>

