(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-zuqiuzhoubian-add-or-update"],{"455b":function(e,r,i){"use strict";i.r(r);var t=i("c794"),n=i("fb3c");for(var a in n)"default"!==a&&function(e){i.d(r,e,(function(){return n[e]}))}(a);i("4a2c");var o,l=i("f0c5"),s=Object(l["a"])(n["default"],t["b"],t["c"],!1,null,"5abff296",null,!1,t["a"],o);r["default"]=s.exports},"4a2c":function(e,r,i){"use strict";var t=i("c8b2"),n=i.n(t);n.a},"92c6":function(e,r,i){"use strict";var t=i("4ea4");Object.defineProperty(r,"__esModule",{value:!0}),r.default=void 0,i("a481"),i("c5f6"),i("f559"),i("ac6a"),i("96cf");var n=t(i("3b8d")),a=t(i("e2b1")),o=t(i("064f")),l={data:function(){return{cross:"",ruleForm:{shangpinbianhao:this.getUUID(),shangpinmingcheng:"",shangpinfengmian:"",shangpinfenlei:"",pinpai:"",guige:"",chanpinxiangqing:"",onelimittimes:"-1",alllimittimes:"-1",price:"",groupprice:"",grouppeople:"",curpeople:""},user:{},ro:{shangpinbianhao:!1,shangpinmingcheng:!1,shangpinfengmian:!1,shangpinfenlei:!1,pinpai:!1,guige:!1,chanpinxiangqing:!1,onelimittimes:!1,alllimittimes:!1,clicktime:!1,clicknum:!1,price:!1,groupprice:!1,grouppeople:!1,curpeople:!1}}},components:{wPicker:a.default,xiaEditor:o.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(r){var i,t,n,a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return i=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(i);case 3:if(t=e.sent,this.user=t.data,this.ruleForm.userid=uni.getStorageSync("userid"),r.refid&&(this.ruleForm.refid=r.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!r.id){e.next=13;break}return this.ruleForm.id=r.id,e.next=11,this.$api.info("zuqiuzhoubian",this.ruleForm.id);case 11:t=e.sent,this.ruleForm=t.data;case 13:if(this.cross=r.cross,!r.cross){e.next=81;break}n=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(n);case 17:if((e.t1=e.t0()).done){e.next=81;break}if(a=e.t1.value,"shangpinbianhao"!=a){e.next=23;break}return this.ruleForm.shangpinbianhao=n[a],this.ro.shangpinbianhao=!0,e.abrupt("continue",17);case 23:if("shangpinmingcheng"!=a){e.next=27;break}return this.ruleForm.shangpinmingcheng=n[a],this.ro.shangpinmingcheng=!0,e.abrupt("continue",17);case 27:if("shangpinfengmian"!=a){e.next=31;break}return this.ruleForm.shangpinfengmian=n[a],this.ro.shangpinfengmian=!0,e.abrupt("continue",17);case 31:if("shangpinfenlei"!=a){e.next=35;break}return this.ruleForm.shangpinfenlei=n[a],this.ro.shangpinfenlei=!0,e.abrupt("continue",17);case 35:if("pinpai"!=a){e.next=39;break}return this.ruleForm.pinpai=n[a],this.ro.pinpai=!0,e.abrupt("continue",17);case 39:if("guige"!=a){e.next=43;break}return this.ruleForm.guige=n[a],this.ro.guige=!0,e.abrupt("continue",17);case 43:if("chanpinxiangqing"!=a){e.next=47;break}return this.ruleForm.chanpinxiangqing=n[a],this.ro.chanpinxiangqing=!0,e.abrupt("continue",17);case 47:if("onelimittimes"!=a){e.next=51;break}return this.ruleForm.onelimittimes=n[a],this.ro.onelimittimes=!0,e.abrupt("continue",17);case 51:if("alllimittimes"!=a){e.next=55;break}return this.ruleForm.alllimittimes=n[a],this.ro.alllimittimes=!0,e.abrupt("continue",17);case 55:if("clicktime"!=a){e.next=59;break}return this.ruleForm.clicktime=n[a],this.ro.clicktime=!0,e.abrupt("continue",17);case 59:if("clicknum"!=a){e.next=63;break}return this.ruleForm.clicknum=n[a],this.ro.clicknum=!0,e.abrupt("continue",17);case 63:if("price"!=a){e.next=67;break}return this.ruleForm.price=n[a],this.ro.price=!0,e.abrupt("continue",17);case 67:if("groupprice"!=a){e.next=71;break}return this.ruleForm.groupprice=n[a],this.ro.groupprice=!0,e.abrupt("continue",17);case 71:if("grouppeople"!=a){e.next=75;break}return this.ruleForm.grouppeople=n[a],this.ro.grouppeople=!0,e.abrupt("continue",17);case 75:if("curpeople"!=a){e.next=79;break}return this.ruleForm.curpeople=n[a],this.ro.curpeople=!0,e.abrupt("continue",17);case 79:e.next=17;break;case 81:this.styleChange();case 82:case"end":return e.stop()}}),e,this)})));function r(r){return e.apply(this,arguments)}return r}(),methods:{chanpinxiangqingChange:function(e){this.ruleForm.chanpinxiangqing=e},styleChange:function(){this.$nextTick((function(){}))},clicktimeConfirm:function(e){console.log(e),this.ruleForm.clicktime=e.result,this.$forceUpdate()},shangpinfengmianTap:function(){var e=this;this.$api.upload((function(r){e.ruleForm.shangpinfengmian="upload/"+r.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(){var r,i,t,n,a,o,l,s,p,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!this.ruleForm.onelimittimes||this.$validate.isIntNumer(this.ruleForm.onelimittimes)){e.next=3;break}return this.$utils.msg("Limit应输入整数"),e.abrupt("return");case 3:if(!this.ruleForm.alllimittimes||this.$validate.isIntNumer(this.ruleForm.alllimittimes)){e.next=6;break}return this.$utils.msg("Remaining应输入整数"),e.abrupt("return");case 6:if(!this.ruleForm.clicknum||this.$validate.isIntNumer(this.ruleForm.clicknum)){e.next=9;break}return this.$utils.msg("点击次数应输入整数"),e.abrupt("return");case 9:if(!this.ruleForm.price||this.$validate.isNumber(this.ruleForm.price)){e.next=12;break}return this.$utils.msg("Price应输入数字"),e.abrupt("return");case 12:if(!this.ruleForm.groupprice||this.$validate.isNumber(this.ruleForm.groupprice)){e.next=15;break}return this.$utils.msg("Group Price应输入数字"),e.abrupt("return");case 15:if(!this.ruleForm.grouppeople||this.$validate.isIntNumer(this.ruleForm.grouppeople)){e.next=18;break}return this.$utils.msg("Group number应输入整数"),e.abrupt("return");case 18:if(!this.ruleForm.curpeople||this.$validate.isIntNumer(this.ruleForm.curpeople)){e.next=21;break}return this.$utils.msg("Current Number应输入整数"),e.abrupt("return");case 21:if(!this.cross){e.next=37;break}if(a=uni.getStorageSync("statusColumnName"),o=uni.getStorageSync("statusColumnValue"),""==a){e.next=37;break}if(r||(r=uni.getStorageSync("crossObj")),a.startsWith("[")){e.next=33;break}for(l in r)l==a&&(r[l]=o);return s=uni.getStorageSync("crossTable"),e.next=31,this.$api.update("".concat(s),r);case 31:e.next=37;break;case 33:i=Number(uni.getStorageSync("userid")),t=r["id"],n=uni.getStorageSync("statusColumnName"),n=n.replace(/\[/,"").replace(/\]/,"");case 37:if(!t||!i){e.next=59;break}return this.ruleForm.crossuserid=i,this.ruleForm.crossrefid=t,p={page:1,limit:10,crossuserid:i,crossrefid:t},e.next=43,this.$api.list("zuqiuzhoubian",p);case 43:if(c=e.sent,!(c.data.total>=n)){e.next=49;break}return this.$utils.msg(uni.getStorageSync("tips")),e.abrupt("return",!1);case 49:if(!this.ruleForm.id){e.next=54;break}return e.next=52,this.$api.update("zuqiuzhoubian",this.ruleForm);case 52:e.next=56;break;case 54:return e.next=56,this.$api.add("zuqiuzhoubian",this.ruleForm);case 56:this.$utils.msgBack("submit成功");case 57:e.next=67;break;case 59:if(!this.ruleForm.id){e.next=64;break}return e.next=62,this.$api.update("zuqiuzhoubian",this.ruleForm);case 62:e.next=66;break;case 64:return e.next=66,this.$api.add("zuqiuzhoubian",this.ruleForm);case 66:this.$utils.msgBack("submit成功");case 67:case"end":return e.stop()}}),e,this)})));function r(){return e.apply(this,arguments)}return r}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var r=new Date,i=r.getFullYear(),t=r.getMonth()+1,n=r.getDate();return"start"===e?i-=60:"end"===e&&(i+=2),t=t>9?t:"0"+t,n=n>9?n:"0"+n,"".concat(i,"-").concat(t,"-").concat(n)},toggleTab:function(e){this.$refs[e].show()}}};r.default=l},ac2c:function(e,r,i){var t=i("24fb");r=t(!1),r.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便User通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过Modify这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* Image尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-5abff296]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=r},c794:function(e,r,i){"use strict";var t={"xia-editor":i("064f").default,"w-picker":i("e2b1").default},n=function(){var e=this,r=e.$createElement,i=e._self._c||r;return i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{style:{width:"100%",padding:"0 0 64rpx",position:"relative",background:"url(http://codegen.caihongy.cn/20221108/581bb1956ffe4c8182127ca1e196e95e.png) fixed",height:"auto"}},[i("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx",background:"none",display:"block",height:"auto"}},[i("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("商品编号")]),i("v-uni-view",{staticClass:"right-input",style:{padding:"0px 24rpx",margin:"0px",lineHeight:"80rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)",flex:"1"}},[e._v(e._s(e.ruleForm.shangpinbianhao))])],1),i("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("Name")]),i("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.shangpinmingcheng,placeholder:"Name"},model:{value:e.ruleForm.shangpinmingcheng,callback:function(r){e.$set(e.ruleForm,"shangpinmingcheng",r)},expression:"ruleForm.shangpinmingcheng"}})],1),i("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.shangpinfengmianTap.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("Cover")]),e.ruleForm.shangpinfengmian?i("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:e.baseUrl+e.ruleForm.shangpinfengmian,mode:"aspectFill"}}):i("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),i("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("商品分类")]),i("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.shangpinfenlei,placeholder:"商品分类"},model:{value:e.ruleForm.shangpinfenlei,callback:function(r){e.$set(e.ruleForm,"shangpinfenlei",r)},expression:"ruleForm.shangpinfenlei"}})],1),i("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("Brand")]),i("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.pinpai,placeholder:"Brand"},model:{value:e.ruleForm.pinpai,callback:function(r){e.$set(e.ruleForm,"pinpai",r)},expression:"ruleForm.pinpai"}})],1),i("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("Size")]),i("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.guige,placeholder:"Size"},model:{value:e.ruleForm.guige,callback:function(r){e.$set(e.ruleForm,"guige",r)},expression:"ruleForm.guige"}})],1),i("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("Limit")]),i("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.onelimittimes,placeholder:"Limit"},model:{value:e.ruleForm.onelimittimes,callback:function(r){e.$set(e.ruleForm,"onelimittimes",r)},expression:"ruleForm.onelimittimes"}})],1),i("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("Remaining")]),i("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.alllimittimes,placeholder:"Remaining"},model:{value:e.ruleForm.alllimittimes,callback:function(r){e.$set(e.ruleForm,"alllimittimes",r)},expression:"ruleForm.alllimittimes"}})],1),i("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("Price")]),i("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.price,placeholder:"Price"},model:{value:e.ruleForm.price,callback:function(r){e.$set(e.ruleForm,"price",r)},expression:"ruleForm.price"}})],1),i("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("Group Price")]),i("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.groupprice,placeholder:"Group Price"},model:{value:e.ruleForm.groupprice,callback:function(r){e.$set(e.ruleForm,"groupprice",r)},expression:"ruleForm.groupprice"}})],1),i("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("Group number")]),i("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.grouppeople,placeholder:"Group number"},model:{value:e.ruleForm.grouppeople,callback:function(r){e.$set(e.ruleForm,"grouppeople",r)},expression:"ruleForm.grouppeople"}})],1),i("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("Current Number")]),i("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.curpeople,placeholder:"Current Number"},model:{value:e.ruleForm.curpeople,callback:function(r){e.$set(e.ruleForm,"curpeople",r)},expression:"ruleForm.curpeople"}})],1),i("v-uni-view",{style:{padding:"12rpx 0",margin:"0 0 24rpx 0",borderColor:"#ccc",borderWidth:"0 0 0px 0",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",fontWeight:"500"}},[e._v("Details")]),i("xia-editor",{style:{minHeight:"300rpx",border:"2rpx solid #ddd",padding:"24rpx",boxShadow:"0px 0.10rpx 2rpx #ccc",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",width:"100%",lineHeight:"1.5",height:"auto"},attrs:{placeholder:"Details"},on:{editorChange:function(r){arguments[0]=r=e.$handleEvent(r),e.chanpinxiangqingChange.apply(void 0,arguments)}},model:{value:e.ruleForm.chanpinxiangqing,callback:function(r){e.$set(e.ruleForm,"chanpinxiangqing",r)},expression:"ruleForm.chanpinxiangqing"}})],1),i("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"space-between",display:"flex",height:"auto"}},[i("v-uni-button",{staticClass:"bg-red",style:{border:"0",padding:"0px",boxShadow:"0px 4rpx 12rpx #ccc",margin:"0",color:"rgb(255, 255, 255)",borderRadius:"16rpx",background:"radial-gradient(circle, rgba(216,214,246,1) 0%, rgba(204,189,235,1) 24%, rgba(181,191,232,1) 62%, rgba(175,173,228,1) 100%)",width:"48%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("submit")])],1)],1),i("w-picker",{ref:"clicktime",attrs:{mode:"dateTime",step:"1",current:!1,hasSecond:!1,themeColor:"#333333"},on:{confirm:function(r){arguments[0]=r=e.$handleEvent(r),e.clicktimeConfirm.apply(void 0,arguments)}}})],1)],1)},a=[];i.d(r,"b",(function(){return n})),i.d(r,"c",(function(){return a})),i.d(r,"a",(function(){return t}))},c8b2:function(e,r,i){var t=i("ac2c");"string"===typeof t&&(t=[[e.i,t,""]]),t.locals&&(e.exports=t.locals);var n=i("4f06").default;n("bc42886c",t,!0,{sourceMap:!1,shadowMode:!1})},fb3c:function(e,r,i){"use strict";i.r(r);var t=i("92c6"),n=i.n(t);for(var a in t)"default"!==a&&function(e){i.d(r,e,(function(){return t[e]}))}(a);r["default"]=n.a}}]);