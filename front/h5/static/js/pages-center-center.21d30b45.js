(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-center-center"],{"181b":function(e,i,t){var n=t("550e");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var r=t("4f06").default;r("cacbc376",n,!0,{sourceMap:!1,shadowMode:!1})},"27ae":function(e,i,t){"use strict";t.r(i);var n=t("55b4"),r=t.n(n);for(var a in n)"default"!==a&&function(e){t.d(i,e,(function(){return n[e]}))}(a);i["default"]=r.a},"550e":function(e,i,t){var n=t("24fb");i=n(!1),i.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-ac0dec0c]{height:calc(100vh - 94px);box-sizing:border-box}',""]),e.exports=i},"55b4":function(e,i,t){"use strict";var n=t("4ea4");Object.defineProperty(i,"__esModule",{value:!0}),i.default=void 0,t("96cf");var r=n(t("3b8d")),a=n(t("2971")),o={data:function(){return{isH5Plus:!0,user:{},tableName:"",role:"",menuList:[],iconArr:["cuIcon-same","cuIcon-deRecordingr","cuIcon-evaluate","cuIcon-shop","cuIcon-ticket","cuIcon-cascades","cuIcon-discover","cuIcon-question","cuIcon-pic","cuIcon-filter","cuIcon-footprint","cuIcon-pulldown","cuIcon-pullup","cuIcon-moreandroid","cuIcon-refund","cuIcon-qrcode","cuIcon-remind","cuIcon-profile","cuIcon-home","cuIcon-message","cuIcon-link","cuIcon-lock","cuIcon-unlock","cuIcon-vip","cuIcon-weibo","cuIcon-activity","cuIcon-friendadd","cuIcon-friendfamous","cuIcon-friend","cuIcon-goods","cuIcon-selection"]}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var i,t,n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.role=uni.getStorageSync("role"),i=uni.getStorageSync("nowTable"),e.next=4,this.$api.session(i);case 4:t=e.sent,this.user=t.data,this.tableName=i,n=a.default.list(),this.menuList=n;case 9:case"end":return e.stop()}}),e,this)})));function i(){return e.apply(this,arguments)}return i}(),onShow:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var i,t,n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return uni.removeStorageSync("useridTag"),this.role=uni.getStorageSync("role"),i=uni.getStorageSync("nowTable"),e.next=5,this.$api.session(i);case 5:t=e.sent,this.user=t.data,this.tableName=i,n=a.default.list(),this.menuList=n;case 10:case"end":return e.stop()}}),e,this)})));function i(){return e.apply(this,arguments)}return i}(),methods:{onPageTap:function(e){uni.setStorageSync("useridTag",1),uni.navigateTo({url:e,fail:function(){uni.switchTab({url:e})}})}}};i.default=o},"6d5a":function(e,i,t){"use strict";var n,r=function(){var e=this,i=e.$createElement,t=e._self._c||i;return t("v-uni-view",{staticClass:"content"},[t("v-uni-view",{style:{width:"100%",padding:"0 0 64rpx",position:"relative",background:"url(http://codegen.caihongy.cn/20221108/581bb1956ffe4c8182127ca1e196e95e.png) fixed",height:"100%"}},[t("v-uni-view",{staticClass:"header",class:{status:e.isH5Plus},style:{padding:"0 24rpx",boxShadow:"0px 4rpx 4rpx #ccc",margin:"0 0 24rpx 0",background:"url(http://codegen.caihongy.cn/20221109/53c3ca7135ec48488fc0683a2bf29ddf.jpg) no-repeat",display:"flex",width:"100%",backgroundSize:"100%",height:"280rpx"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onPageTap("../user-info/user-info")}}},["yonghu"==e.tableName?t("v-uni-view",{staticClass:"userinfo",style:{width:"calc(100% - 112rpx)",alignItems:"center",display:"flex",height:"100%"}},[t("v-uni-image",{style:{width:"88rpx",padding:"0",margin:"0 20rpx 0 0",borderRadius:"100%",height:"88rpx"},attrs:{src:e.user.touxiang?e.baseUrl+e.user.touxiang:"/static/gen/upload.png"}}),t("v-uni-view",{staticClass:"info",style:{width:"100%",flex:"1",flexDirection:"column",justifyContent:"center",display:"flex",height:"100%"}},[t("v-uni-view",{style:{width:"100%",lineHeight:"36rpx",fontSize:"24rpx",color:"#333"}},[e._v(e._s(e.user.yonghuzhanghao)),e.user.vip&&"是"==e.user.vip?t("v-uni-text",[e._v("(VIP)")]):e._e()],1),e.user.money?t("v-uni-view",{style:{width:"100%",lineHeight:"36rpx",fontSize:"24rpx",color:"#333"}},[e._v("余额："+e._s(e.user.money))]):e._e(),e.user.jf||0==e.user.jf?t("v-uni-view",{style:{width:"100%",lineHeight:"36rpx",fontSize:"24rpx",color:"#333"}},[e._v("积分："+e._s(e.user.jf))]):e._e()],1)],1):e._e(),"banzhu"==e.tableName?t("v-uni-view",{staticClass:"userinfo",style:{width:"calc(100% - 112rpx)",alignItems:"center",display:"flex",height:"100%"}},[t("v-uni-image",{style:{width:"88rpx",padding:"0",margin:"0 20rpx 0 0",borderRadius:"100%",height:"88rpx"},attrs:{src:e.user.touxiang?e.baseUrl+e.user.touxiang:"/static/gen/upload.png"}}),t("v-uni-view",{staticClass:"info",style:{width:"100%",flex:"1",flexDirection:"column",justifyContent:"center",display:"flex",height:"100%"}},[t("v-uni-view",{style:{width:"100%",lineHeight:"36rpx",fontSize:"24rpx",color:"#333"}},[e._v(e._s(e.user.banzhuzhanghao)),e.user.vip&&"是"==e.user.vip?t("v-uni-text",[e._v("(VIP)")]):e._e()],1),e.user.money?t("v-uni-view",{style:{width:"100%",lineHeight:"36rpx",fontSize:"24rpx",color:"#333"}},[e._v("余额："+e._s(e.user.money))]):e._e(),e.user.jf||0==e.user.jf?t("v-uni-view",{style:{width:"100%",lineHeight:"36rpx",fontSize:"24rpx",color:"#333"}},[e._v("积分："+e._s(e.user.jf))]):e._e()],1)],1):e._e(),t("v-uni-view",{staticClass:"setting",style:{width:"112rpx",alignItems:"center",justifyContent:"center",display:"flex",height:"100%"}},[t("v-uni-view",{staticClass:"cuIcon-settings",style:{border:"0",width:"64rpx",lineHeight:"64rpx",fontSize:"64rpx",color:"#333",borderRadius:"0"}})],1)],1),t("v-uni-view",{staticClass:"list",style:{width:"100%",padding:"0 24rpx",flexWrap:"wrap",background:"none",display:"flex",height:"auto"}},[e._l(e.menuList,(function(i){return[e._l(i.backMenu,(function(n,r){return e.role==i.roleName?[e._l(n.child,(function(i,n){return["yifahuodingdan"!=i.tableName&&"yituikuandingdan"!=i.tableName&&"yiquxiaodingdan"!=i.tableName&&"weizhifudingdan"!=i.tableName&&"yizhifudingdan"!=i.tableName&&"yiwanchengdingdan"!=i.tableName&&"exampaper"!=i.tableName&&"examquestion"!=i.tableName?t("v-uni-view",{key:n+"_0",staticClass:"li",style:{boxShadow:"0px 0.10rpx 2rpx #ccc",borderColor:"#ccc",margin:"0 0 16rpx",alignItems:"center",borderWidth:"0 0 2rpx",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},attrs:{"hover-class":"hover"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../"+i.tableName+"/list?userid="+e.user.id)}}},[t("v-uni-view",{class:i.appFrontIcon,style:{width:"64rpx",padding:"0 0 0 16rpx",lineHeight:"64rpx",fontSize:"64rpx",color:"#afade4"}}),t("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 32rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v(e._s(i.menu))]),t("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",padding:"0 48rpx 0 0",lineHeight:"28rpx",fontSize:"28rpx",color:"#999"}})],1):e._e()]}))]:e._e()}))]})),t("v-uni-view",{staticClass:"li",style:{boxShadow:"0px 0.10rpx 2rpx #ccc",borderColor:"#ccc",margin:"0 0 16rpx",alignItems:"center",borderWidth:"0 0 2rpx",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},attrs:{"hover-class":"hover"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onPageTap("../shop-recharge/pay-confirm")}}},[t("v-uni-view",{staticClass:"cuIcon-moneybag",style:{width:"64rpx",padding:"0 0 0 16rpx",lineHeight:"64rpx",fontSize:"64rpx",color:"#afade4"}}),t("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 32rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v("Top up")]),t("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",padding:"0 48rpx 0 0",lineHeight:"28rpx",fontSize:"28rpx",color:"#999"}})],1),t("v-uni-view",{staticClass:"li",style:{boxShadow:"0px 0.10rpx 2rpx #ccc",borderColor:"#ccc",margin:"0 0 16rpx",alignItems:"center",borderWidth:"0 0 2rpx",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},attrs:{"hover-class":"hover"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onPageTap("../forum-add-or-update/forum-add-or-update")}}},[t("v-uni-view",{staticClass:"cuIcon-scan",style:{width:"64rpx",padding:"0 0 0 16rpx",lineHeight:"64rpx",fontSize:"64rpx",color:"#afade4"}}),t("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 32rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v("Create new post")]),t("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",padding:"0 48rpx 0 0",lineHeight:"28rpx",fontSize:"28rpx",color:"#999"}})],1),t("v-uni-view",{staticClass:"li",style:{boxShadow:"0px 0.10rpx 2rpx #ccc",borderColor:"#ccc",margin:"0 0 16rpx",alignItems:"center",borderWidth:"0 0 2rpx",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},attrs:{"hover-class":"hover"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onPageTap("../forum-my/forum-my")}}},[t("v-uni-view",{staticClass:"cuIcon-scan",style:{width:"64rpx",padding:"0 0 0 16rpx",lineHeight:"64rpx",fontSize:"64rpx",color:"#afade4"}}),t("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 32rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v("My posts")]),t("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",padding:"0 48rpx 0 0",lineHeight:"28rpx",fontSize:"28rpx",color:"#999"}})],1),t("v-uni-view",{staticClass:"li",style:{boxShadow:"0px 0.10rpx 2rpx #ccc",borderColor:"#ccc",margin:"0 0 16rpx",alignItems:"center",borderWidth:"0 0 2rpx",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},attrs:{"hover-class":"hover"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onPageTap("../shop-cart/shop-cart")}}},[t("v-uni-view",{staticClass:"cuIcon-cart",style:{width:"64rpx",padding:"0 0 0 16rpx",lineHeight:"64rpx",fontSize:"64rpx",color:"#afade4"}}),t("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 32rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v("Cart")]),t("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",padding:"0 48rpx 0 0",lineHeight:"28rpx",fontSize:"28rpx",color:"#999"}})],1),t("v-uni-view",{staticClass:"li",style:{boxShadow:"0px 0.10rpx 2rpx #ccc",borderColor:"#ccc",margin:"0 0 16rpx",alignItems:"center",borderWidth:"0 0 2rpx",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},attrs:{"hover-class":"hover"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onPageTap("../shop-order/shop-order")}}},[t("v-uni-view",{staticClass:"cuIcon-order",style:{width:"64rpx",padding:"0 0 0 16rpx",lineHeight:"64rpx",fontSize:"64rpx",color:"#afade4"}}),t("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 32rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v("Shopping orders")]),t("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",padding:"0 48rpx 0 0",lineHeight:"28rpx",fontSize:"28rpx",color:"#999"}})],1),t("v-uni-view",{staticClass:"li",style:{boxShadow:"0px 0.10rpx 2rpx #ccc",borderColor:"#ccc",margin:"0 0 16rpx",alignItems:"center",borderWidth:"0 0 2rpx",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},attrs:{"hover-class":"hover"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onPageTap("../messages/list")}}},[t("v-uni-view",{staticClass:"cuIcon-message",style:{width:"64rpx",padding:"0 0 0 16rpx",lineHeight:"64rpx",fontSize:"64rpx",color:"#afade4"}}),t("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 32rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v("Suggestion")]),t("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",padding:"0 48rpx 0 0",lineHeight:"28rpx",fontSize:"28rpx",color:"#999"}})],1)],2)],1)],1)},a=[];t.d(i,"b",(function(){return r})),t.d(i,"c",(function(){return a})),t.d(i,"a",(function(){return n}))},d2c0:function(e,i,t){"use strict";t.r(i);var n=t("6d5a"),r=t("27ae");for(var a in r)"default"!==a&&function(e){t.d(i,e,(function(){return r[e]}))}(a);t("e170");var o,c=t("f0c5"),s=Object(c["a"])(r["default"],n["b"],n["c"],!1,null,"ac0dec0c",null,!1,n["a"],o);i["default"]=s.exports},e170:function(e,i,t){"use strict";var n=t("181b"),r=t.n(n);r.a}}]);