(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-shop-address-detail-shop-address-detail"],{"0418":function(t,a,e){var s=e("f270");"string"===typeof s&&(s=[[t.i,s,""]]),s.locals&&(t.exports=s.locals);var n=e("4f06").default;n("7f0f318b",s,!0,{sourceMap:!1,shadowMode:!1})},1682:function(t,a,e){"use strict";e.r(a);var s=e("b2a5"),n=e.n(s);for(var i in s)"default"!==i&&function(t){e.d(a,t,(function(){return s[t]}))}(i);a["default"]=n.a},"21ef":function(t,a,e){"use strict";var s=e("0418"),n=e.n(s);n.a},8631:function(t,a,e){"use strict";e.r(a);var s=e("d47e"),n=e("1682");for(var i in n)"default"!==i&&function(t){e.d(a,t,(function(){return n[t]}))}(i);e("21ef");var r,d=e("f0c5"),c=Object(d["a"])(n["default"],s["b"],s["c"],!1,null,"821aca50",null,!1,s["a"],r);a["default"]=c.exports},b2a5:function(t,a,e){"use strict";var s=e("4ea4");Object.defineProperty(a,"__esModule",{value:!0}),a.default=void 0,e("96cf");var n=s(e("3b8d")),i={data:function(){return{addressData:{name:"",phone:"",addressName:"在地图选择",address:"",default:!1},id:""}},onLoad:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(a){var e,s;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(e="Create new posts收货地址",!a.id){t.next=10;break}return e="编辑收货地址",this.id=a.id,t.next=6,this.$api.info("address",this.id);case 6:s=t.sent,this.addressData=s.data,this.addressData.addressName=s.data.address,"是"==this.addressData.isdefault&&(this.addressData.default=!0);case 10:uni.setNavigationBarTitle({title:e});case 11:case"end":return t.stop()}}),t,this)})));function a(a){return t.apply(this,arguments)}return a}(),methods:{switchChange:function(t){this.addressData.default=t.detail},chooseLocation:function(){var t=this;uni.chooseLocation({success:function(a){t.addressData.addressName=a.name,t.addressData.address=a.name}})},confirm:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(){var a;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(a=this.addressData,a.name){t.next=4;break}return this.$utils.msg("请填写收货人姓名"),t.abrupt("return");case 4:if(this.$validate.isMobile(a.phone)){t.next=7;break}return this.$utils.msg("请输入正确的手机号码"),t.abrupt("return");case 7:if(a.address){t.next=10;break}return this.$utils.msg("请输入地址"),t.abrupt("return");case 10:if(a.default?a.isdefault="是":a.isdefault="否",!this.id){t.next=16;break}return t.next=14,this.$api.update("address",a);case 14:t.next=18;break;case 16:return t.next=18,this.$api.add("address",a);case 18:this.$utils.msgBack("操作成功");case 19:case"end":return t.stop()}}),t,this)})));function a(){return t.apply(this,arguments)}return a}()}};a.default=i},d47e:function(t,a,e){"use strict";var s,n=function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("v-uni-view",{staticClass:"content"},[e("v-uni-view",{staticClass:"row b-b"},[e("v-uni-text",{staticClass:"tit"},[t._v("联系人")]),e("v-uni-input",{staticClass:"input",attrs:{type:"text",placeholder:"收货人姓名","placeholder-class":"placeholder"},model:{value:t.addressData.name,callback:function(a){t.$set(t.addressData,"name",a)},expression:"addressData.name"}})],1),e("v-uni-view",{staticClass:"row b-b"},[e("v-uni-text",{staticClass:"tit"},[t._v("手机号")]),e("v-uni-input",{staticClass:"input",attrs:{type:"number",placeholder:"收货人手机号码","placeholder-class":"placeholder"},model:{value:t.addressData.phone,callback:function(a){t.$set(t.addressData,"phone",a)},expression:"addressData.phone"}})],1),e("v-uni-view",{staticClass:"row b-b"},[e("v-uni-text",{staticClass:"tit"},[t._v("地址")]),e("v-uni-input",{staticClass:"input",attrs:{type:"text",placeholder:"地址","placeholder-class":"placeholder"},model:{value:t.addressData.address,callback:function(a){t.$set(t.addressData,"address",a)},expression:"addressData.address"}})],1),e("v-uni-view",{staticClass:"row default-row"},[e("v-uni-text",{staticClass:"tit"},[t._v("设为默认")]),e("v-uni-switch",{attrs:{checked:t.addressData.default,color:"#fa436a"},on:{change:function(a){arguments[0]=a=t.$handleEvent(a),t.switchChange.apply(void 0,arguments)}}})],1),e("v-uni-button",{staticClass:"add-btn",on:{click:function(a){arguments[0]=a=t.$handleEvent(a),t.confirm.apply(void 0,arguments)}}},[t._v("提交")])],1)},i=[];e.d(a,"b",(function(){return n})),e.d(a,"c",(function(){return i})),e.d(a,"a",(function(){return s}))},f270:function(t,a,e){var s=e("24fb");a=s(!1),a.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */uni-page-body[data-v-821aca50]{background:#fff;padding-top:%?16?%}.row[data-v-821aca50]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;position:relative;padding:0 %?30?%;height:%?110?%;background:#fff}.row .tit[data-v-821aca50]{-webkit-flex-shrink:0;flex-shrink:0;width:%?120?%;font-size:%?30?%;color:#888}.row .input[data-v-821aca50]{-webkit-box-flex:1;-webkit-flex:1;flex:1;font-size:%?30?%;color:#888}.row .icon-shouhuodizhi[data-v-821aca50]{font-size:%?36?%}.default-row[data-v-821aca50]{margin-top:%?16?%}.default-row .tit[data-v-821aca50]{-webkit-box-flex:1;-webkit-flex:1;flex:1}.default-row uni-switch[data-v-821aca50]{-webkit-transform:translateX(%?16?%) scale(.9);transform:translateX(%?16?%) scale(.9)}.add-btn[data-v-821aca50]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;width:%?690?%;height:%?80?%;margin:%?60?% auto;color:#fff;background-color:red;border-radius:%?10?%;box-shadow:1px 2px 5px rgba(219,63,96,.4)}body.?%PAGE?%[data-v-821aca50]{background:#fff}',""]),t.exports=a}}]);