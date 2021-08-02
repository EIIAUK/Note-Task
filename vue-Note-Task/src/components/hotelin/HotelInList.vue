<template>
    <div class="inp">

        <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/main' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item>入住管理</el-breadcrumb-item>
        </el-breadcrumb>

        <el-form :inline="true" :model="form" class="demo-form-inline">
            <el-form-item label="姓名">
                <el-input v-model="form.customerName"></el-input>
            </el-form-item>

            <el-form-item label="病症" >
                <el-select v-model="form.psychosomaticstate" placeholder="请选择病症">
                    <el-option :key="index" :label="item.psychosomaticstate" :value="item.psychosomaticstate" v-for="(item,index) in selPsychosomatics"></el-option>
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
                        <el-form-item label="身份证号">
                            <span>{{ props.row.idcard }}</span>
                        </el-form-item>
                        <el-form-item label="楼号">
                            <span>{{ props.row.buildingId }}</span>
                        </el-form-item>
                        <el-form-item label="房间号">
                            <span>{{ props.row.roomid }}</span>
                        </el-form-item>
                        <el-form-item label="床号">
                            <span>{{ props.row.bedId }}</span>
                        </el-form-item>
                        <el-form-item label="老人类型">
                            <span>{{ props.row.elderType }}</span>
                        </el-form-item>
                        <el-form-item label="入住时间">
                            <span>{{ convert(props.row.checkinDate) }}</span>
                        </el-form-item>
                        <el-form-item label="合约到期时间">
                            <span>{{ convert(props.row.expirationDate) }}</span>
                        </el-form-item>
                        <el-form-item label="注意事项">
                            <span>{{ props.row.attention }}</span>
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
                    label="年龄"
                    prop="customerAge"
                    width="120">
            </el-table-column>
            <el-table-column
                    label="性别"
                    prop="customerSex"
                    width="120">
            </el-table-column>
            <el-table-column
                    label="病症"
                    prop="psychosomaticstate"
                    width="200">
            </el-table-column>
            <el-table-column
                    label="状态"
                    width="200">
                <template slot-scope ="scope">
                    <el-tag type="success">  {{convertStatus(scope.row.status)}}</el-tag>
                </template>
            </el-table-column>

            <el-table-column label="操作">
                <template slot-scope="scope">
                    <el-button
                            size="mini"
                            @click="handleEdit( scope.row.id)">编辑</el-button>
                    <el-button
                            size="mini"
                            type="danger"
                            @click="handleDelete( scope.row.id)">删除</el-button>
                    <el-button
                            size="mini"
                            type="primary"
                            v-show="scope.row.status !=='1'"
                            @click="handleCheck(scope.row,'1')">审核通过</el-button>
                    <el-button
                            size="mini"
                            type="primary"
                            v-show="scope.row.status !=='1'"
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
                selPsychosomatics:[],
                selPsy(){  this.host = HOST
                    let url = `${HOST}/hosteling/selPsychosomatics`
                    axios.get(url).then(res=>{
                        this.selPsychosomatics = res.data
                        console.log(this.selPsychosomatics)
                    })},

                currPage:1,
                form: {

                    customerName: '',     //公司名称
                    psychosomaticstate: '' //行业
                },
                pageInfo:{}

            }
            },
        created()
        {
            this.getData()
            this.selPsy()
        },


        methods:{

            //转跳页面

            getData(){
              //  console.log('查询')
                let url = `${HOST}/hosteling/query/${this.currPage}`
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
                let url = `${HOST}/hosteling/update`
                axios.post(url,row).then(res=>{
                    console.log(res.data);

                })

            },
            handleAdd(){
                this.$router.push("/HotelInAdd")
            },
            handleEdit(id){
                console.log(id)
                this.$router.push(`/HotelInUpdate/${id}`)
            },
            handleDelete(id){
                console.log(id)
               let url = `${HOST}/hosteling/del/${id}`
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
        width: 100%;
        color: #99a9bf;
    }
    .demo-table-expand .el-form-item {
        margin-right: 0;
        margin-bottom: 0;
        width: 100%;
    }
    .demo-form-inline {
        margin-top: 10px;
    }

</style>