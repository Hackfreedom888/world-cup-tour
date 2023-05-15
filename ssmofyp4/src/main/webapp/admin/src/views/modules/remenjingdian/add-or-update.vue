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
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Name" prop="jingdianmingcheng">
					<el-input v-model="ruleForm.jingdianmingcheng" placeholder="Name" clearable  :readonly="ro.jingdianmingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Name" prop="jingdianmingcheng">
					<el-input v-model="ruleForm.jingdianmingcheng" placeholder="Name" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="upload" v-if="type!='info' && !ro.tupian" label="Image" prop="tupian">
					<file-upload
						tip="点击上传Image"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.tupian?ruleForm.tupian:''"
						@change="tupianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="upload" v-else-if="ruleForm.tupian" label="Image" prop="tupian">
					<img class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.tupian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="select" v-if="type!='info'"  label="Level" prop="dengji">
					<el-select :disabled="ro.dengji" v-model="ruleForm.dengji" placeholder="请选择Level" >
						<el-option
							v-for="(item,index) in dengjiOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Level" prop="dengji">
					<el-input v-model="ruleForm.dengji"
						placeholder="Level" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="select" v-if="type!='info'"  label="Type" prop="jingdianleixing">
					<el-select :disabled="ro.jingdianleixing" v-model="ruleForm.jingdianleixing" placeholder="请选择Type" >
						<el-option
							v-for="(item,index) in jingdianleixingOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Type" prop="jingdianleixing">
					<el-input v-model="ruleForm.jingdianleixing"
						placeholder="Type" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Opening Time" prop="kaifangshijian">
					<el-input v-model="ruleForm.kaifangshijian" placeholder="Opening Time" clearable  :readonly="ro.kaifangshijian"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Opening Time" prop="kaifangshijian">
					<el-input v-model="ruleForm.kaifangshijian" placeholder="Opening Time" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Tickets Price" prop="menpiaojiage">
					<el-input v-model="ruleForm.menpiaojiage" placeholder="Tickets Price" clearable  :readonly="ro.menpiaojiage"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Tickets Price" prop="menpiaojiage">
					<el-input v-model="ruleForm.menpiaojiage" placeholder="Tickets Price" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Number" prop="shuliang">
					<el-input v-model="ruleForm.shuliang" placeholder="Number" clearable  :readonly="ro.shuliang"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Number" prop="shuliang">
					<el-input v-model="ruleForm.shuliang" placeholder="Number" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Location" prop="jingdianweizhi">
					<el-input v-model="ruleForm.jingdianweizhi" placeholder="Location" clearable  :readonly="ro.jingdianweizhi"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Location" prop="jingdianweizhi">
					<el-input v-model="ruleForm.jingdianweizhi" placeholder="Location" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="textarea" v-if="type!='info'" label="Notice" prop="goupiaoxuzhi">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="Notice"
					  v-model="ruleForm.goupiaoxuzhi" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else-if="ruleForm.goupiaoxuzhi" label="Notice" prop="goupiaoxuzhi">
					<span :style='{"fontSize":"14px","lineHeight":"40px","color":"#000","fontWeight":"500","display":"inline-block"}'>{{ruleForm.goupiaoxuzhi}}</span>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="textarea" v-if="type!='info'" label="Tips" prop="zhuyishixiang">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="Tips"
					  v-model="ruleForm.zhuyishixiang" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else-if="ruleForm.zhuyishixiang" label="Tips" prop="zhuyishixiang">
					<span :style='{"fontSize":"14px","lineHeight":"40px","color":"#000","fontWeight":"500","display":"inline-block"}'>{{ruleForm.zhuyishixiang}}</span>
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
				jingdianmingcheng : false,
				tupian : false,
				dengji : false,
				jingdianleixing : false,
				kaifangshijian : false,
				menpiaojiage : false,
				shuliang : false,
				jingdianweizhi : false,
				goupiaoxuzhi : false,
				zhuyishixiang : false,
				clicktime : false,
				clicknum : false,
			},
			
			
			ruleForm: {
				jingdianmingcheng: '',
				tupian: '',
				dengji: '',
				jingdianleixing: '',
				kaifangshijian: '',
				menpiaojiage: '',
				shuliang: '',
				jingdianweizhi: '',
				goupiaoxuzhi: '',
				zhuyishixiang: '',
				clicktime: '',
			},
		
			dengjiOptions: [],
			jingdianleixingOptions: [],
			
			rules: {
				jingdianmingcheng: [
					{ required: true, message: 'Name不能为空', trigger: 'blur' },
				],
				tupian: [
				],
				dengji: [
				],
				jingdianleixing: [
				],
				kaifangshijian: [
				],
				menpiaojiage: [
					{ required: true, message: 'Tickets Price不能为空', trigger: 'blur' },
					{ validator: validateNumber, trigger: 'blur' },
				],
				shuliang: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				jingdianweizhi: [
				],
				goupiaoxuzhi: [
				],
				zhuyishixiang: [
				],
				clicktime: [
				],
				clicknum: [
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
						if(o=='jingdianmingcheng'){
							this.ruleForm.jingdianmingcheng = obj[o];
							this.ro.jingdianmingcheng = true;
							continue;
						}
						if(o=='tupian'){
							this.ruleForm.tupian = obj[o];
							this.ro.tupian = true;
							continue;
						}
						if(o=='dengji'){
							this.ruleForm.dengji = obj[o];
							this.ro.dengji = true;
							continue;
						}
						if(o=='jingdianleixing'){
							this.ruleForm.jingdianleixing = obj[o];
							this.ro.jingdianleixing = true;
							continue;
						}
						if(o=='kaifangshijian'){
							this.ruleForm.kaifangshijian = obj[o];
							this.ro.kaifangshijian = true;
							continue;
						}
						if(o=='menpiaojiage'){
							this.ruleForm.menpiaojiage = obj[o];
							this.ro.menpiaojiage = true;
							continue;
						}
						if(o=='shuliang'){
							this.ruleForm.shuliang = obj[o];
							this.ro.shuliang = true;
							continue;
						}
						if(o=='jingdianweizhi'){
							this.ruleForm.jingdianweizhi = obj[o];
							this.ro.jingdianweizhi = true;
							continue;
						}
						if(o=='goupiaoxuzhi'){
							this.ruleForm.goupiaoxuzhi = obj[o];
							this.ro.goupiaoxuzhi = true;
							continue;
						}
						if(o=='zhuyishixiang'){
							this.ruleForm.zhuyishixiang = obj[o];
							this.ro.zhuyishixiang = true;
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
				}
				












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
			
            this.dengjiOptions = "One,two,Three,Four,Five".split(',')
            this.jingdianleixingOptions = "Ancient town,Scenic spots,Scenic spots,Performance".split(',')
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `remenjingdian/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传Image后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // submit
    onSubmit() {




	if(this.ruleForm.tupian!=null) {
		this.ruleForm.tupian = this.ruleForm.tupian.replace(new RegExp(this.$base.url,"g"),"");
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
				url: "remenjingdian/page", 
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
					   url: `remenjingdian/${!this.ruleForm.id ? "save" : "update"}`,
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
						 this.parent.remenjingdianCrossAddOrUpdateFlag = false;
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
			   url: `remenjingdian/${!this.ruleForm.id ? "save" : "update"}`,
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
				 this.parent.remenjingdianCrossAddOrUpdateFlag = false;
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
      this.parent.remenjingdianCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    tupianUploadChange(fileUrls) {
	this.ruleForm.tupian = fileUrls;
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
