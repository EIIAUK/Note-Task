import Vue from 'vue'
import Router from 'vue-router'
import Portal from '../components/portal/Portal'
import Login from '../components/login/Login'
import Main from '../components/main/Main'
import HotelInList from '../components/hotelin/HotelInList'
import HotelOutList from '../components/hotelout/HotelOutList'
import HotelEgressList from '../components/hotelegress/HotelEgressList'
import HotelInAdd from '../components/hotelin/HotelInAdd'
import HotelInUpdate from '../components/hotelin/HotelInUpdate'
import HotelEgressAdd from '../components/hotelegress/HotelEgressAdd'
import  HotelOutAdd from '../components/hotelout/HotelOutAdd'
import HotelOutUpdate from '../components/hotelout/HotelOutUpdate'
import HotelEgressUpdate from '../components/hotelegress/HotelEgressUpdate'
import UserInfoList from  '../components/userinfo/UserInfoList'
import NurseInfoList from '../components/nurseinfo/NurseInfoList'
import NurseInfoAdd from '../components/nurseinfo/NurseInfoAdd'
import NurseInfoUpdate from '../components/nurseinfo/NurseInfoUpdate'
import NurseRecordList from '../components/nurserecord/NurseRecordList'
import NurseRecordAdd from '../components/nurserecord/NurseRecordAdd'
import NurseRecordUpdate from '../components/nurserecord/NurseRecordUpdate'
import UserInfoAdd from '../components/userinfo/UserInfoAdd'
import UserInfoUpdate from '../components/userinfo/UserInfoUpdate'
import BedList from "../components/BedManage/BedList";
import BedAdd from "../components/BedManage/BedAdd";
import FoodList from "../components/FoodManage/FoodList";
import DietaryList from "../components/DietaryCalendar/DietaryList";
import DietaryAdd from "../components/DietaryCalendar/DietaryAdd";
import DietaryUpdate from "../components/DietaryCalendar/DietaryUpdate";
import BedUpdate from "../components/BedManage/BedUpdate";
import FoodAdd from "../components/FoodManage/FoodAdd";
import FoodUpdate from "../components/FoodManage/FoodUpdate";






Vue.use(Router)
//创建路由对象并配置路由
const originalPush = Router.prototype.push
Router.prototype.push = function push(location) {
    return originalPush.call(this, location).catch(err => err)
}

const router = new Router({
    routes: [
        {
            path: '/',
            component: Login
        },

        {
            path: '/main',
            component: Main,
            children: [ /*配置子路由*/
                {
                    path: '/',
                    component: Portal,
                },
                {
                    path: '/HotelInList',
                    component: HotelInList,
                },
                {
                    path: '/HotelEgressList',
                    component: HotelEgressList,
                },
                {
                    path: '/HotelOutList',
                    component: HotelOutList,
                },
                {
                    path: '/HotelInAdd',
                    component: HotelInAdd,
                },

                {
                    path: '/HotelInUpdate/:id',
                    component:HotelInUpdate,
                },
                {
                    path: '/HotelEgressAdd',
                    component:HotelEgressAdd,
                },
                {
                    path: '/HotelOutAdd',
                    component:HotelOutAdd,
                },
                {
                    path: '/HotelOutUpdate/:id',
                    component:HotelOutUpdate,
                },
                {
                    path: '/HotelEgressUpdate/:id',
                    component:HotelEgressUpdate,
                },
                {
                    path: '/nurseinfoList',
                    component: NurseInfoList,
                },
                {
                    path: '/nurseinfoAdd',
                    component: NurseInfoAdd,
                },
                {
                    path: '/nurseinfoUpdate/:id',
                    component: NurseInfoUpdate,
                },
                {
                    path: '/nurserecordList',
                    component: NurseRecordList,
                },
                {
                    path: '/nurserecordAdd',
                    component: NurseRecordAdd,
                },
                {
                    path: '/nurserecordUpdate/:id',
                    component: NurseRecordUpdate,
                },

                {
                    path: '/userinfoList',
                    component: UserInfoList,
                },
                {
                    path: '/userinfoAdd',
                    component: UserInfoAdd,
                },
                {
                    path: '/userinfoUpdate/:id',
                    component: UserInfoUpdate,
                },
                {
                    path: '/bedList',
                    component: BedList,
                },
                {
                    path:'/bedAdd',
                    component: BedAdd,
                },
                {
                    path: '/besUpdate/:id',
                    component: BedUpdate,
                },
                {
                    path: '/foodList',
                    component: FoodList,
                },
                {
                    path:'/foodAdd',
                    component: FoodAdd,
                },
                {
                    path: '/foodUpdate/:id',
                    component: FoodUpdate,
                },
                {
                    path:'/dietaryList',
                    component: DietaryList,
                },
                {
                    path:'/dietaryAdd',
                    component: DietaryAdd,
                },
                {
                    path: '/dietaryUpdate/:id',
                    component: DietaryUpdate,
                },

            ]
        }

    ]
})


//导出路由对象
export default  router