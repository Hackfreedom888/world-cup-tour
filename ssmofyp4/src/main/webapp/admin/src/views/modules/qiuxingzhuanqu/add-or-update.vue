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
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Name" prop="qiuyuanxingming">
					<el-input v-model="ruleForm.qiuyuanxingming" placeholder="Name" clearable  :readonly="ro.qiuyuanxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Name" prop="qiuyuanxingming">
					<el-input v-model="ruleForm.qiuyuanxingming" placeholder="Name" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="upload" v-if="type!='info' && !ro.touxiang" label="Image" prop="touxiang">
					<file-upload
						tip="点击上传Image"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
						@change="touxiangUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="upload" v-else-if="ruleForm.touxiang" label="Image" prop="touxiang">
					<img class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.touxiang.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="upload" v-if="type!='info'&& !ro.gerenjijin" label="Highlight" prop="gerenjijin">
					<file-upload
						tip="点击上传Highlight"
						action="file/upload"
						:limit="1"
						:multiple="true"
						:fileUrls="ruleForm.gerenjijin?ruleForm.gerenjijin:''"
						@change="gerenjijinUploadChange"
					></file-upload>
				</el-form-item> 
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else-if="ruleForm.gerenjijin" label="Highlight" prop="gerenjijin">
					<el-button :style='{"border":"0","cursor":"pointer","padding":"0 25px","margin":"0 20px 0 0","outline":"none","color":"#000","borderRadius":"0","background":"#CFD5F8","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="text" size="small" @click="download($base.url+ruleForm.gerenjijin)">预览</el-button>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else-if="!ruleForm.gerenjijin" label="Highlight" prop="gerenjijin">
					<el-button :style='{"border":"0","cursor":"pointer","padding":"0 25px","margin":"0 20px 0 0","outline":"none","color":"#000","borderRadius":"0","background":"#CFD5F8","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="text" size="small">无</el-button>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Jersey number" prop="qiuyihaoma">
					<el-input v-model="ruleForm.qiuyihaoma" placeholder="Jersey number" clearable  :readonly="ro.qiuyihaoma"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Jersey number" prop="qiuyihaoma">
					<el-input v-model="ruleForm.qiuyihaoma" placeholder="Jersey number" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="select" v-if="type!='info'"  label="Position" prop="qiuchangweizhi">
					<el-select :disabled="ro.qiuchangweizhi" v-model="ruleForm.qiuchangweizhi" placeholder="请选择Position" >
						<el-option
							v-for="(item,index) in qiuchangweizhiOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Position" prop="qiuchangweizhi">
					<el-input v-model="ruleForm.qiuchangweizhi"
						placeholder="Position" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="select" v-if="type!='info'"  label="Team" prop="suoshuqiudui">
					<el-select :disabled="ro.suoshuqiudui" v-model="ruleForm.suoshuqiudui" placeholder="请选择Team" >
						<el-option
							v-for="(item,index) in suoshuqiuduiOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Team" prop="suoshuqiudui">
					<el-input v-model="ruleForm.suoshuqiudui"
						placeholder="Team" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Height" prop="shengao">
					<el-input v-model="ruleForm.shengao" placeholder="Height" clearable  :readonly="ro.shengao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Height" prop="shengao">
					<el-input v-model="ruleForm.shengao" placeholder="Height" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Weight" prop="tizhong">
					<el-input v-model="ruleForm.tizhong" placeholder="Weight" clearable  :readonly="ro.tizhong"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Weight" prop="tizhong">
					<el-input v-model="ruleForm.tizhong" placeholder="Weight" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="date" v-if="type!='info'" label="Birthday" prop="shengri">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.shengri" 
						type="date"
						:readonly="ro.shengri"
						placeholder="Birthday"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-else-if="ruleForm.shengri" label="Birthday" prop="shengri">
					<el-input v-model="ruleForm.shengri" placeholder="Birthday" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Age" prop="nianling">
					<el-input v-model="ruleForm.nianling" placeholder="Age" clearable  :readonly="ro.nianling"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Age" prop="nianling">
					<el-input v-model="ruleForm.nianling" placeholder="Age" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-if="type!='info'"  label="Background" prop="qiuyuanlvli">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.qiuyuanlvli" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else-if="ruleForm.qiuyuanlvli" label="Background" prop="qiuyuanlvli">
                    <span :style='{"fontSize":"14px","lineHeight":"40px","color":"#000","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.qiuyuanlvli"></span>
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
				qiuyuanxingming : false,
				touxiang : false,
				gerenjijin : false,
				qiuyihaoma : false,
				qiuchangweizhi : false,
				suoshuqiudui : false,
				shengao : false,
				tizhong : false,
				shengri : false,
				nianling : false,
				qiuyuanlvli : false,
			},
			
			
			ruleForm: {
				qiuyuanxingming: '',
				touxiang: '',
				gerenjijin: '',
				qiuyihaoma: '',
				qiuchangweizhi: '',
				suoshuqiudui: '',
				shengao: '',
				tizhong: '',
				shengri: '',
				nianling: '',
				qiuyuanlvli: '',
			},
		
			qiuchangweizhiOptions: [],
			suoshuqiuduiOptions: [],
			
			rules: {
				qiuyuanxingming: [
				],
				touxiang: [
				],
				gerenjijin: [
				],
				qiuyihaoma: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				qiuchangweizhi: [
				],
				suoshuqiudui: [
				],
				shengao: [
				],
				tizhong: [
				],
				shengri: [
				],
				nianling: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				qiuyuanlvli: [
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
						if(o=='qiuyuanxingming'){
							this.ruleForm.qiuyuanxingming = obj[o];
							this.ro.qiuyuanxingming = true;
							continue;
						}
						if(o=='touxiang'){
							this.ruleForm.touxiang = obj[o];
							this.ro.touxiang = true;
							continue;
						}
						if(o=='gerenjijin'){
							this.ruleForm.gerenjijin = obj[o];
							this.ro.gerenjijin = true;
							continue;
						}
						if(o=='qiuyihaoma'){
							this.ruleForm.qiuyihaoma = obj[o];
							this.ro.qiuyihaoma = true;
							continue;
						}
						if(o=='qiuchangweizhi'){
							this.ruleForm.qiuchangweizhi = obj[o];
							this.ro.qiuchangweizhi = true;
							continue;
						}
						if(o=='suoshuqiudui'){
							this.ruleForm.suoshuqiudui = obj[o];
							this.ro.suoshuqiudui = true;
							continue;
						}
						if(o=='shengao'){
							this.ruleForm.shengao = obj[o];
							this.ro.shengao = true;
							continue;
						}
						if(o=='tizhong'){
							this.ruleForm.tizhong = obj[o];
							this.ro.tizhong = true;
							continue;
						}
						if(o=='shengri'){
							this.ruleForm.shengri = obj[o];
							this.ro.shengri = true;
							continue;
						}
						if(o=='nianling'){
							this.ruleForm.nianling = obj[o];
							this.ro.nianling = true;
							continue;
						}
						if(o=='qiuyuanlvli'){
							this.ruleForm.qiuyuanlvli = obj[o];
							this.ro.qiuyuanlvli = true;
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
			
            this.qiuchangweizhiOptions = "Center,Forward,边锋,前腰,前卫,后腰,门将".split(',')
            this.$http({
				url: `option/qiuduizhuanqu/qiuduimingcheng`,
				method: "get"
            }).then(({ data }) => {
				if (data && data.code === 0) {
					this.suoshuqiuduiOptions = data.data;
				} else {
					this.$message.error(data.msg);
				}
            });
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `qiuxingzhuanqu/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传Image后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
	this.ruleForm.qiuyuanlvli = this.ruleForm.qiuyuanlvli.replace(reg,'../../../ssmofyp4/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // submit
    onSubmit() {




	if(this.ruleForm.touxiang!=null) {
		this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
	}


	if(this.ruleForm.gerenjijin!=null) {
		this.ruleForm.gerenjijin = this.ruleForm.gerenjijin.replace(new RegExp(this.$base.url,"g"),"");
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
				url: "qiuxingzhuanqu/page", 
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
					   url: `qiuxingzhuanqu/${!this.ruleForm.id ? "save" : "update"}`,
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
						 this.parent.qiuxingzhuanquCrossAddOrUpdateFlag = false;
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
			   url: `qiuxingzhuanqu/${!this.ruleForm.id ? "save" : "update"}`,
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
				 this.parent.qiuxingzhuanquCrossAddOrUpdateFlag = false;
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
      this.parent.qiuxingzhuanquCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    touxiangUploadChange(fileUrls) {
	this.ruleForm.touxiang = fileUrls;
    },
    gerenjijinUploadChange(fileUrls) {
	this.ruleForm.gerenjijin = fileUrls;
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
