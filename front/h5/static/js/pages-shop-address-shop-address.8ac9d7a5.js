(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-shop-address-shop-address"],{"228f":function(t,e,n){"use strict";var i=n("71fc"),a=n.n(i);a.a},"71fc":function(t,e,n){var i=n("e683");"string"===typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);var a=n("4f06").default;a("250bf968",i,!0,{sourceMap:!1,shadowMode:!1})},a45c:function(t,e,n){"use strict";var i,a=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("v-uni-view",{staticClass:"content b-t"},[t._l(t.list,(function(e,i){return n("v-uni-view",{key:i,staticClass:"list b-b",on:{click:function(n){arguments[0]=n=t.$handleEvent(n),t.onSelectTap(e)}}},[n("v-uni-view",{staticClass:"wrapper"},[n("v-uni-view",{staticClass:"address-box"},["是"==e.isdefault?n("v-uni-text",{staticClass:"tag"},[t._v("默认")]):t._e(),n("v-uni-text",{staticClass:"address"},[t._v(t._s(e.address))])],1),n("v-uni-view",{staticClass:"u-box"},[n("v-uni-text",{staticClass:"name"},[t._v(t._s(e.name))]),n("v-uni-text",{staticClass:"mobile"},[t._v(t._s(e.phone))])],1)],1),n("v-uni-text",{staticClass:"cuIcon-edit",on:{click:function(n){n.stopPropagation(),arguments[0]=n=t.$handleEvent(n),t.onAddressDtailTap(e.id)}}}),n("v-uni-text",{staticClass:"cuIcon-delete",staticStyle:{"margin-left":"50upx"},on:{click:function(n){n.stopPropagation(),arguments[0]=n=t.$handleEvent(n),t.onDeleteTap(e.id)}}})],1)})),n("v-uni-button",{staticClass:"add-btn",on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onAddressDtailTap()}}},[t._v("Create new posts地址")])],2)},s=[];n.d(e,"b",(function(){return a})),n.d(e,"c",(function(){return s})),n.d(e,"a",(function(){return i}))},bc29:function(t,e,n){"use strict";var i=n("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,n("96cf");var a=i(n("3b8d")),s={data:function(){return{source:0,list:[],user:{}}},onLoad:function(){var t=(0,a.default)(regeneratorRuntime.mark((function t(e){var n,i;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return n=uni.getStorageSync("nowTable"),t.next=3,this.$api.session(n);case 3:return i=t.sent,this.user=i.data,t.next=7,this.$api.list("address",{userid:this.user.id});case 7:i=t.sent,this.list=i.data.list;case 9:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),onShow:function(){var t=(0,a.default)(regeneratorRuntime.mark((function t(){var e,n;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return e=uni.getStorageSync("nowTable"),t.next=3,this.$api.session(e);case 3:return n=t.sent,this.user=n.data,t.next=7,this.$api.list("address",{userid:this.user.id});case 7:n=t.sent,this.list=n.data.list;case 9:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),methods:{onSelectTap:function(t){uni.setStorageSync("address",t),uni.navigateBack({delta:1})},onAddressDtailTap:function(t){var e="";e=t?"../shop-address-detail/shop-address-detail?id="+t:"../shop-address-detail/shop-address-detail?id=",this.$utils.jump(e)},onDeleteTap:function(){var t=(0,a.default)(regeneratorRuntime.mark((function t(e){var n;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:n=this,uni.showModal({title:"提示",content:"是否确认删除",success:function(){var t=(0,a.default)(regeneratorRuntime.mark((function t(i){var a;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!i.confirm){t.next=9;break}return t.next=3,n.$api.del("address",JSON.stringify([e]));case 3:return a=t.sent,t.next=6,n.$api.list("address",{userid:this.user.id});case 6:a=t.sent,n.list=a.data.list,n.$utils.msg("删除成功");case 9:case"end":return t.stop()}}),t,this)})));function i(e){return t.apply(this,arguments)}return i}()});case 2:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}()}};e.default=s},ce17:function(t,e,n){"use strict";n.r(e);var i=n("a45c"),a=n("e7e5");for(var s in a)"default"!==s&&function(t){n.d(e,t,(function(){return a[t]}))}(s);n("228f");var r,o=n("f0c5"),c=Object(o["a"])(a["default"],i["b"],i["c"],!1,null,"03322cad",null,!1,i["a"],r);e["default"]=c.exports},e683:function(t,e,n){var i=n("24fb");e=i(!1),e.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */uni-page-body[data-v-03322cad]{padding-bottom:%?120?%}.content[data-v-03322cad]{position:relative}.list[data-v-03322cad]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;padding:%?20?% %?30?%;background:#fff;position:relative}.wrapper[data-v-03322cad]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;-webkit-box-flex:1;-webkit-flex:1;flex:1}.address-box[data-v-03322cad]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center}.address-box .tag[data-v-03322cad]{font-size:%?24?%;color:red;margin-right:%?10?%;background:#fffafb;border:1px solid #ffb4c7;border-radius:%?4?%;padding:%?4?% %?10?%;line-height:1}.address-box .address[data-v-03322cad]{font-size:%?30?%;color:#888}.u-box[data-v-03322cad]{font-size:%?28?%;\n  /* color: $font-color-light; */margin-top:%?16?%}.u-box .name[data-v-03322cad]{margin-right:%?30?%}.icon-bianji[data-v-03322cad]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;height:%?80?%;font-size:%?40?%;\n  /* color: $font-color-light; */padding-left:%?30?%}.add-btn[data-v-03322cad]{position:fixed;left:%?30?%;right:%?30?%;bottom:%?16?%;z-index:95;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;width:%?690?%;height:%?80?%;font-size:%?32?%;color:#fff;background-color:red;border-radius:%?10?%;box-shadow:1px 2px 5px rgba(219,63,96,.4)}',""]),t.exports=e},e7e5:function(t,e,n){"use strict";n.r(e);var i=n("bc29"),a=n.n(i);for(var s in i)"default"!==s&&function(t){n.d(e,t,(function(){return i[t]}))}(s);e["default"]=a.a}}]);