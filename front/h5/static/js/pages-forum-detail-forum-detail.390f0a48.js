(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-forum-detail-forum-detail"],{"01f7":function(t,e,i){"use strict";var a=i("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("a481"),i("96cf");var n=a(i("3b8d")),r=a(i("f8c1")),o={components:{userReply:r.default},data:function(){return{commentData:[],forum:{},id:""}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(e){var i;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return this.id=e.id,t.next=3,this.$api.forumDetail(e.id);case 3:i=t.sent,i.data.childs=this.changeContent(i.data.childs),this.commentData=i.data.childs,i.data.content=i.data.content.replace(/img src/gi,'img style="width:100%;" src'),this.forum=i.data;case 8:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),onShow:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(){var e;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,this.$api.forumDetail(this.id);case 2:e=t.sent,e.data.childs=this.changeContent(e.data.childs),this.commentData=e.data.childs,this.forum=e.data,e.data.content=e.data.content.replace(/img src/gi,'img style="width:100%;" src');case 7:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),methods:{changeContent:function(t){return t&&(t=e(t)),t;function e(t){for(var i in t)t[i].content=t[i].content.replace(/img src/gi,'img style="width:100%;" src'),t[i].childs&&(t[i].childs=e(t[i].childs));return t}},onReplyTap:function(t){this.$utils.jump("../forum-reply/forum-reply?pid=".concat(t))}}};e.default=o},"03bc":function(t,e,i){"use strict";i.r(e);var a=i("e8e2"),n=i.n(a);for(var r in a)"default"!==r&&function(t){i.d(e,t,(function(){return a[t]}))}(r);e["default"]=n.a},"0e48":function(t,e,i){var a=i("24fb");e=a(!1),e.push([t.i,"uni-page-body[data-v-af6d4812]{background:#fff}.title[data-v-af6d4812]{text-align:center;font-size:%?40?%;font-weight:700;margin:%?20?%}.username[data-v-af6d4812]{text-align:center;font-size:%?20?%;font-weight:700;color:#888;margin:%?20?%}.content[data-v-af6d4812]{margin:%?40?%;font-size:%?30?%;line-height:%?50?%;letter-spacing:%?5?%}.article-meta[data-v-af6d4812]{padding:%?20?% %?20?%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-webkit-flex-direction:row;flex-direction:row;-webkit-box-pack:start;-webkit-justify-content:flex-start;justify-content:flex-start;color:grey}.article-header-image[data-v-af6d4812]{width:%?60?%;height:%?60?%;-webkit-flex-shrink:0;flex-shrink:0;\n\t\t/* border-radius: 50%; */overflow:hidden}.article-header-image .image[data-v-af6d4812]{width:100%;height:100%}.article-header-content[data-v-af6d4812]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;padding-left:10px;font-size:%?24?%;line-height:1;width:100%\n\t\t/* height: 60rpx; */}.article-header-title[data-v-af6d4812]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between;-webkit-box-align:center;-webkit-align-items:center;align-items:center;font-size:%?26?%;line-height:2;color:#000}.article-header-info[data-v-af6d4812]{font-size:%?24?%;line-height:1}.article-top[data-v-af6d4812]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:end;-webkit-align-items:flex-end;align-items:flex-end;font-size:%?26?%;line-height:1;color:#999}.article-top .image[data-v-af6d4812]{width:%?30?%;margin-left:%?5?%}.uni-article__comment[data-v-af6d4812]{margin-bottom:%?160?%}.uni-article__comment-title[data-v-af6d4812]{width:100%;line-height:3;font-size:%?28?%;color:#666;background:#f5f5f5;padding-left:%?20?%}.uni-article__comment-centent[data-v-af6d4812]{border-bottom:1px #eee solid;padding:0 %?20?%;padding-left:%?95?%;padding-bottom:%?20?%;font-size:14px;color:#333}.btn-replay[data-v-af6d4812]{color:red;float:right}.bottom-content[data-v-af6d4812]{position:fixed;bottom:0;padding:%?20?%;width:100%}.kong[data-v-af6d4812]{width:100%;height:%?180?%}body.?%PAGE?%[data-v-af6d4812]{background:#fff}",""]),t.exports=e},"25aa":function(t,e,i){var a=i("24fb");e=a(!1),e.push([t.i,".article-meta[data-v-390f2180]{display:-webkit-box;display:-webkit-flex;display:flex;\n\t\t/* align-items: center; */-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;background:#fdfdfd;border:1px #ddd solid;border-radius:%?10?%;margin-bottom:%?20?%;padding:%?5?%}.article-meta-box[data-v-390f2180]{padding-top:%?20?%;padding-left:%?10?%;padding-bottom:0;display:-webkit-box;display:-webkit-flex;display:flex;\n\t\t/* align-items: center; */-webkit-box-pack:start;-webkit-justify-content:flex-start;justify-content:flex-start;color:grey}.article-header-image[data-v-390f2180]{width:%?60?%;height:%?60?%;-webkit-flex-shrink:0;flex-shrink:0;\n        /* border-radius: 50%; */overflow:hidden}.article-header-image .image[data-v-390f2180]{width:100%;height:100%}.article-header-content[data-v-390f2180]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between;font-size:%?24?%;line-height:1;\n\t\t/* width: 100%; */padding-left:10px;padding-right:%?20?%\n\t\t/* height: 60rpx; */}.article-header-title[data-v-390f2180]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between;-webkit-box-align:center;-webkit-align-items:center;align-items:center;font-size:%?26?%;line-height:1;color:#000}.article-header-title-text[data-v-390f2180]{line-height:1.2}.article-top[data-v-390f2180]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:end;-webkit-align-items:flex-end;align-items:flex-end;font-size:%?26?%;color:#999;line-height:1}.article-top .image[data-v-390f2180]{width:%?30?%;margin-left:%?5?%}.article-header-info[data-v-390f2180]{margin-top:%?10?%;font-size:%?24?%;line-height:1}.uni-article__comment-centent[data-v-390f2180]{padding:%?20?%;padding-left:0;color:#333;font-size:%?28?%;width:100%}.btn-replay[data-v-390f2180]{color:red;float:right}",""]),t.exports=e},"2c01":function(t,e,i){"use strict";var a,n=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("v-uni-view",[i("v-uni-view",{staticClass:"title"},[t._v(t._s(t.forum.title))]),i("v-uni-view",{staticClass:"username"},[t._v("发布人："+t._s(t.forum.username))]),i("v-uni-view",{staticClass:"content"},[i("v-uni-rich-text",{attrs:{nodes:t.forum.content}})],1),i("v-uni-view",{staticClass:"uni-article__comment"},[t._l(t.commentData,(function(e){return i("v-uni-view",{key:e.id,staticClass:"uni-article__comment-box"},[i("v-uni-view",{staticClass:"article-meta"},[i("v-uni-view",{staticClass:"article-header-image"},[i("v-uni-image",{staticClass:"image",attrs:{src:t.baseUrl+e.avatarurl,mode:"widthFix"}})],1),i("v-uni-view",{staticClass:"article-header-content"},[i("v-uni-view",{staticClass:"article-header-title"},[i("v-uni-text",[t._v(t._s(e.username))])],1),i("v-uni-view",{staticClass:"article-header-info"},[t._v(t._s(e.addtime||""))])],1)],1),i("v-uni-view",{staticClass:"uni-article__comment-centent"},[e.childs?i("user-reply",{attrs:{digest:e.childs}}):t._e(),i("v-uni-rich-text",{staticStyle:{width:"100%"},attrs:{nodes:e.content}}),i("v-uni-text",{staticClass:"btn-replay",on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.onReplyTap(e.id)}}},[t._v("回复")])],1)],1)})),i("v-uni-view",{staticClass:"kong"}),i("v-uni-view",{staticClass:"bottom-content"},[i("v-uni-button",{staticClass:"bg-red margin-tb-sm",on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onReplyTap(t.forum.id)}}},[t._v("Comment")])],1)],2)],1)},r=[];i.d(e,"b",(function(){return n})),i.d(e,"c",(function(){return r})),i.d(e,"a",(function(){return a}))},"44c6":function(t,e,i){"use strict";var a,n=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("v-uni-view",[i("v-uni-view",{staticClass:"article-meta"},[t.newData.childs?i("user-reply",{attrs:{digest:t.newData.childs}}):t._e(),i("v-uni-view",{staticClass:"article-meta-box"},[i("v-uni-view",{staticClass:"article-header-image"},[i("v-uni-image",{staticClass:"image",attrs:{src:t.baseUrl+t.newData.avatarurl,mode:"widthFix"}})],1),i("v-uni-view",{staticStyle:{width:"100%"}},[i("v-uni-view",{staticClass:"article-header-content"},[i("v-uni-view",{staticClass:"article-header-title"},[t._v(t._s(t.newData.username))]),i("v-uni-view",{staticClass:"article-header-info"},[t._v(t._s(t.newData.addtime||""))])],1),i("v-uni-view",{staticClass:"uni-article__comment-centent"},[i("v-uni-rich-text",{attrs:{nodes:t.newData.content}}),i("v-uni-text",{staticClass:"btn-replay",on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onReplyTap(t.newData.id)}}},[t._v("回复")])],1)],1)],1)],1)],1)},r=[];i.d(e,"b",(function(){return n})),i.d(e,"c",(function(){return r})),i.d(e,"a",(function(){return a}))},"4d54":function(t,e,i){"use strict";var a=i("cd54"),n=i.n(a);n.a},"5ca4":function(t,e,i){"use strict";var a=i("84f7"),n=i.n(a);n.a},"69a6":function(t,e,i){"use strict";i.r(e);var a=i("01f7"),n=i.n(a);for(var r in a)"default"!==r&&function(t){i.d(e,t,(function(){return a[t]}))}(r);e["default"]=n.a},"84f7":function(t,e,i){var a=i("25aa");"string"===typeof a&&(a=[[t.i,a,""]]),a.locals&&(t.exports=a.locals);var n=i("4f06").default;n("26e680e8",a,!0,{sourceMap:!1,shadowMode:!1})},"95a4":function(t,e,i){"use strict";i.r(e);var a=i("2c01"),n=i("69a6");for(var r in n)"default"!==r&&function(t){i.d(e,t,(function(){return n[t]}))}(r);i("4d54");var o,c=i("f0c5"),s=Object(c["a"])(n["default"],a["b"],a["c"],!1,null,"af6d4812",null,!1,a["a"],o);e["default"]=s.exports},cd54:function(t,e,i){var a=i("0e48");"string"===typeof a&&(a=[[t.i,a,""]]),a.locals&&(t.exports=a.locals);var n=i("4f06").default;n("faf90194",a,!0,{sourceMap:!1,shadowMode:!1})},e8e2:function(t,e,i){"use strict";var a=i("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("28a5"),i("ac6a");var n=a(i("f8c1")),r={name:"userReply",components:{userReply:n.default},props:{digest:{type:Array,default:function(){return{}}}},data:function(){return{newData:{},digestData:[],UNITS:{"年":315576e5,"月":26298e5,"天":864e5,"小时":36e5,"分钟":6e4,"秒":1e3}}},computed:{baseUrl:function(){return this.$base.url}},created:function(){var t=this;this.digest.forEach((function(e,i){console.log(e,i),0===i?t.newData=e:t.digestData.push(e)}))},methods:{format:function(t){var e=this.parse(t),i=Date.now()-e.getTime();if(i<this.UNITS["天"])return this.humanize(i);var a=function(t){return t<10?"0"+t:t};return e.getFullYear()+"-"+a(e.getMonth()+1)+"-"+a(e.getDate())+" "+a(e.getHours())+":"+a(e.getMinutes())},humanize:function(t){var e="";for(var i in this.UNITS)if(t>=this.UNITS[i]){e=Math.floor(t/this.UNITS[i])+i+"前";break}return e||"刚刚"},parse:function(t){var e=t.split(/[^0-9]/);return new Date(e[0],e[1]-1,e[2],e[3],e[4],e[5])},onReplyTap:function(t){this.$utils.jump("../forum-reply/forum-reply?pid=".concat(t))}}};e.default=r},f8c1:function(t,e,i){"use strict";i.r(e);var a=i("44c6"),n=i("03bc");for(var r in n)"default"!==r&&function(t){i.d(e,t,(function(){return n[t]}))}(r);i("5ca4");var o,c=i("f0c5"),s=Object(c["a"])(n["default"],a["b"],a["c"],!1,null,"390f2180",null,!1,a["a"],o);e["default"]=s.exports}}]);