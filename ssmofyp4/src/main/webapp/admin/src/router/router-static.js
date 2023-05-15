import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discusszuqiuzhoubian from '@/views/modules/discusszuqiuzhoubian/list'
    import menpiaoyuding from '@/views/modules/menpiaoyuding/list'
    import banzhushenqing from '@/views/modules/banzhushenqing/list'
    import news from '@/views/modules/news/list'
    import qiuduizhuanqu from '@/views/modules/qiuduizhuanqu/list'
    import zaixianshoupiao from '@/views/modules/zaixianshoupiao/list'
    import remenjingdian from '@/views/modules/remenjingdian/list'
    import qiuxingzhuanqu from '@/views/modules/qiuxingzhuanqu/list'
    import jiudianxinxi from '@/views/modules/jiudianxinxi/list'
    import saishizhibo from '@/views/modules/saishizhibo/list'
    import storeup from '@/views/modules/storeup/list'
    import saichengxinxi from '@/views/modules/saichengxinxi/list'
    import zuqiuzhoubian from '@/views/modules/zuqiuzhoubian/list'
    import forum from '@/views/modules/forum/list'
    import discussqiuduizhuanqu from '@/views/modules/discussqiuduizhuanqu/list'
    import discussqiuxingzhuanqu from '@/views/modules/discussqiuxingzhuanqu/list'
    import discusszaixianshoupiao from '@/views/modules/discusszaixianshoupiao/list'
    import yonghu from '@/views/modules/yonghu/list'
    import messages from '@/views/modules/messages/list'
    import discusssaishizhibo from '@/views/modules/discusssaishizhibo/list'
    import orders from '@/views/modules/orders/list'
    import jiudianyuding from '@/views/modules/jiudianyuding/list'
    import banzhu from '@/views/modules/banzhu/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: 'Home page',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: 'Home page',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: 'ModifyPassword',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: 'Personal information',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discusszuqiuzhoubian',
        name: 'Merchants评论',
        component: discusszuqiuzhoubian
      }
      ,{
	path: '/menpiaoyuding',
        name: 'Tickets Order',
        component: menpiaoyuding
      }
      ,{
	path: '/banzhushenqing',
        name: 'Moderator application',
        component: banzhushenqing
      }
      ,{
	path: '/news',
        name: 'Football News',
        component: news
      }
      ,{
	path: '/qiuduizhuanqu',
        name: 'Teams',
        component: qiuduizhuanqu
      }
      ,{
	path: '/zaixianshoupiao',
        name: 'Online Tickets',
        component: zaixianshoupiao
      }
      ,{
	path: '/remenjingdian',
        name: 'Popular Sites',
        component: remenjingdian
      }
      ,{
	path: '/qiuxingzhuanqu',
        name: 'Stars',
        component: qiuxingzhuanqu
      }
      ,{
	path: '/jiudianxinxi',
        name: 'Hotel Information',
        component: jiudianxinxi
      }
      ,{
	path: '/saishizhibo',
        name: 'Hot',
        component: saishizhibo
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/saichengxinxi',
        name: 'Schedule info',
        component: saichengxinxi
      }
      ,{
	path: '/zuqiuzhoubian',
        name: 'Merchants',
        component: zuqiuzhoubian
      }
      ,{
	path: '/forum',
        name: 'Forum',
        component: forum
      }
      ,{
	path: '/discussqiuduizhuanqu',
        name: 'Teams评论',
        component: discussqiuduizhuanqu
      }
      ,{
	path: '/discussqiuxingzhuanqu',
        name: 'Stars评论',
        component: discussqiuxingzhuanqu
      }
      ,{
	path: '/discusszaixianshoupiao',
        name: 'Online Tickets评论',
        component: discusszaixianshoupiao
      }
      ,{
	path: '/yonghu',
        name: 'User',
        component: yonghu
      }
      ,{
	path: '/messages',
        name: 'Suggestion',
        component: messages
      }
      ,{
	path: '/discusssaishizhibo',
        name: 'Hot评论',
        component: discusssaishizhibo
      }
      ,{
        path: '/orders/:status',
        name: 'Order Management',
        component: orders
      }
      ,{
	path: '/jiudianyuding',
        name: 'Hotel Order',
        component: jiudianyuding
      }
      ,{
	path: '/banzhu',
        name: 'Moderator',
        component: banzhu
      }
      ,{
	path: '/config',
        name: 'Swiper Management',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: 'Home page',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//Modify原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
