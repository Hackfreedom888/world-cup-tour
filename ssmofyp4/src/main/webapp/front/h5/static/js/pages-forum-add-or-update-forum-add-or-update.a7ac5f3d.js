(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-forum-add-or-update-forum-add-or-update"],{"0597":function(e,t,n){"use strict";var r={"xia-editor":n("064f").default},i=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("v-uni-view",{staticClass:"content"},[n("v-uni-view",{style:{width:"100%",padding:"0",position:"relative",background:"url(http://codegen.caihongy.cn/20221108/581bb1956ffe4c8182127ca1e196e95e.png) fixed",height:"100%"}},[n("v-uni-form",{style:{width:"100%",padding:"24rpx",background:"none",display:"block",height:"auto"}},[n("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[n("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"rgba(255, 255, 255, 0)",fontSize:"28rpx",height:"80rpx"},attrs:{placeholder:"Title"},model:{value:e.forum.title,callback:function(t){e.$set(e.forum,"title",t)},expression:"forum.title"}})],1),n("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[n("v-uni-picker",{style:{width:"100%",flex:"1",height:"auto"},attrs:{value:e.index,range:e.options},on:{change:function(t){arguments[0]=t=e.$handleEvent(t),e.setIsDoneTap.apply(void 0,arguments)}}},[n("v-uni-view",{staticClass:"uni-picker-type",style:{width:"100%",padding:"0 24rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#998dde"}},[e._v(e._s(e.options[e.index]))])],1)],1),n("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[n("xia-editor",{style:{border:"0",minHeight:"240rpx",padding:"24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"rgba(255, 255, 255, 0)",fontSize:"28rpx"},attrs:{placeholder:"Content"},on:{editorChange:function(t){arguments[0]=t=e.$handleEvent(t),e.contentChange.apply(void 0,arguments)}},model:{value:e.forum.content,callback:function(t){e.$set(e.forum,"content",t)},expression:"forum.content"}})],1),n("v-uni-view",{style:{width:"100%",justifyContent:"center",display:"flex",height:"auto"}},[n("v-uni-button",{staticClass:"bg-red margin-tb-sm",style:{border:"0",padding:"0px",boxShadow:"0px 4rpx 12rpx #ccc",margin:"24rpx 20rpx",color:"rgb(255, 255, 255)",borderRadius:"16rpx",background:"radial-gradient(circle, rgba(216,214,246,1) 0%, rgba(204,189,235,1) 24%, rgba(181,191,232,1) 62%, rgba(175,173,228,1) 100%)",width:"50%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("确认submit")])],1)],1)],1)],1)},a=[];n.d(t,"b",(function(){return i})),n.d(t,"c",(function(){return a})),n.d(t,"a",(function(){return r}))},"073b":function(e,t,n){"use strict";n.r(t);var r=n("0597"),i=n("96a8");for(var a in i)"default"!==a&&function(e){n.d(t,e,(function(){return i[e]}))}(a);n("c870");var o,s=n("f0c5"),d=Object(s["a"])(i["default"],r["b"],r["c"],!1,null,"4b7e26a7",null,!1,r["a"],o);t["default"]=d.exports},4280:function(e,t,n){"use strict";var r=n("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,n("96cf");var i=r(n("3b8d")),a=r(n("064f")),o={data:function(){return{forum:{content:"",id:"",title:"",isdone:"开放",parentid:0},index:0,options:["开放","关闭"],username:"",user:{}}},components:{xiaEditor:a.default},onLoad:function(){var e=(0,i.default)(regeneratorRuntime.mark((function e(t){var n,r,i;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return n=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(n);case 3:if(r=e.sent,this.user=r.data,"yonghu"==n&&(this.username=this.user.yonghuzhanghao),"banzhu"==n&&(this.username=this.user.banzhuzhanghao),!t.id){e.next=13;break}return this.id=t.id,e.next=11,this.$api.info("forum",this.id);case 11:i=e.sent,this.forum=i.data;case 13:this.styleChange();case 14:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),methods:{contentChange:function(e){this.forum.content=e},styleChange:function(){this.$nextTick((function(){}))},onSubmitTap:function(){var e=(0,i.default)(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.forum.username=this.username,!this.id){e.next=6;break}return e.next=4,this.$api.update("forum",this.forum);case 4:e.next=8;break;case 6:return e.next=8,this.$api.save("forum",this.forum);case 8:this.$utils.msgBack("Operation成功");case 9:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),setIsDoneTap:function(e){this.index=e.target.value,this.forum.isdone=this.options[this.index]}}};t.default=o},"96a8":function(e,t,n){"use strict";n.r(t);var r=n("4280"),i=n.n(r);for(var a in r)"default"!==a&&function(e){n.d(t,e,(function(){return r[e]}))}(a);t["default"]=i.a},ad36:function(e,t,n){var r=n("f34d");"string"===typeof r&&(r=[[e.i,r,""]]),r.locals&&(e.exports=r.locals);var i=n("4f06").default;i("b1453fd0",r,!0,{sourceMap:!1,shadowMode:!1})},c870:function(e,t,n){"use strict";var r=n("ad36"),i=n.n(r);i.a},f34d:function(e,t,n){var r=n("24fb");t=r(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便User通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过Modify这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* Image尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-4b7e26a7]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=t}}]);