(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-menpiaoyuding-add-or-update"],{"10eb":function(i,e,r){var n=r("488e");"string"===typeof n&&(n=[[i.i,n,""]]),n.locals&&(i.exports=n.locals);var t=r("4f06").default;t("e89cfc76",n,!0,{sourceMap:!1,shadowMode:!1})},"1d95":function(i,e,r){"use strict";r.r(e);var n=r("898b"),t=r.n(n);for(var a in n)"default"!==a&&function(i){r.d(e,i,(function(){return n[i]}))}(a);e["default"]=t.a},"47c9":function(i,e,r){"use strict";r.r(e);var n=r("6d34"),t=r("1d95");for(var a in t)"default"!==a&&function(i){r.d(e,i,(function(){return t[i]}))}(a);r("88db");var o,s=r("f0c5"),l=Object(s["a"])(t["default"],n["b"],n["c"],!1,null,"17971f3a",null,!1,n["a"],o);e["default"]=l.exports},"488e":function(i,e,r){var n=r("24fb");e=n(!1),e.push([i.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-17971f3a]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),i.exports=e},"6d34":function(i,e,r){"use strict";var n={"w-picker":r("e2b1").default},t=function(){var i=this,e=i.$createElement,r=i._self._c||e;return r("v-uni-view",{staticClass:"content"},[r("v-uni-view",{style:{width:"100%",padding:"0 0 64rpx",position:"relative",background:"url(http://codegen.caihongy.cn/20221108/581bb1956ffe4c8182127ca1e196e95e.png) fixed",height:"auto"}},[r("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx",background:"none",display:"block",height:"auto"}},[r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[i._v("Number")]),r("v-uni-view",{staticClass:"right-input",style:{padding:"0px 24rpx",margin:"0px",lineHeight:"80rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)",flex:"1"}},[i._v(i._s(i.ruleForm.dingdanbianhao))])],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[i._v("Name")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:i.ro.jingdianmingcheng,placeholder:"Name"},model:{value:i.ruleForm.jingdianmingcheng,callback:function(e){i.$set(i.ruleForm,"jingdianmingcheng",e)},expression:"ruleForm.jingdianmingcheng"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(e){arguments[0]=e=i.$handleEvent(e),i.tupianTap.apply(void 0,arguments)}}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[i._v("图片")]),i.ruleForm.tupian?r("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:i.baseUrl+i.ruleForm.tupian,mode:"aspectFill"}}):r("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[i._v("Type")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:i.ro.jingdianleixing,placeholder:"Type"},model:{value:i.ruleForm.jingdianleixing,callback:function(e){i.$set(i.ruleForm,"jingdianleixing",e)},expression:"ruleForm.jingdianleixing"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[i._v("Price")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:i.ro.menpiaojiage,placeholder:"Price"},model:{value:i.ruleForm.menpiaojiage,callback:function(e){i.$set(i.ruleForm,"menpiaojiage",e)},expression:"ruleForm.menpiaojiage"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[i._v("Remaining")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:i.ro.shuliang,placeholder:"Remaining"},model:{value:i.ruleForm.shuliang,callback:function(e){i.$set(i.ruleForm,"shuliang",e)},expression:"ruleForm.shuliang"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[i._v("Quantity")]),r("v-uni-view",{staticClass:"right-input",style:{padding:"0px 24rpx",margin:"0px",lineHeight:"80rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)",flex:"1"}},[i._v(i._s(i.zongjine))])],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[i._v("Time")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{placeholder:"Time"},on:{click:function(e){arguments[0]=e=i.$handleEvent(e),i.toggleTab("goupiaoshijian")}},model:{value:i.ruleForm.goupiaoshijian,callback:function(e){i.$set(i.ruleForm,"goupiaoshijian",e)},expression:"ruleForm.goupiaoshijian"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[i._v("Account")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:i.ro.yonghuzhanghao,placeholder:"Account"},model:{value:i.ruleForm.yonghuzhanghao,callback:function(e){i.$set(i.ruleForm,"yonghuzhanghao",e)},expression:"ruleForm.yonghuzhanghao"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[i._v("User")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:i.ro.yonghuxingming,placeholder:"User"},model:{value:i.ruleForm.yonghuxingming,callback:function(e){i.$set(i.ruleForm,"yonghuxingming",e)},expression:"ruleForm.yonghuxingming"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[i._v("Telephone")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:i.ro.lianxifangshi,placeholder:"Telephone"},model:{value:i.ruleForm.lianxifangshi,callback:function(e){i.$set(i.ruleForm,"lianxifangshi",e)},expression:"ruleForm.lianxifangshi"}})],1),r("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"space-between",display:"flex",height:"auto"}},[r("v-uni-button",{staticClass:"bg-red",style:{border:"0",padding:"0px",boxShadow:"0px 4rpx 12rpx #ccc",margin:"0",color:"rgb(255, 255, 255)",borderRadius:"16rpx",background:"radial-gradient(circle, rgba(216,214,246,1) 0%, rgba(204,189,235,1) 24%, rgba(181,191,232,1) 62%, rgba(175,173,228,1) 100%)",width:"48%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(e){arguments[0]=e=i.$handleEvent(e),i.onSubmitTap.apply(void 0,arguments)}}},[i._v("提交")])],1)],1),r("w-picker",{ref:"goupiaoshijian",attrs:{mode:"dateTime",step:"1",current:!1,hasSecond:!1,themeColor:"#333333"},on:{confirm:function(e){arguments[0]=e=i.$handleEvent(e),i.goupiaoshijianConfirm.apply(void 0,arguments)}}})],1)],1)},a=[];r.d(e,"b",(function(){return t})),r.d(e,"c",(function(){return a})),r.d(e,"a",(function(){return n}))},"88db":function(i,e,r){"use strict";var n=r("10eb"),t=r.n(n);t.a},"898b":function(i,e,r){"use strict";var n=r("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,r("a481"),r("c5f6"),r("f559"),r("ac6a"),r("96cf");var t=n(r("3b8d")),a=n(r("e2b1")),o=n(r("064f")),s={data:function(){return{cross:"",ruleForm:{dingdanbianhao:this.getUUID(),jingdianmingcheng:"",tupian:"",jingdianleixing:"",menpiaojiage:"",shuliang:"",zongjine:"",goupiaoshijian:"",yonghuzhanghao:"",yonghuxingming:"",lianxifangshi:"",ispay:""},user:{},ro:{dingdanbianhao:!1,jingdianmingcheng:!1,tupian:!1,jingdianleixing:!1,menpiaojiage:!1,shuliang:!1,zongjine:!1,goupiaoshijian:!1,yonghuzhanghao:!1,yonghuxingming:!1,lianxifangshi:!1,ispay:!1}}},components:{wPicker:a.default,xiaEditor:o.default},computed:{baseUrl:function(){return this.$base.url},zongjine:{get:function(){return 1*this.ruleForm.menpiaojiage*this.ruleForm.shuliang}}},onLoad:function(){var i=(0,t.default)(regeneratorRuntime.mark((function i(e){var r,n,t,a;return regeneratorRuntime.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return this.ruleForm.goupiaoshijian=this.$utils.getCurDateTime(),r=uni.getStorageSync("nowTable"),i.next=4,this.$api.session(r);case 4:if(n=i.sent,this.user=n.data,this.ruleForm.yonghuzhanghao=this.user.yonghuzhanghao,this.ro.yonghuzhanghao=!0,this.ruleForm.yonghuxingming=this.user.yonghuxingming,this.ro.yonghuxingming=!0,this.ruleForm.lianxifangshi=this.user.lianxifangshi,this.ro.lianxifangshi=!0,this.ruleForm.userid=uni.getStorageSync("userid"),e.refid&&(this.ruleForm.refid=e.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!e.id){i.next=20;break}return this.ruleForm.id=e.id,i.next=18,this.$api.info("menpiaoyuding",this.ruleForm.id);case 18:n=i.sent,this.ruleForm=n.data;case 20:if(this.cross=e.cross,!e.cross){i.next=74;break}t=uni.getStorageSync("crossObj"),i.t0=regeneratorRuntime.keys(t);case 24:if((i.t1=i.t0()).done){i.next=72;break}if(a=i.t1.value,"dingdanbianhao"!=a){i.next=30;break}return this.ruleForm.dingdanbianhao=t[a],this.ro.dingdanbianhao=!0,i.abrupt("continue",24);case 30:if("jingdianmingcheng"!=a){i.next=34;break}return this.ruleForm.jingdianmingcheng=t[a],this.ro.jingdianmingcheng=!0,i.abrupt("continue",24);case 34:if("tupian"!=a){i.next=38;break}return this.ruleForm.tupian=t[a],this.ro.tupian=!0,i.abrupt("continue",24);case 38:if("jingdianleixing"!=a){i.next=42;break}return this.ruleForm.jingdianleixing=t[a],this.ro.jingdianleixing=!0,i.abrupt("continue",24);case 42:if("menpiaojiage"!=a){i.next=46;break}return this.ruleForm.menpiaojiage=t[a],this.ro.menpiaojiage=!0,i.abrupt("continue",24);case 46:if("shuliang"!=a){i.next=50;break}return this.ruleForm.shuliang=t[a],this.ro.shuliang=!0,i.abrupt("continue",24);case 50:if("zongjine"!=a){i.next=54;break}return this.ruleForm.zongjine=t[a],this.ro.zongjine=!0,i.abrupt("continue",24);case 54:if("goupiaoshijian"!=a){i.next=58;break}return this.ruleForm.goupiaoshijian=t[a],this.ro.goupiaoshijian=!0,i.abrupt("continue",24);case 58:if("yonghuzhanghao"!=a){i.next=62;break}return this.ruleForm.yonghuzhanghao=t[a],this.ro.yonghuzhanghao=!0,i.abrupt("continue",24);case 62:if("yonghuxingming"!=a){i.next=66;break}return this.ruleForm.yonghuxingming=t[a],this.ro.yonghuxingming=!0,i.abrupt("continue",24);case 66:if("lianxifangshi"!=a){i.next=70;break}return this.ruleForm.lianxifangshi=t[a],this.ro.lianxifangshi=!0,i.abrupt("continue",24);case 70:i.next=24;break;case 72:this.ruleForm.shuliang=0,this.ro.shuliang=!1;case 74:this.styleChange();case 75:case"end":return i.stop()}}),i,this)})));function e(e){return i.apply(this,arguments)}return e}(),methods:{styleChange:function(){this.$nextTick((function(){}))},goupiaoshijianConfirm:function(i){console.log(i),this.ruleForm.goupiaoshijian=i.result,this.$forceUpdate()},tupianTap:function(){var i=this;this.$api.upload((function(e){i.ruleForm.tupian="upload/"+e.file,i.$forceUpdate(),i.$nextTick((function(){i.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var i=(0,t.default)(regeneratorRuntime.mark((function i(){var e,r,n,t,a,o,s,l,u,g;return regeneratorRuntime.wrap((function(i){while(1)switch(i.prev=i.next){case 0:if(this.ruleForm.zongjine=this.zongjine,e=uni.getStorageSync("crossObj"),r=uni.getStorageSync("crossTable"),!(parseFloat(e.shuliang)-parseFloat(this.ruleForm.shuliang)<0)){i.next=6;break}return this.$utils.msg("Remaining不足"),i.abrupt("return");case 6:if(!this.ruleForm.menpiaojiage||this.$validate.isNumber(this.ruleForm.menpiaojiage)){i.next=9;break}return this.$utils.msg("Price应输入数字"),i.abrupt("return");case 9:if(this.ruleForm.shuliang){i.next=12;break}return this.$utils.msg("Remaining不能为空"),i.abrupt("return");case 12:if(!this.ruleForm.shuliang||this.$validate.isIntNumer(this.ruleForm.shuliang)){i.next=15;break}return this.$utils.msg("Remaining应输入整数"),i.abrupt("return");case 15:if(!this.ruleForm.zongjine||this.$validate.isNumber(this.ruleForm.zongjine)){i.next=18;break}return this.$utils.msg("Quantity应输入数字"),i.abrupt("return");case 18:if(!this.ruleForm.lianxifangshi||this.$validate.isMobile(this.ruleForm.lianxifangshi)){i.next=21;break}return this.$utils.msg("Telephone应输入手机格式"),i.abrupt("return");case 21:if(!this.cross){i.next=37;break}if(o=uni.getStorageSync("statusColumnName"),s=uni.getStorageSync("statusColumnValue"),""==o){i.next=37;break}if(e||(e=uni.getStorageSync("crossObj")),o.startsWith("[")){i.next=33;break}for(l in e)l==o&&(e[l]=s);return r=uni.getStorageSync("crossTable"),i.next=31,this.$api.update("".concat(r),e);case 31:i.next=37;break;case 33:n=Number(uni.getStorageSync("userid")),t=e["id"],a=uni.getStorageSync("statusColumnName"),a=a.replace(/\[/,"").replace(/\]/,"");case 37:if(!t||!n){i.next=64;break}return this.ruleForm.crossuserid=n,this.ruleForm.crossrefid=t,u={page:1,limit:10,crossuserid:n,crossrefid:t},i.next=43,this.$api.list("menpiaoyuding",u);case 43:if(g=i.sent,!(g.data.total>=a)){i.next=49;break}return this.$utils.msg(uni.getStorageSync("tips")),i.abrupt("return",!1);case 49:return e||(e=uni.getStorageSync("crossObj")),r=uni.getStorageSync("crossTable"),e.shuliang=parseFloat(e.shuliang)-parseFloat(this.ruleForm.shuliang),i.next=54,this.$api.update("".concat(r),e);case 54:if(!this.ruleForm.id){i.next=59;break}return i.next=57,this.$api.update("menpiaoyuding",this.ruleForm);case 57:i.next=61;break;case 59:return i.next=61,this.$api.add("menpiaoyuding",this.ruleForm);case 61:this.$utils.msgBack("提交成功");case 62:i.next=77;break;case 64:return e||(e=uni.getStorageSync("crossObj")),r=uni.getStorageSync("crossTable"),e.shuliang=e.shuliang-this.ruleForm.shuliang,i.next=69,this.$api.update("".concat(r),e);case 69:if(!this.ruleForm.id){i.next=74;break}return i.next=72,this.$api.update("menpiaoyuding",this.ruleForm);case 72:i.next=76;break;case 74:return i.next=76,this.$api.add("menpiaoyuding",this.ruleForm);case 76:this.$utils.msgBack("提交成功");case 77:case"end":return i.stop()}}),i,this)})));function e(){return i.apply(this,arguments)}return e}(),optionsChange:function(i){this.index=i.target.value},bindDateChange:function(i){this.date=i.target.value},getDate:function(i){var e=new Date,r=e.getFullYear(),n=e.getMonth()+1,t=e.getDate();return"start"===i?r-=60:"end"===i&&(r+=2),n=n>9?n:"0"+n,t=t>9?t:"0"+t,"".concat(r,"-").concat(n,"-").concat(t)},toggleTab:function(i){this.$refs[i].show()}}};e.default=s}}]);