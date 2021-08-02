<template>
    <div>
        <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/main' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item>膳食日历</el-breadcrumb-item>
        </el-breadcrumb>
        <el-form :inline="true" :model="form" class="demo-form-inline">
            <el-form-item label="膳食名称">
                <el-input v-model="form.foodName"></el-input>
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
            <el-table-column type="expand">
                <template slot-scope="props">
                    <el-form label-position="left" inline class="demo-table-expand">
                        <el-form-item>
                            <span><img v-if="props.row.foodPicture" :src="`${host}/${props.row.foodPicture}`" /></span>
                        </el-form-item>
                    </el-form>
                </template>
            </el-table-column>
            <el-table-column
                    type="index"
                    width="50">
            </el-table-column>
            <el-table-column
                    label="创建日期"
                    width="120">
                <template slot-scope="scope">
                    {{ convert(scope.row.createDate) }}
                </template>
            </el-table-column>
            <el-table-column
                    prop="foodName"
                    label="膳食名称"
                    width="100">
            </el-table-column>
            <el-table-column
                    prop="foodType"
                    label="膳食种类"
                    width="80">
            </el-table-column>
            <el-table-column
                    prop="foodTag"
                    label="膳食标签"
                    width="80">
            </el-table-column>
            <el-table-column
                    prop="foodPrice"
                    label="膳食价格"
                    width="80">
            </el-table-column>
            <el-table-column
                    prop="mamalFlag"
                    label="是否清真"
                    width="100">
            </el-table-column>
            <el-table-column
                    prop="supplyDate"
                    label="提供日期"
                    width="80">
            </el-table-column>
            <el-table-column
                    prop="supplyType"
                    label="提供星期"
                    width="80">
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

    export default {
        data(){
            return{
                host:'',
                currPage: 1, //当前页
                form: {
                    foodName: '',

                },
                pageInfo: {

                }
            }
        },
        created(){
            this.host = HOST
            this.getData()
        },
        methods: {
            onQuery(){
                this.currPage = 1
                this.getData()
            },
            //获取数据
            getData(){
                let url = `${HOST}/dietary/query/${this.currPage}`
                axios.post(url,this.form).then(res=>{
                    console.log(res.data)
                    this.pageInfo = res.data
                })
            },
            //当前页改变时触发
            handleCurrentChange(val) {
                //赋值需要跳转的页码
                this.currPage = val
                //重新加载数据
                this.getData()
            },
            //跳转到新增界面
            handleAdd(){
                this.$router.push("/dietaryAdd")
            },
            //跳转到修改界面
            handleEdit(id){
                this.$router.push(`/dietaryUpdate/${id}`)
            },
            //删除
            handleDelete(id){
                let url = `${HOST}/dietary/del/${id}`
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