(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-news-add-or-update"],{1181:function(t,e,r){var i=r("660e");"string"===typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);var n=r("4f06").default;n("6dd1a9e2",i,!0,{sourceMap:!1,shadowMode:!1})},"42a0":function(t,e,r){"use strict";var i=r("1181"),n=r.n(i);n.a},"660e":function(t,e,r){var i=r("24fb");e=i(!1),e.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便User通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过Modify这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* Image尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-238d85c6]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),t.exports=e},"7bd3":function(t,e,r){"use strict";var i={"xia-editor":r("064f").default},n=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("v-uni-view",{staticClass:"content"},[r("v-uni-view",{style:{width:"100%",padding:"0 0 64rpx",position:"relative",background:"url(http://codegen.caihongy.cn/20221108/581bb1956ffe4c8182127ca1e196e95e.png) fixed",height:"auto"}},[r("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx",background:"none",display:"block",height:"auto"}},[r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[t._v("Title")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:t.ro.title,placeholder:"Title"},model:{value:t.ruleForm.title,callback:function(e){t.$set(t.ruleForm,"title",e)},expression:"ruleForm.title"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.pictureTap.apply(void 0,arguments)}}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[t._v("Image")]),t.ruleForm.picture?r("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:t.baseUrl+t.ruleForm.picture,mode:"aspectFill"}}):r("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[t._v("Brief Introduction")]),r("v-uni-textarea",{style:{border:"0",minHeight:"240rpx",padding:"24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"rgba(255, 255, 255, 0)",fontSize:"28rpx"},attrs:{placeholder:"Brief Introduction"},model:{value:t.ruleForm.introduction,callback:function(e){t.$set(t.ruleForm,"introduction",e)},expression:"ruleForm.introduction"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",margin:"0 0 24rpx 0",borderColor:"#ccc",borderWidth:"0 0 0px 0",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",fontWeight:"500"}},[t._v("Content")]),r("xia-editor",{style:{minHeight:"300rpx",border:"2rpx solid #ddd",padding:"24rpx",boxShadow:"0px 0.10rpx 2rpx #ccc",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",width:"100%",lineHeight:"1.5",height:"auto"},attrs:{placeholder:"Content"},on:{editorChange:function(e){arguments[0]=e=t.$handleEvent(e),t.contentChange.apply(void 0,arguments)}},model:{value:t.ruleForm.content,callback:function(e){t.$set(t.ruleForm,"content",e)},expression:"ruleForm.content"}})],1),r("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"space-between",display:"flex",height:"auto"}},[r("v-uni-button",{staticClass:"bg-red",style:{border:"0",padding:"0px",boxShadow:"0px 4rpx 12rpx #ccc",margin:"0",color:"rgb(255, 255, 255)",borderRadius:"16rpx",background:"radial-gradient(circle, rgba(216,214,246,1) 0%, rgba(204,189,235,1) 24%, rgba(181,191,232,1) 62%, rgba(175,173,228,1) 100%)",width:"48%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onSubmitTap.apply(void 0,arguments)}}},[t._v("submit")])],1)],1)],1)],1)},a=[];r.d(e,"b",(function(){return n})),r.d(e,"c",(function(){return a})),r.d(e,"a",(function(){return i}))},"8ad2":function(t,e,r){"use strict";var i=r("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,r("a481"),r("c5f6"),r("f559"),r("ac6a"),r("96cf");var n=i(r("3b8d")),a=i(r("e2b1")),o=i(r("064f")),s={data:function(){return{cross:"",ruleForm:{title:"",introduction:"",picture:"",content:""},user:{},ro:{title:!1,introduction:!1,picture:!1,content:!1}}},components:{wPicker:a.default,xiaEditor:o.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(e){var r,i,n,a;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return r=uni.getStorageSync("nowTable"),t.next=3,this.$api.session(r);case 3:if(i=t.sent,this.user=i.data,this.ruleForm.userid=uni.getStorageSync("userid"),e.refid&&(this.ruleForm.refid=e.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!e.id){t.next=13;break}return this.ruleForm.id=e.id,t.next=11,this.$api.info("news",this.ruleForm.id);case 11:i=t.sent,this.ruleForm=i.data;case 13:if(this.cross=e.cross,!e.cross){t.next=37;break}n=uni.getStorageSync("crossObj"),t.t0=regeneratorRuntime.keys(n);case 17:if((t.t1=t.t0()).done){t.next=37;break}if(a=t.t1.value,"title"!=a){t.next=23;break}return this.ruleForm.title=n[a],this.ro.title=!0,t.abrupt("continue",17);case 23:if("introduction"!=a){t.next=27;break}return this.ruleForm.introduction=n[a],this.ro.introduction=!0,t.abrupt("continue",17);case 27:if("picture"!=a){t.next=31;break}return this.ruleForm.picture=n[a],this.ro.picture=!0,t.abrupt("continue",17);case 31:if("content"!=a){t.next=35;break}return this.ruleForm.content=n[a],this.ro.content=!0,t.abrupt("continue",17);case 35:t.next=17;break;case 37:this.styleChange();case 38:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),methods:{contentChange:function(t){this.ruleForm.content=t},styleChange:function(){this.$nextTick((function(){}))},pictureTap:function(){var t=this;this.$api.upload((function(e){t.ruleForm.picture="upload/"+e.file,t.$forceUpdate(),t.$nextTick((function(){t.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(){var e,r,i,n,a,o,s,c,u,l;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.ruleForm.title){t.next=3;break}return this.$utils.msg("Title不能为空"),t.abrupt("return");case 3:if(this.ruleForm.picture){t.next=6;break}return this.$utils.msg("Image不能为空"),t.abrupt("return");case 6:if(this.ruleForm.content){t.next=9;break}return this.$utils.msg("Content不能为空"),t.abrupt("return");case 9:if(!this.cross){t.next=25;break}if(a=uni.getStorageSync("statusColumnName"),o=uni.getStorageSync("statusColumnValue"),""==a){t.next=25;break}if(e||(e=uni.getStorageSync("crossObj")),a.startsWith("[")){t.next=21;break}for(s in e)s==a&&(e[s]=o);return c=uni.getStorageSync("crossTable"),t.next=19,this.$api.update("".concat(c),e);case 19:t.next=25;break;case 21:r=Number(uni.getStorageSync("userid")),i=e["id"],n=uni.getStorageSync("statusColumnName"),n=n.replace(/\[/,"").replace(/\]/,"");case 25:if(!i||!r){t.next=47;break}return this.ruleForm.crossuserid=r,this.ruleForm.crossrefid=i,u={page:1,limit:10,crossuserid:r,crossrefid:i},t.next=31,this.$api.list("news",u);case 31:if(l=t.sent,!(l.data.total>=n)){t.next=37;break}return this.$utils.msg(uni.getStorageSync("tips")),t.abrupt("return",!1);case 37:if(!this.ruleForm.id){t.next=42;break}return t.next=40,this.$api.update("news",this.ruleForm);case 40:t.next=44;break;case 42:return t.next=44,this.$api.add("news",this.ruleForm);case 44:this.$utils.msgBack("submit成功");case 45:t.next=55;break;case 47:if(!this.ruleForm.id){t.next=52;break}return t.next=50,this.$api.update("news",this.ruleForm);case 50:t.next=54;break;case 52:return t.next=54,this.$api.add("news",this.ruleForm);case 54:this.$utils.msgBack("submit成功");case 55:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),optionsChange:function(t){this.index=t.target.value},bindDateChange:function(t){this.date=t.target.value},getDate:function(t){var e=new Date,r=e.getFullYear(),i=e.getMonth()+1,n=e.getDate();return"start"===t?r-=60:"end"===t&&(r+=2),i=i>9?i:"0"+i,n=n>9?n:"0"+n,"".concat(r,"-").concat(i,"-").concat(n)},toggleTab:function(t){this.$refs[t].show()}}};e.default=s},"9e70":function(t,e,r){"use strict";r.r(e);var i=r("7bd3"),n=r("e23c");for(var a in n)"default"!==a&&function(t){r.d(e,t,(function(){return n[t]}))}(a);r("42a0");var o,s=r("f0c5"),c=Object(s["a"])(n["default"],i["b"],i["c"],!1,null,"238d85c6",null,!1,i["a"],o);e["default"]=c.exports},e23c:function(t,e,r){"use strict";r.r(e);var i=r("8ad2"),n=r.n(i);for(var a in i)"default"!==a&&function(t){r.d(e,t,(function(){return i[t]}))}(a);e["default"]=n.a}}]);