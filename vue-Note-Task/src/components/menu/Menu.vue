<template>

    <div>
        <el-menu
                class="el-menu-vertical"
                background-color="white"
                text-color="black"
                active-text-color="black"
        >
            <el-menu-item index="1">
                <i class="el-icon-s-home"></i>
                <span slot="title" @click="index">首页</span>
            </el-menu-item>
            <el-menu-item index="6">
                <i class="el-icon-user"></i>
                <span slot="title" @click="userinfo">员工信息</span>
            </el-menu-item>

            <el-submenu index="3">
                <template slot="title">
                    <i class="el-icon-office-building"></i>
                    <span>住宿管理</span>
                </template>
                <el-menu-item-group>
                    <el-menu-item index="3-1" @click="hotelinList">入住管理</el-menu-item>
                    <el-menu-item index="3-2" @click="post">外出信息</el-menu-item>
                    <el-menu-item index="3-3" @click="graduate">退住管理</el-menu-item>
                </el-menu-item-group>
            </el-submenu>

            <el-submenu index="2">
                <template slot="title">
                    <i class="el-icon-notebook-2"></i>
                    <span>护理管理</span>
                </template>
                <el-menu-item-group>
                    <el-menu-item index="2-1" @click="nurseinfo">护理项目</el-menu-item>
                    <el-menu-item index="2-2" @click="nurserecord">护理记录</el-menu-item>
                </el-menu-item-group>
            </el-submenu>



            <el-menu-item index="4">
                <i class="el-icon-alarm-clock"></i>
                <span slot="title" @click="bedmanage">床位管理</span>
            </el-menu-item>

            <el-submenu index="5">
                <template slot="title">
                    <i class="el-icon-tableware"></i>
                    <span>膳食管理</span>
                </template>
                <el-menu-item-group>
                    <el-menu-item index="1-1" @click="foodmanage">膳食记录管理</el-menu-item>
                    <el-menu-item index="1-2" @click="dietarycalendar">膳食日历展示</el-menu-item>
                </el-menu-item-group>
            </el-submenu>



            <el-menu-item index="7">
                <i class="el-icon-s-release"></i>
                <span slot="title" @click="logout">退出</span>
            </el-menu-item>

        </el-menu>
    </div>
</template>

<script>
    export default {
        methods: {
            //跳转到首页
            index(){
                this.$router.push('/main')
            },
            //跳转到护理内容
            nurseinfo(){
                this.$router.push("/nurseinfoList")
            },
            //跳转到护理记录
            nurserecord(){
                this.$router.push("/nurserecordList")
            },
            //跳转到用户信息
            userinfo(){
                this.$router.push("/userinfoList")
            },
            //跳转到住宿管理
            hotelinList(){
                this.$router.push("/hotelinList")
            },
            //住宿增加
            hotelinAdd(){
                this.$router.push("/hotelinAdd")
            },
            //住宿升级
            hotelinUpdate(){
                this.$router.push("/hotelinUpdate")
            },
            //跳转到外出管理
            post(){
                this.$router.push("/hotelegressList")
            },
            //跳转到退住管理
            graduate() {
                this.$router.push("/hoteloutList")
            },
            //跳转到公司管理
            foodmanage(){
                this.$router.push("/foodList")
            },
            //跳转到岗位管理
            dietarycalendar(){
                this.$router.push("/dietaryList")
            },
            //跳转到毕业生管理
            bedmanage(){
                this.$router.push("/bedList")
            },


            //退出
            logout(){
                this.$router.push("/")
            }

        }
    }
</script>

<style scoped>
    .el-menu-vertical {
        min-height: 600px;
    }
</style>