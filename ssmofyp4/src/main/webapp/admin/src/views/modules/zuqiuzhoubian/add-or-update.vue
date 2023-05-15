<template>
	<div class="addEdit-block" style="width: 100%;">
		<el-form
			:style='{"padding":"30px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3020)","margin":"-30px 0 0 0","borderRadius":"0","flexWrap":"wrap","background":"#fff","display":"flex"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="120px"
		>
			<template >
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'" label="商品编号" prop="shangpinbianhao">
					<el-input v-model="ruleForm.shangpinbianhao" placeholder="商品编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-else-if="ruleForm.shangpinbianhao" label="商品编号" prop="shangpinbianhao">
					<el-input v-model="ruleForm.shangpinbianhao" placeholder="商品编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Name" prop="shangpinmingcheng">
					<el-input v-model="ruleForm.shangpinmingcheng" placeholder="Name" clearable  :readonly="ro.shangpinmingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Name" prop="shangpinmingcheng">
					<el-input v-model="ruleForm.shangpinmingcheng" placeholder="Name" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="upload" v-if="type!='info' && !ro.shangpinfengmian" label="Cover" prop="shangpinfengmian">
					<file-upload
						tip="点击上传Cover"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.shangpinfengmian?ruleForm.shangpinfengmian:''"
						@change="shangpinfengmianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="upload" v-else-if="ruleForm.shangpinfengmian" label="Cover" prop="shangpinfengmian">
					<img class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.shangpinfengmian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="商品分类" prop="shangpinfenlei">
					<el-input v-model="ruleForm.shangpinfenlei" placeholder="商品分类" clearable  :readonly="ro.shangpinfenlei"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="商品分类" prop="shangpinfenlei">
					<el-input v-model="ruleForm.shangpinfenlei" placeholder="商品分类" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Brand" prop="pinpai">
					<el-input v-model="ruleForm.pinpai" placeholder="Brand" clearable  :readonly="ro.pinpai"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Brand" prop="pinpai">
					<el-input v-model="ruleForm.pinpai" placeholder="Brand" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Size" prop="guige">
					<el-input v-model="ruleForm.guige" placeholder="Size" clearable  :readonly="ro.guige"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Size" prop="guige">
					<el-input v-model="ruleForm.guige" placeholder="Size" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Limit" prop="onelimittimes">
					<el-input v-model="ruleForm.onelimittimes" placeholder="Limit" clearable  :readonly="ro.onelimittimes"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Limit" prop="onelimittimes">
					<el-input v-model="ruleForm.onelimittimes" placeholder="Limit" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Remaining" prop="alllimittimes">
					<el-input v-model="ruleForm.alllimittimes" placeholder="Remaining" clearable  :readonly="ro.alllimittimes"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Remaining" prop="alllimittimes">
					<el-input v-model="ruleForm.alllimittimes" placeholder="Remaining" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Price" prop="price">
					<el-input v-model="ruleForm.price" placeholder="Price" clearable  :readonly="ro.price"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Price" prop="price">
					<el-input v-model="ruleForm.price" placeholder="Price" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Group Price" prop="groupprice">
					<el-input v-model="ruleForm.groupprice" placeholder="Group Price" clearable  :readonly="ro.groupprice"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Group Price" prop="groupprice">
					<el-input v-model="ruleForm.groupprice" placeholder="Group Price" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Group number" prop="grouppeople">
					<el-input v-model="ruleForm.grouppeople" placeholder="Group number" clearable  :readonly="ro.grouppeople"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Group number" prop="grouppeople">
					<el-input v-model="ruleForm.grouppeople" placeholder="Group number" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Current Number" prop="curpeople">
					<el-input v-model="ruleForm.curpeople" placeholder="Current Number" clearable  :readonly="ro.curpeople"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Current Number" prop="curpeople">
					<el-input v-model="ruleForm.curpeople" placeholder="Current Number" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-if="type!='info'"  label="Details" prop="chanpinxiangqing">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.chanpinxiangqing" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else-if="ruleForm.chanpinxiangqing" label="Details" prop="chanpinxiangqing">
                    <span :style='{"fontSize":"14px","lineHeight":"40px","color":"#000","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.chanpinxiangqing"></span>
                </el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0"}' class="btn">
				<el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"#000","borderRadius":"0","background":"#CFD5F8","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">submit</el-button>
				<el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#000","borderRadius":"0","background":"#CFD5F8","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="type!='info'" class="btn-close" @click="back()">cancel</el-button>
				<el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#000","borderRadius":"0","background":"#CFD5F8","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="type=='info'" class="btn-close" @click="back()">Return</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URLAddress"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的Contact号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱Address"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				shangpinbianhao : false,
				shangpinmingcheng : false,
				shangpinfengmian : false,
				shangpinfenlei : false,
				pinpai : false,
				guige : false,
				chanpinxiangqing : false,
				onelimittimes : false,
				alllimittimes : false,
				clicktime : false,
				clicknum : false,
				price : false,
				groupprice : false,
				grouppeople : false,
				curpeople : false,
			},
			
			
			ruleForm: {
				shangpinbianhao: this.getUUID(),
				shangpinmingcheng: '',
				shangpinfengmian: '',
				shangpinfenlei: '',
				pinpai: '',
				guige: '',
				chanpinxiangqing: '',
				onelimittimes: '-1',
				alllimittimes: '-1',
				clicktime: '',
				price: '',
			},
		
			
			rules: {
				shangpinbianhao: [
				],
				shangpinmingcheng: [
				],
				shangpinfengmian: [
				],
				shangpinfenlei: [
				],
				pinpai: [
				],
				guige: [
				],
				chanpinxiangqing: [
				],
				onelimittimes: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				alllimittimes: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				clicktime: [
				],
				clicknum: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				price: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				groupprice: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				grouppeople: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				curpeople: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
	created() {
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='shangpinbianhao'){
							this.ruleForm.shangpinbianhao = obj[o];
							this.ro.shangpinbianhao = true;
							continue;
						}
						if(o=='shangpinmingcheng'){
							this.ruleForm.shangpinmingcheng = obj[o];
							this.ro.shangpinmingcheng = true;
							continue;
						}
						if(o=='shangpinfengmian'){
							this.ruleForm.shangpinfengmian = obj[o];
							this.ro.shangpinfengmian = true;
							continue;
						}
						if(o=='shangpinfenlei'){
							this.ruleForm.shangpinfenlei = obj[o];
							this.ro.shangpinfenlei = true;
							continue;
						}
						if(o=='pinpai'){
							this.ruleForm.pinpai = obj[o];
							this.ro.pinpai = true;
							continue;
						}
						if(o=='guige'){
							this.ruleForm.guige = obj[o];
							this.ro.guige = true;
							continue;
						}
						if(o=='chanpinxiangqing'){
							this.ruleForm.chanpinxiangqing = obj[o];
							this.ro.chanpinxiangqing = true;
							continue;
						}
						if(o=='onelimittimes'){
							this.ruleForm.onelimittimes = obj[o];
							this.ro.onelimittimes = true;
							continue;
						}
						if(o=='alllimittimes'){
							this.ruleForm.alllimittimes = obj[o];
							this.ro.alllimittimes = true;
							continue;
						}
						if(o=='clicktime'){
							this.ruleForm.clicktime = obj[o];
							this.ro.clicktime = true;
							continue;
						}
						if(o=='clicknum'){
							this.ruleForm.clicknum = obj[o];
							this.ro.clicknum = true;
							continue;
						}
						if(o=='price'){
							this.ruleForm.price = obj[o];
							this.ro.price = true;
							continue;
						}
						if(o=='groupprice'){
							this.ruleForm.groupprice = obj[o];
							this.ro.groupprice = true;
							continue;
						}
						if(o=='grouppeople'){
							this.ruleForm.grouppeople = obj[o];
							this.ro.grouppeople = true;
							continue;
						}
						if(o=='curpeople'){
							this.ruleForm.curpeople = obj[o];
							this.ro.curpeople = true;
							continue;
						}
				}
				








				this.ruleForm.onelimittimes='-1'

				this.ruleForm.alllimittimes='-1'






			}
			
			
			// 获取User信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
				} else {
					this.$message.error(data.msg);
				}
			});
			
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `zuqiuzhoubian/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传Image后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
	this.ruleForm.chanpinxiangqing = this.ruleForm.chanpinxiangqing.replace(reg,'../../../ssmofyp4/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // submit
    onSubmit() {






	if(this.ruleForm.shangpinfengmian!=null) {
		this.ruleForm.shangpinfengmian = this.ruleForm.shangpinfengmian.replace(new RegExp(this.$base.url,"g"),"");
	}

























var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "zuqiuzhoubian/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `zuqiuzhoubian/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "Operation成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.zuqiuzhoubianCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `zuqiuzhoubian/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "Operation成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.zuqiuzhoubianCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // Return
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.zuqiuzhoubianCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    shangpinfengmianUploadChange(fileUrls) {
	this.ruleForm.shangpinfengmian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: #000;
	  	  font-weight: 500;
	  	  width: 120px;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: left;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 0;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 0;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 0;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 1px dashed #797979;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #797979;
	  	  width: 90px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 1px dashed #797979;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #797979;
	  	  width: 90px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 1px dashed #797979;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #797979;
	  	  width: 90px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 0;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 120px;
	  	}
</style>
