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
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Name" prop="jiudianmingcheng">
					<el-input v-model="ruleForm.jiudianmingcheng" placeholder="Name" clearable  :readonly="ro.jiudianmingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Name" prop="jiudianmingcheng">
					<el-input v-model="ruleForm.jiudianmingcheng" placeholder="Name" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="upload" v-if="type!='info' && !ro.jiudiantupian" label="Image" prop="jiudiantupian">
					<file-upload
						tip="点击上传Image"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.jiudiantupian?ruleForm.jiudiantupian:''"
						@change="jiudiantupianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="upload" v-else-if="ruleForm.jiudiantupian" label="Image" prop="jiudiantupian">
					<img class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.jiudiantupian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="select" v-if="type!='info'"  label="Type" prop="leibie">
					<el-select :disabled="ro.leibie" v-model="ruleForm.leibie" placeholder="请选择Type" >
						<el-option
							v-for="(item,index) in leibieOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Type" prop="leibie">
					<el-input v-model="ruleForm.leibie"
						placeholder="Type" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="select" v-if="type!='info'"  label="Star" prop="xingji">
					<el-select :disabled="ro.xingji" v-model="ruleForm.xingji" placeholder="请选择Star" >
						<el-option
							v-for="(item,index) in xingjiOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Star" prop="xingji">
					<el-input v-model="ruleForm.xingji"
						placeholder="Star" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="select" v-if="type!='info'"  label="Room Type" prop="fangjianleixing">
					<el-select :disabled="ro.fangjianleixing" v-model="ruleForm.fangjianleixing" placeholder="请选择Room Type" >
						<el-option
							v-for="(item,index) in fangjianleixingOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Room Type" prop="fangjianleixing">
					<el-input v-model="ruleForm.fangjianleixing"
						placeholder="Room Type" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Address" prop="jiudiandizhi">
					<el-input v-model="ruleForm.jiudiandizhi" placeholder="Address" clearable  :readonly="ro.jiudiandizhi"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Address" prop="jiudiandizhi">
					<el-input v-model="ruleForm.jiudiandizhi" placeholder="Address" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Room Price" prop="kefangjiage">
					<el-input v-model="ruleForm.kefangjiage" placeholder="Room Price" clearable  :readonly="ro.kefangjiage"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Room Price" prop="kefangjiage">
					<el-input v-model="ruleForm.kefangjiage" placeholder="Room Price" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Remaining" prop="kefangshuliang">
					<el-input v-model="ruleForm.kefangshuliang" placeholder="Remaining" clearable  :readonly="ro.kefangshuliang"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Remaining" prop="kefangshuliang">
					<el-input v-model="ruleForm.kefangshuliang" placeholder="Remaining" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="Contact" prop="lianxidianhua">
					<el-input v-model="ruleForm.lianxidianhua" placeholder="Contact" clearable  :readonly="ro.lianxidianhua"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else class="input" label="Contact" prop="lianxidianhua">
					<el-input v-model="ruleForm.lianxidianhua" placeholder="Contact" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-if="type!='info'"  label="Introduction" prop="jiudianjieshao">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.jiudianjieshao" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"width":"33.3%","margin":"0 0 20px 0"}' v-else-if="ruleForm.jiudianjieshao" label="Introduction" prop="jiudianjieshao">
                    <span :style='{"fontSize":"14px","lineHeight":"40px","color":"#000","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.jiudianjieshao"></span>
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
				jiudianmingcheng : false,
				jiudiantupian : false,
				leibie : false,
				xingji : false,
				fangjianleixing : false,
				jiudiandizhi : false,
				kefangjiage : false,
				kefangshuliang : false,
				lianxidianhua : false,
				jiudianjieshao : false,
				clicktime : false,
				clicknum : false,
			},
			
			
			ruleForm: {
				jiudianmingcheng: '',
				jiudiantupian: '',
				leibie: '',
				xingji: '',
				fangjianleixing: '',
				jiudiandizhi: '',
				kefangjiage: '',
				kefangshuliang: '',
				lianxidianhua: '',
				jiudianjieshao: '',
				clicktime: '',
			},
		
			leibieOptions: [],
			xingjiOptions: [],
			fangjianleixingOptions: [],
			
			rules: {
				jiudianmingcheng: [
					{ required: true, message: 'Name不能为空', trigger: 'blur' },
				],
				jiudiantupian: [
				],
				leibie: [
					{ required: true, message: 'Type不能为空', trigger: 'blur' },
				],
				xingji: [
					{ required: true, message: 'Star不能为空', trigger: 'blur' },
				],
				fangjianleixing: [
				],
				jiudiandizhi: [
				],
				kefangjiage: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				kefangshuliang: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				lianxidianhua: [
					{ validator: validatePhone, trigger: 'blur' },
				],
				jiudianjieshao: [
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
						if(o=='jiudianmingcheng'){
							this.ruleForm.jiudianmingcheng = obj[o];
							this.ro.jiudianmingcheng = true;
							continue;
						}
						if(o=='jiudiantupian'){
							this.ruleForm.jiudiantupian = obj[o];
							this.ro.jiudiantupian = true;
							continue;
						}
						if(o=='leibie'){
							this.ruleForm.leibie = obj[o];
							this.ro.leibie = true;
							continue;
						}
						if(o=='xingji'){
							this.ruleForm.xingji = obj[o];
							this.ro.xingji = true;
							continue;
						}
						if(o=='fangjianleixing'){
							this.ruleForm.fangjianleixing = obj[o];
							this.ro.fangjianleixing = true;
							continue;
						}
						if(o=='jiudiandizhi'){
							this.ruleForm.jiudiandizhi = obj[o];
							this.ro.jiudiandizhi = true;
							continue;
						}
						if(o=='kefangjiage'){
							this.ruleForm.kefangjiage = obj[o];
							this.ro.kefangjiage = true;
							continue;
						}
						if(o=='kefangshuliang'){
							this.ruleForm.kefangshuliang = obj[o];
							this.ro.kefangshuliang = true;
							continue;
						}
						if(o=='lianxidianhua'){
							this.ruleForm.lianxidianhua = obj[o];
							this.ro.lianxidianhua = true;
							continue;
						}
						if(o=='jiudianjieshao'){
							this.ruleForm.jiudianjieshao = obj[o];
							this.ro.jiudianjieshao = true;
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
			
            this.leibieOptions = "Homestay,Chain Hotel,Fast Hotel,Luxury Hotel".split(',')
            this.xingjiOptions = "One,two,Three,Four,Five".split(',')
            this.fangjianleixingOptions = "Single room,King-size,Double room,Trible room, , ".split(',')
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `jiudianxinxi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传Image后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
	this.ruleForm.jiudianjieshao = this.ruleForm.jiudianjieshao.replace(reg,'../../../ssmofyp4/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // submit
    onSubmit() {




	if(this.ruleForm.jiudiantupian!=null) {
		this.ruleForm.jiudiantupian = this.ruleForm.jiudiantupian.replace(new RegExp(this.$base.url,"g"),"");
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
				url: "jiudianxinxi/page", 
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
					   url: `jiudianxinxi/${!this.ruleForm.id ? "save" : "update"}`,
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
						 this.parent.jiudianxinxiCrossAddOrUpdateFlag = false;
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
			   url: `jiudianxinxi/${!this.ruleForm.id ? "save" : "update"}`,
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
				 this.parent.jiudianxinxiCrossAddOrUpdateFlag = false;
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
      this.parent.jiudianxinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    jiudiantupianUploadChange(fileUrls) {
	this.ruleForm.jiudiantupian = fileUrls;
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
