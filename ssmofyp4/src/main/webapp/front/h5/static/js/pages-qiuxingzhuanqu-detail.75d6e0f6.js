(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-qiuxingzhuanqu-detail"],{"03a2":function(t,e,i){"use strict";var r=i("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("a481"),i("28a5"),i("f559"),i("55dd"),i("96cf");var n=r(i("3b8d")),a={data:function(){return{btnColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],id:"",userid:"",detail:{},swiperList:[],commentList:[],mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:3,textNoMore:"~ 没有更多了 ~"},hasNext:!0,user:{},storeupFlag:0,count:0,timer:null}},computed:{baseUrl:function(){return this.$base.url},SecondToDate:function(){var t=this.count;return null!=t&&""!=t&&(t=t>60&&t<3600?parseInt(t/60)+"分钟"+parseInt(60*(parseFloat(t/60)-parseInt(t/60)))+"秒":t>=3600&&t<86400?parseInt(t/3600)+"小时"+parseInt(60*(parseFloat(t/3600)-parseInt(t/3600)))+"分钟"+parseInt(60*(parseFloat(60*(parseFloat(t/3600)-parseInt(t/3600)))-parseInt(60*(parseFloat(t/3600)-parseInt(t/3600)))))+"秒":t>=86400?parseInt(t/3600/24)+"天"+parseInt(24*(parseFloat(t/3600/24)-parseInt(t/3600/24)))+"小时"+parseInt(60*(parseFloat(t/3600)-parseInt(t/3600)))+"分钟"+parseInt(60*(parseFloat(60*(parseFloat(t/3600)-parseInt(t/3600)))-parseInt(60*(parseFloat(t/3600)-parseInt(t/3600)))))+"秒":parseInt(t)+"秒"),t}},onLoad:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(e){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:this.id=e.id,e.userid&&(this.userid=e.userid);case 2:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),onShow:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(e){var i,r,n;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return this.init(),i=uni.getStorageSync("nowTable"),t.next=4,this.$api.session(i);case 4:r=t.sent,this.user=r.data,this.btnColor=this.btnColor.sort((function(){return.5-Math.random()})),this.getStoreup(),n=uni.getStorageSync("discussqiuxingzhuanquCleanType"),n&&(uni.removeStorageSync("discussqiuxingzhuanquCleanType"),this.mescroll.num=1,this.upCallback(this.mescroll));case 10:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),destroyed:function(){},methods:{onPayTap:function(){uni.setStorageSync("paytable","qiuxingzhuanqu"),uni.setStorageSync("payObject",this.detail),this.$utils.jump("../pay-confirm/pay-confirm?type=1")},onDetailTap:function(t){uni.setStorageSync("useridTag",this.userid),this.$utils.jump("./detail?id=".concat(t.id,"&userid=")+this.userid)},getStoreup:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(){var e,i;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return e={page:1,limit:1,refid:this.id,tablename:"qiuxingzhuanqu",userid:this.user.id,type:1},t.next=3,this.$api.list("storeup",e);case 3:i=t.sent,this.storeupFlag=i.data.list.length;case 5:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),shoucang:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(){var e,i,r,a;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return e=this,i={page:1,limit:1,refid:e.detail.id,tablename:"qiuxingzhuanqu",userid:e.user.id,type:1},t.next=4,e.$api.list("storeup",i);case 4:if(r=t.sent,1!=r.data.list.length){t.next=9;break}return a=r.data.list[0].id,uni.showModal({title:"提示",content:"是否cancel",success:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(i){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!i.confirm){t.next=5;break}return t.next=3,e.$api.del("storeup",JSON.stringify([a]));case 3:e.$utils.msg("cancel成功"),e.getStoreup();case 5:case"end":return t.stop()}}),t)})));function i(e){return t.apply(this,arguments)}return i}()}),t.abrupt("return");case 9:uni.showModal({title:"提示",content:"是否收藏",success:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(i){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!i.confirm){t.next=5;break}return t.next=3,e.$api.add("storeup",{userid:e.user.id,name:e.detail.qiuyuanxingming,picture:e.swiperList[0],refid:e.detail.id,tablename:"qiuxingzhuanqu",type:1});case 3:e.$utils.msg("收藏成功"),e.getStoreup();case 5:case"end":return t.stop()}}),t)})));function i(e){return t.apply(this,arguments)}return i}()});case 10:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),onAcrossTap:function(t,e,i,r,n){if(uni.setStorageSync("crossTable","qiuxingzhuanqu"),uni.setStorageSync("crossObj",this.detail),uni.setStorageSync("statusColumnName",i),uni.setStorageSync("statusColumnValue",n),uni.setStorageSync("tips",r),""!=i&&!i.startsWith("[")){var a=uni.getStorageSync("crossObj");for(var s in a)if(s==i&&a[s]==n)return void this.$utils.msg(r)}this.$utils.jump("../".concat(t,"/add-or-update?cross=true"))},init:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(){var e;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,this.$api.info("qiuxingzhuanqu",this.id);case 2:e=t.sent,this.detail=e.data,this.swiperList=this.detail.touxiang?this.detail.touxiang.split(","):[],this.detail.qiuyuanlvli=this.detail.qiuyuanlvli.replace(/img src/gi,'img style="width:100%;" src');case 6:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),mescrollInit:function(t){this.mescroll=t},downCallback:function(t){this.hasNext=!0,t.resetUpScroll()},upCallback:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(e){var i;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,this.$api.list("discussqiuxingzhuanqu",{page:e.num,limit:10,refid:this.id});case 2:i=t.sent,1==e.num&&(this.commentList=[]),this.commentList=this.commentList.concat(i.data.list),0==i.data.list.length&&(this.hasNext=!1),e.endSuccess(e.size,this.hasNext);case 7:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),onChatTap:function(){this.$utils.jump("../chat/chat")},download:function(t){var e=this;t=e.$base.url+t,uni.downloadFile({url:t,success:function(i){200===i.statusCode&&(e.$utils.msg("下载成功"),window.open(t))}})},onCartTabTap:function(){this.$utils.tab("../shop-cart/shop-cart")},onCommentTap:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:this.$utils.jump("../discussqiuxingzhuanqu/add-or-update?refid=".concat(this.id));case 1:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),onSHTap:function(){this.$refs.popup.open()}}};e.default=a},"1eff":function(t,e,i){"use strict";var r={"mescroll-uni":i("f05e").default},n=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("v-uni-view",[i("mescroll-uni",{attrs:{up:t.upOption,down:t.downOption},on:{init:function(e){arguments[0]=e=t.$handleEvent(e),t.mescrollInit.apply(void 0,arguments)},down:function(e){arguments[0]=e=t.$handleEvent(e),t.downCallback.apply(void 0,arguments)},up:function(e){arguments[0]=e=t.$handleEvent(e),t.upCallback.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{staticClass:"container",style:{width:"100%",padding:"0",position:"relative",background:"url(http://codegen.caihongy.cn/20221108/581bb1956ffe4c8182127ca1e196e95e.png) fixed",height:"auto"}},[i("v-uni-swiper",{staticClass:"swiper",style:{width:"100%",background:"#fff",height:"360rpx"},attrs:{"indicator-dots":!1,autoplay:!0,circular:!1,"indicator-active-color":"#000000","indicator-color":"rgba(0, 0, 0, .3)",duration:500,interval:5e3,vertical:!1}},t._l(t.swiperList,(function(e,r){return i("v-uni-swiper-item",{key:r,style:{width:"100%",background:"none",height:"360rpx"}},["http"==e.substring(0,4)?i("v-uni-image",{style:{width:"100%",objectFit:"cover",display:"block",height:"360rpx"},attrs:{mode:"aspectFill",src:e}}):i("v-uni-image",{style:{width:"100%",objectFit:"cover",display:"block",height:"360rpx"},attrs:{mode:"aspectFill",src:t.baseUrl+e}})],1)})),1),i("v-uni-view",{staticClass:"detail-content",style:{width:"100%",padding:"24rpx",background:"none",height:"auto"}},[i("v-uni-view",{staticClass:"detail-list-item price priceFavor",style:{boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 16rpx 0",borderColor:"#ccc",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",justifyContent:"space-between",height:"auto"}},[1==t.storeupFlag?i("v-uni-view",{staticClass:"cuIcon-favorfill",style:{padding:"0 24rpx 0 0",lineHeight:"80rpx",fontSize:"48rpx",color:"#6553CA",display:"block"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.shoucang.apply(void 0,arguments)}}}):t._e(),0==t.storeupFlag?i("v-uni-view",{staticClass:"cuIcon-favor",style:{padding:"0 24rpx 0 0",lineHeight:"80rpx",fontSize:"48rpx",color:"#6553CA",display:"block"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.shoucang.apply(void 0,arguments)}}}):t._e()],1),i("v-uni-view",{staticClass:"detail-list-item title",style:{boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 16rpx 0",borderColor:"#ccc",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[t._v("Name：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px",margin:"0px",lineHeight:"80rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)"}},[t._v(t._s(t.detail.qiuyuanxingming))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 16rpx 0",borderColor:"#ccc",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[t._v("Jersey number：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px",margin:"0px",lineHeight:"80rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)"}},[t._v(t._s(t.detail.qiuyihaoma))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 16rpx 0",borderColor:"#ccc",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[t._v("Position：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px",margin:"0px",lineHeight:"80rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)"}},[t._v(t._s(t.detail.qiuchangweizhi))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 16rpx 0",borderColor:"#ccc",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[t._v("Team：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px",margin:"0px",lineHeight:"80rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)"}},[t._v(t._s(t.detail.suoshuqiudui))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 16rpx 0",borderColor:"#ccc",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[t._v("Height：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px",margin:"0px",lineHeight:"80rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)"}},[t._v(t._s(t.detail.shengao))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 16rpx 0",borderColor:"#ccc",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[t._v("Weight：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px",margin:"0px",lineHeight:"80rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)"}},[t._v(t._s(t.detail.tizhong))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 16rpx 0",borderColor:"#ccc",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[t._v("Birthday：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px",margin:"0px",lineHeight:"80rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)"}},[t._v(t._s(t.detail.shengri))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{boxShadow:"0px 0.10rpx 4rpx #ccc",margin:"0 0 16rpx 0",borderColor:"#ccc",borderWidth:"0 0 2rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[t._v("Age：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px",margin:"0px",lineHeight:"80rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)"}},[t._v(t._s(t.detail.nianling))])],1),i("v-uni-view",{staticClass:"detail-list-item video",style:{margin:"0 0 24rpx 0",borderColor:"#ccc",borderWidth:"0 0 2rpx 0",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-video",{style:{border:"0",width:"100%",margin:"0",outline:"none",borderRadius:"8rpx",display:"block"},attrs:{id:"myVideo",src:t.baseUrl+t.detail.gerenjijin,controls:!0}})],1),i("v-uni-view",{staticClass:"detail-list-item rich",style:{margin:"0 0 24rpx 0",borderColor:"#ccc",borderWidth:"0 0 0px 0",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[t._v("Background")]),i("v-uni-view",{staticClass:"rich-text",style:{border:"2rpx solid #ccc",minHeight:"240rpx",padding:"20rpx",boxShadow:"0px 0.10rpx 2rpx #ccc",margin:"0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",width:"calc(100% - 160rpx)",lineHeight:"1.5"}},[i("v-uni-rich-text",{attrs:{nodes:t.detail.qiuyuanlvli}})],1)],1),i("v-uni-view",{staticClass:"time-content",style:{width:"100%",margin:"40rpx 0 40rpx 0",height:"auto"}},[i("v-uni-view",{staticClass:"comoment-header",style:{boxShadow:"rgb(0 0 0 / 20%) 0px 4rpx 8rpx",margin:"0 0 32rpx",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",justifyContent:"space-between",height:"auto"}},[i("v-uni-view",{style:{padding:"0 24rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#333"}},[t._v("评论")]),i("v-uni-view",{staticClass:"btn-comment-content",staticStyle:{display:"flex","align-items":"center"},style:{padding:"0 20rpx",background:"#a9a7e5",display:"flex"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onCommentTap.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"cuIcon-add",style:{margin:"0 8rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#fff"}}),i("v-uni-view",{style:{color:"#fff",lineHeight:"80rpx",fontSize:"28rpx"}},[t._v("添加评论")])],1)],1),t._l(t.commentList,(function(e,r){return i("v-uni-view",{key:r,staticClass:"cu-item comment-item",style:{width:"100%",boxShadow:"0 4rpx 6rpx rgb(0 0 0 / 20%)",padding:"24rpx",margin:"32rpx 0 32rpx 0",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",height:"auto"}},[i("v-uni-view",{style:{width:"100%",display:"flex",height:"auto"}},[e.avatarurl?i("v-uni-image",{style:{width:"60rpx",margin:"0 8rpx 0 0",borderRadius:"100%",display:"block",height:"60rpx"},attrs:{mode:"aspectFill",src:t.baseUrl+e.avatarurl}}):t._e(),i("v-uni-view",{staticClass:"text-grey",style:{color:"#333",lineHeight:"60rpx",fontSize:"28rpx"}},[t._v(t._s(e.nickname))])],1),i("v-uni-view",{staticClass:"text-gray text-content text-df",style:{margin:"8rpx 0",lineHeight:"1.5",fontSize:"28rpx",color:"#666"}},[t._v(t._s(e.content))]),i("v-uni-view",{staticClass:"margin-top-sm text-gray text-df",style:{color:"#999",lineHeight:"24rpx",fontSize:"24rpx"}},[t._v(t._s(e.addtime))]),e.reply?i("v-uni-view",{staticClass:"text-gray text-content text-df",style:{margin:"8rpx 0",lineHeight:"1.5",fontSize:"28rpx",color:"#666"}},[t._v("回复:"+t._s(e.reply))]):t._e()],1)}))],2),i("v-uni-view",{staticClass:"bottom-content bg-white tabbar border shop",style:{width:"100%",padding:"10rpx 24rpx",flexWrap:"wrap",background:"rebeccapurple",display:"flex",height:"auto"}})],1)],1)],1)],1)],1)},a=[];i.d(e,"b",(function(){return n})),i.d(e,"c",(function(){return a})),i.d(e,"a",(function(){return r}))},"30f0":function(t,e,i){"use strict";i.r(e);var r=i("03a2"),n=i.n(r);for(var a in r)"default"!==a&&function(t){i.d(e,t,(function(){return r[t]}))}(a);e["default"]=n.a},ad54:function(t,e,i){"use strict";i.r(e);var r=i("1eff"),n=i("30f0");for(var a in n)"default"!==a&&function(t){i.d(e,t,(function(){return n[t]}))}(a);i("dbd1");var s,o=i("f0c5"),l=Object(o["a"])(n["default"],r["b"],r["c"],!1,null,"377a8e78",null,!1,r["a"],s);e["default"]=l.exports},b322:function(t,e,i){var r=i("ee73");"string"===typeof r&&(r=[[t.i,r,""]]),r.locals&&(t.exports=r.locals);var n=i("4f06").default;n("2585ca04",r,!0,{sourceMap:!1,shadowMode:!1})},dbd1:function(t,e,i){"use strict";var r=i("b322"),n=i.n(r);n.a},ee73:function(t,e,i){var r=i("24fb");e=r(!1),e.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便User通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过Modify这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* Image尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-377a8e78]{min-height:calc(100vh - 44px);box-sizing:border-box}.seat-list[data-v-377a8e78]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;background:#fff;margin:%?20?%;border-radius:%?20?%;padding:%?20?%;font-size:%?30?%}.seat-list .seat-item[data-v-377a8e78]{width:33.33%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;margin-bottom:%?20?%}.seat-list .seat-item .seat-icon[data-v-377a8e78]{width:%?50?%;height:%?50?%;margin-bottom:%?10?%}uni-audio[data-v-377a8e78]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column}.audio[data-v-377a8e78] .uni-audio-default{width:inherit}',""]),t.exports=e}}]);