<template>
    <div>

        <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/main' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item>外出管理</el-breadcrumb-item>
        </el-breadcrumb>

        <el-form :inline="true" :model="form" class="demo-form-inline">
            <el-form-item label="姓名">
                <el-input v-model="form.customerName"></el-input>
            </el-form-item>
            <el-form-item label="出行原因" >
                <el-select v-model="form.outgoingReason" placeholder="请选择出行原因">
                    <el-option :key="index" :label="item.outgoingReason" :value="item.outgoingReason" v-for="(item,index) in outgoingReason"></el-option>
                </el-select>
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
                        <el-form-item label="陪同人">
                            <span>{{ props.row.escorted }}</span>
                        </el-form-item>
                        <el-form-item label="关系">
                            <span>{{ props.row.relation }}</span>
                        </el-form-item>
                        <el-form-item label="联系电话">
                            <span>{{ props.row.escortedtel }}</span>
                        </el-form-item>

                    </el-form>
                </template>
            </el-table-column>
            <el-table-column
                    label="姓名"
                    prop="customerName"
                    width="150">
            </el-table-column>
            <el-table-column
                    label="出行原因"
                    prop="outgoingReason"
                    width="150">
            </el-table-column>

            <el-table-column
                    label="外出时间"

                    width="100">
                <template slot-scope="scope">
                    {{convert(scope.row.outgoingTime)}}
                </template>
            </el-table-column>
            <el-table-column
                    label="预计返回时间"
                    width="150">
                <template slot-scope="scope">
                    {{convert(scope.row.expectedreturnTime)}}
                </template>
            </el-table-column>

            <el-table-column
                    label="实际返回时间"
                    width="200">
                <template slot-scope="scope">
                    {{convert(scope.row.actualreturnTime)}}
                </template>
            </el-table-column>

            <el-table-column
                    label="状态"
                    width="200">
                <template slot-scope ="scope">
                    <el-tag type="success">  {{convertStatus(scope.row.auditStatus)}}</el-tag>
                </template>
            </el-table-column>

            <el-table-column label="操作">
                <template slot-scope="scope">
                    <el-button
                            size="mini"
                            @click="handleEdit(scope.row.id)">编辑</el-button>
                    <el-button
                            size="mini"
                            type="danger"
                            @click="handleDelete(scope.row.id)">删除</el-button>
                    <el-button
                            size="mini"
                            type="primary"
                            v-show="scope.row.auditStatus !=='1'"
                            @click="handleCheck(scope.row,'1')">审核通过</el-button>
                    <el-button
                            size="mini"
                            type="primary"
                            v-show="scope.row.auditStatus !=='1'"
                            @click="handleCheck(scope.row,'2')">审核拒绝</el-button>
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
    import axios  from 'axios'
    import {HOST} from "../../common/config";
    import ElBreadcrumbItem from "element-ui/packages/breadcrumb/src/breadcrumb-item";
    import {makeSimpleDate} from "../../common/dateformat";

    export default {

        components: {ElBreadcrumbItem},
        data() {
            return {
                outgoingReason:[],
                selOutgoingReason(){  this.host = HOST
                    let url = `${HOST}/hotelRecord/selOutgoingReason`
                    axios.get(url).then(res=>{
                        this.outgoingReason = res.data
                        console.log(this.outgoingReason)
                    })},

                currPage:1,
                form: {

                    customerName: '',     //公司名称
                    outgoingReason: '' //行业
                },
                pageInfo:{}

            }
        },
        created()
        {
            this.getData()
            this.selOutgoingReason()
        },


        methods:{

            //转跳页面

            getData(){
                //  console.log('查询')
                let url = `${HOST}/hotelRecord/query/${this.currPage}`
                axios.post(url,this.form).then(res=>{
                    console.log(res.data);
                    this.pageInfo = res.data;
                })
            },
            handleCurrentChange(val) {
                console.log(val);
                this.currPage = val
                this.getData()
            },

            onQuery(){
                this.getData()

            },

            convertStatus(status){
                let  result;
                switch (status){
                    case '0':
                        result = '未审核'
                        break
                    case '1':
                        result = '已通过'
                        break
                    case '2':
                        result = '未通过'
                        break
                }
                return result
            },

            //审核
            handleCheck(row,status){
                row.status = status
                let url = `${HOST}/hotelRecord/update`
                axios.post(url,row).then(res=>{
                    console.log(res.data);

                })

            },
            handleAdd(){
                this.$router.push("/HotelEgressAdd")
            },
            handleEdit(id){
                console.log(id)
                this.$router.push(`/HotelEgressUpdate/${id}`)
            },
            handleDelete(id){
                console.log(id)
                let url = `${HOST}/hotelRecord/del/${id}`
                axios.get(url).then(res=>{
                    if(res.data.state === 200){
                        this.$message.success("删除成功")
                        //重新加载数据
                        /*     this.currPage = 1  */
                        this.getData()
                    }
                })
            },

            convert(data){
                return makeSimpleDate(data)

            }
        }



    }
</script>

<style scoped>
    .demo-table-expand {
        font-size: 0;
    }
    .demo-table-expand label {
        width: 90px;
        color: #99a9bf;
    }
    .demo-table-expand .el-form-item {
        margin-right: 0;
        margin-bottom: 0;
        width: 50%;
    }
    .demo-form-inline {
        margin-top: 10px;
    }
</style>