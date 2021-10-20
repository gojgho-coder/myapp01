import { createRouter, createWebHistory } from '@ionic/vue-router';
import { RouteRecordRaw } from 'vue-router';
import Tabs from '../views/Tabs.vue'
import Login from '../views/login/login.vue'
import SignUp from '../views/login/signUp.vue'
// {
//   path: '/',
//       redirect: '/tabs/home'
// },
// {
//   path: '/tabs/',
//       component: Tabs,
//     children: [
//   {
//     path: '',
//     redirect: '/tabs/tab1'
//   },
//   {
//     path:'home',
//     component: () => import('@/views/Home.vue')
//   },
//   {
//     path: 'tab1',
//     component: () => import('@/views/Tab1.vue')
//   },
//   {
//     path: 'tab2',
//     component: () => import('@/views/Tab2.vue')
//   },
//   {
//     path: 'tab3',
//     component: () => import('@/views/Tab3.vue')
//   }
// ]
// }
// ]


const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    redirect: '/login'
  },
  {
    path: '/login',
    component: Login,
  },
  {
    path: '/signUp',
    component: SignUp,
  },

  {
  path: '/tabs/',
      component: Tabs,
    children: [
  {
    path: '',
    redirect: '/tabs/Home'
  },
  {
    path:'home',
    component: () => import('@/views/Home.vue')
  },
  {
    path: 'tab1',
    component: () => import('@/views/Tab1.vue')
  },
  {
    path: 'tab2',
    component: () => import('@/views/Tab2.vue')
  },
  {
    path: 'tab3',
    component: () => import('@/views/Tab3.vue')
  }
]
}
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
