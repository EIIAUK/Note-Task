<template>
    <div>
        <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/main' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item>床位信息</el-breadcrumb-item>
        </el-breadcrumb>
        <el-form :inline="true" :model="form" class="demo-form-inline">
            <el-form-item label="床位名称">
                <el-input v-model="form.name"></el-input>
            </el-form-item>
            <el-form-item>
                <el-button type="primary" @click="onQuery">查询</el-button>
                <el-button type="primary" icon="el-icon-edit" circle @click="handleAdd"></el-button>
            </el-form-item>
        </el-form>
        <el-table
                :data="pageInfo.list"
                border
                style="width: 100%">
            <el-table-column
                    type="index"
                    width="100">
            </el-table-column>
            <el-table-column
                    label="创建日期"
                    width="220">
                <template slot-scope="scope">
                    {{ convert(scope.row.createDate) }}
                </template>
            </el-table-column>
            <el-table-column
                    prop="roomNumber"
                    label="床位编号"
                    width="150">
            </el-table-column>
            <el-table-column
                    prop="bedStatus"
                    label="床位状态"
                    width="150">
            </el-table-column>
            <el-table-column
                    prop="name"
                    label="床位名称"
                    width="200">
            </el-table-column>
            <el-table-column label="操作">
                <template slot-scope="scope">
                    <el-button
                            size="mini"
                            type="info"
                            @click="handleEdit(scope.row.id)">编辑</el-button>
                    <el-button
                            size="mini"
                            type="danger"
                            @click="handleDelete(scope.row.id)">删除</el-button>
                </template>
            </el-table-column>
        </el-table>
        <el-pagination
                background
                @current-change="handleCurrentChange"
                layout="prev, pager, next"
                :page-size="pageInfo.pageSize"
                :total="pageInfo.total">
        </el-pagination>
    </div>
</template>

<script>
    import axios from 'axios'
    import {HOST} from "../../common/config";
    import {makeSimpleDate} from "../../common/dateformat";
    import {ElBreadcrumbItem} from "element-ui";

    export default {
        components: {ElBreadcrumbItem},
        data(){
            return{
                currPage: 1, //当前页
                form: {
                    name: '',
                },
                pageInfo: {
                }
            }
        },
        created(){
            //取需要显示的数据
            this.getData()
        },
        methods: {
            getData(){
                console.log('查询')
                let url = `${HOST}/bedmanage/query/${this.currPage}`
                axios.post(url,this.form).then(res=>{
                    console.log(res.data)
                    this.pageInfo = res.data
                })
            },
            handleCurrentChange(val) {
                //赋值需要跳转的页码
                console.log(val)
                this.currPage = val
                //重新加载数据
                this.getData()
            },
            onQuery(){

                this.getData()
            },
            //获取数据

            //当前页改变时触发

            //跳转到新增界面
            handleAdd(){
                this.$router.push("/bedAdd")
            },
            //跳转到修改界面
            handleEdit(id){
                this.$router.push(`/bedUpdate/${id}`)
            },
            //删除
            handleDelete(id){
                let url = `${HOST}/bedmanage/del/${id}`
                axios.get(url).then(res=>{
                    if(res.data.state === 200){
                        this.$message.success("删除成功")
                        //重新加载数据
                        this.currPage = 1
                        this.getData()
                    }
                })
            },
            //日期格式转换
            convert(date){
                return makeSimpleDate(date)
            }

        }
    }
</script>

<style scoped>
    .demo-form-inline {
        margin-top: 10px;
    }
</style>