(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-banzhushenqing-add-or-update"],{"0ab7":function(e,i,r){var n=r("24fb");i=n(!1),i.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-5c9add02]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=i},2203:function(e,i,r){var n=r("0ab7");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var t=r("4f06").default;t("57d86f48",n,!0,{sourceMap:!1,shadowMode:!1})},6964:function(e,i,r){"use strict";r.r(i);var n=r("a9b6"),t=r("b790");for(var a in t)"default"!==a&&function(e){r.d(i,e,(function(){return t[e]}))}(a);r("b2b1");var o,s=r("f0c5"),u=Object(s["a"])(t["default"],n["b"],n["c"],!1,null,"5c9add02",null,!1,n["a"],o);i["default"]=u.exports},"6a65":function(e,i,r){"use strict";var n=r("4ea4");Object.defineProperty(i,"__esModule",{value:!0}),i.default=void 0,r("a481"),r("c5f6"),r("f559"),r("ac6a"),r("96cf");var t=n(r("3b8d")),a=n(r("e2b1")),o=n(r("064f")),s={data:function(){return{cross:"",ruleForm:{yonghuzhanghao:"",yonghuxingming:"",touxiang:"",lianxifangshi:"",xihuanqiuxing:"",xihuanqiudui:"",gerenjieshao:"",shenqingliyou:"",shenqingshijian:"",shhf:""},user:{},ro:{yonghuzhanghao:!1,yonghuxingming:!1,touxiang:!1,lianxifangshi:!1,xihuanqiuxing:!1,xihuanqiudui:!1,gerenjieshao:!1,shenqingliyou:!1,shenqingshijian:!1,sfsh:!1,shhf:!1}}},components:{wPicker:a.default,xiaEditor:o.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,t.default)(regeneratorRuntime.mark((function e(i){var r,n,t,a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.ruleForm.shenqingshijian=this.$utils.getCurDateTime(),r=uni.getStorageSync("nowTable"),e.next=4,this.$api.session(r);case 4:if(n=e.sent,this.user=n.data,this.ruleForm.yonghuzhanghao=this.user.yonghuzhanghao,this.ro.yonghuzhanghao=!0,this.ruleForm.yonghuxingming=this.user.yonghuxingming,this.ro.yonghuxingming=!0,this.ruleForm.touxiang=this.user.touxiang,this.ro.touxiang=!0,this.ruleForm.lianxifangshi=this.user.lianxifangshi,this.ro.lianxifangshi=!0,this.ruleForm.userid=uni.getStorageSync("userid"),i.refid&&(this.ruleForm.refid=i.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!i.id){e.next=22;break}return this.ruleForm.id=i.id,e.next=20,this.$api.info("banzhushenqing",this.ruleForm.id);case 20:n=e.sent,this.ruleForm=n.data;case 22:if(this.cross=i.cross,!i.cross){e.next=66;break}t=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(t);case 26:if((e.t1=e.t0()).done){e.next=66;break}if(a=e.t1.value,"yonghuzhanghao"!=a){e.next=32;break}return this.ruleForm.yonghuzhanghao=t[a],this.ro.yonghuzhanghao=!0,e.abrupt("continue",26);case 32:if("yonghuxingming"!=a){e.next=36;break}return this.ruleForm.yonghuxingming=t[a],this.ro.yonghuxingming=!0,e.abrupt("continue",26);case 36:if("touxiang"!=a){e.next=40;break}return this.ruleForm.touxiang=t[a],this.ro.touxiang=!0,e.abrupt("continue",26);case 40:if("lianxifangshi"!=a){e.next=44;break}return this.ruleForm.lianxifangshi=t[a],this.ro.lianxifangshi=!0,e.abrupt("continue",26);case 44:if("xihuanqiuxing"!=a){e.next=48;break}return this.ruleForm.xihuanqiuxing=t[a],this.ro.xihuanqiuxing=!0,e.abrupt("continue",26);case 48:if("xihuanqiudui"!=a){e.next=52;break}return this.ruleForm.xihuanqiudui=t[a],this.ro.xihuanqiudui=!0,e.abrupt("continue",26);case 52:if("gerenjieshao"!=a){e.next=56;break}return this.ruleForm.gerenjieshao=t[a],this.ro.gerenjieshao=!0,e.abrupt("continue",26);case 56:if("shenqingliyou"!=a){e.next=60;break}return this.ruleForm.shenqingliyou=t[a],this.ro.shenqingliyou=!0,e.abrupt("continue",26);case 60:if("shenqingshijian"!=a){e.next=64;break}return this.ruleForm.shenqingshijian=t[a],this.ro.shenqingshijian=!0,e.abrupt("continue",26);case 64:e.next=26;break;case 66:this.styleChange();case 67:case"end":return e.stop()}}),e,this)})));function i(i){return e.apply(this,arguments)}return i}(),methods:{gerenjieshaoChange:function(e){this.ruleForm.gerenjieshao=e},shenqingliyouChange:function(e){this.ruleForm.shenqingliyou=e},styleChange:function(){this.$nextTick((function(){}))},shenqingshijianConfirm:function(e){console.log(e),this.ruleForm.shenqingshijian=e.result,this.$forceUpdate()},touxiangTap:function(){var e=this;this.$api.upload((function(i){e.ruleForm.touxiang="upload/"+i.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,t.default)(regeneratorRuntime.mark((function e(){var i,r,n,t,a,o,s,u,l,h;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!this.ruleForm.lianxifangshi||this.$validate.isMobile(this.ruleForm.lianxifangshi)){e.next=3;break}return this.$utils.msg("Telephone应输入手机格式"),e.abrupt("return");case 3:if(!this.cross){e.next=19;break}if(a=uni.getStorageSync("statusColumnName"),o=uni.getStorageSync("statusColumnValue"),""==a){e.next=19;break}if(i||(i=uni.getStorageSync("crossObj")),a.startsWith("[")){e.next=15;break}for(s in i)s==a&&(i[s]=o);return u=uni.getStorageSync("crossTable"),e.next=13,this.$api.update("".concat(u),i);case 13:e.next=19;break;case 15:r=Number(uni.getStorageSync("userid")),n=i["id"],t=uni.getStorageSync("statusColumnName"),t=t.replace(/\[/,"").replace(/\]/,"");case 19:if(!n||!r){e.next=41;break}return this.ruleForm.crossuserid=r,this.ruleForm.crossrefid=n,l={page:1,limit:10,crossuserid:r,crossrefid:n},e.next=25,this.$api.list("banzhushenqing",l);case 25:if(h=e.sent,!(h.data.total>=t)){e.next=31;break}return this.$utils.msg(uni.getStorageSync("tips")),e.abrupt("return",!1);case 31:if(!this.ruleForm.id){e.next=36;break}return e.next=34,this.$api.update("banzhushenqing",this.ruleForm);case 34:e.next=38;break;case 36:return e.next=38,this.$api.add("banzhushenqing",this.ruleForm);case 38:this.$utils.msgBack("提交成功");case 39:e.next=49;break;case 41:if(!this.ruleForm.id){e.next=46;break}return e.next=44,this.$api.update("banzhushenqing",this.ruleForm);case 44:e.next=48;break;case 46:return e.next=48,this.$api.add("banzhushenqing",this.ruleForm);case 48:this.$utils.msgBack("提交成功");case 49:case"end":return e.stop()}}),e,this)})));function i(){return e.apply(this,arguments)}return i}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var i=new Date,r=i.getFullYear(),n=i.getMonth()+1,t=i.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),n=n>9?n:"0"+n,t=t>9?t:"0"+t,"".concat(r,"-").concat(n,"-").concat(t)},toggleTab:function(e){this.$refs[e].show()}}};i.default=s},a9b6:function(e,i,r){"use strict";var n={"xia-editor":r("064f").default,"w-picker":r("e2b1").default},t=function(){var e=this,i=e.$createElement,r=e._self._c||i;return r("v-uni-view",{staticClass:"content"},[r("v-uni-view",{style:{width:"100%",padding:"0 0 64rpx",position:"relative",background:"url(http://codegen.caihongy.cn/20221108/581bb1956ffe4c8182127ca1e196e95e.png) fixed",height:"auto"}},[r("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx",background:"none",display:"block",height:"auto"}},[r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("Account")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.yonghuzhanghao,placeholder:"Account"},model:{value:e.ruleForm.yonghuzhanghao,callback:function(i){e.$set(e.ruleForm,"yonghuzhanghao",i)},expression:"ruleForm.yonghuzhanghao"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("User")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.yonghuxingming,placeholder:"User"},model:{value:e.ruleForm.yonghuxingming,callback:function(i){e.$set(e.ruleForm,"yonghuxingming",i)},expression:"ruleForm.yonghuxingming"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.touxiangTap.apply(void 0,arguments)}}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("头像")]),e.ruleForm.touxiang?r("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:e.baseUrl+e.ruleForm.touxiang,mode:"aspectFill"}}):r("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("Telephone")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.lianxifangshi,placeholder:"Telephone"},model:{value:e.ruleForm.lianxifangshi,callback:function(i){e.$set(e.ruleForm,"lianxifangshi",i)},expression:"ruleForm.lianxifangshi"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("喜欢球星")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.xihuanqiuxing,placeholder:"喜欢球星"},model:{value:e.ruleForm.xihuanqiuxing,callback:function(i){e.$set(e.ruleForm,"xihuanqiuxing",i)},expression:"ruleForm.xihuanqiuxing"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("喜欢球队")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.xihuanqiudui,placeholder:"喜欢球队"},model:{value:e.ruleForm.xihuanqiudui,callback:function(i){e.$set(e.ruleForm,"xihuanqiudui",i)},expression:"ruleForm.xihuanqiudui"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("申请时间")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{placeholder:"申请时间"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.toggleTab("shenqingshijian")}},model:{value:e.ruleForm.shenqingshijian,callback:function(i){e.$set(e.ruleForm,"shenqingshijian",i)},expression:"ruleForm.shenqingshijian"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",margin:"0 0 24rpx 0",borderColor:"#ccc",borderWidth:"0 0 0px 0",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",fontWeight:"500"}},[e._v("个人介绍")]),r("xia-editor",{style:{minHeight:"300rpx",border:"2rpx solid #ddd",padding:"24rpx",boxShadow:"0px 0.10rpx 2rpx #ccc",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",width:"100%",lineHeight:"1.5",height:"auto"},attrs:{placeholder:"个人介绍"},on:{editorChange:function(i){arguments[0]=i=e.$handleEvent(i),e.gerenjieshaoChange.apply(void 0,arguments)}},model:{value:e.ruleForm.gerenjieshao,callback:function(i){e.$set(e.ruleForm,"gerenjieshao",i)},expression:"ruleForm.gerenjieshao"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",margin:"0 0 24rpx 0",borderColor:"#ccc",borderWidth:"0 0 0px 0",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",fontWeight:"500"}},[e._v("申请理由")]),r("xia-editor",{style:{minHeight:"300rpx",border:"2rpx solid #ddd",padding:"24rpx",boxShadow:"0px 0.10rpx 2rpx #ccc",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",width:"100%",lineHeight:"1.5",height:"auto"},attrs:{placeholder:"申请理由"},on:{editorChange:function(i){arguments[0]=i=e.$handleEvent(i),e.shenqingliyouChange.apply(void 0,arguments)}},model:{value:e.ruleForm.shenqingliyou,callback:function(i){e.$set(e.ruleForm,"shenqingliyou",i)},expression:"ruleForm.shenqingliyou"}})],1),r("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"space-between",display:"flex",height:"auto"}},[r("v-uni-button",{staticClass:"bg-red",style:{border:"0",padding:"0px",boxShadow:"0px 4rpx 12rpx #ccc",margin:"0",color:"rgb(255, 255, 255)",borderRadius:"16rpx",background:"radial-gradient(circle, rgba(216,214,246,1) 0%, rgba(204,189,235,1) 24%, rgba(181,191,232,1) 62%, rgba(175,173,228,1) 100%)",width:"48%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1),r("w-picker",{ref:"shenqingshijian",attrs:{mode:"dateTime",step:"1",current:!1,hasSecond:!1,themeColor:"#333333"},on:{confirm:function(i){arguments[0]=i=e.$handleEvent(i),e.shenqingshijianConfirm.apply(void 0,arguments)}}})],1)],1)},a=[];r.d(i,"b",(function(){return t})),r.d(i,"c",(function(){return a})),r.d(i,"a",(function(){return n}))},b2b1:function(e,i,r){"use strict";var n=r("2203"),t=r.n(n);t.a},b790:function(e,i,r){"use strict";r.r(i);var n=r("6a65"),t=r.n(n);for(var a in n)"default"!==a&&function(e){r.d(i,e,(function(){return n[e]}))}(a);i["default"]=t.a}}]);