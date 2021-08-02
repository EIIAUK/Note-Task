<template>
    <div>
        <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/main' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item :to="{ path: '/HotelInList' }">入住管理</el-breadcrumb-item>
            <el-breadcrumb-item>修改</el-breadcrumb-item>
        </el-breadcrumb>
        <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
            <el-form-item label="姓名" prop="customerName">
                <el-input v-model="ruleForm.customerName"></el-input>
            </el-form-item>
            <el-form-item label="症状" prop="psychosomaticstate">
                <el-input v-model="ruleForm.psychosomaticstate"></el-input>
            </el-form-item>

            <el-form-item label="性别" prop="customerSex">
                <el-select v-model="ruleForm.customerSex" placeholder="请选择性别">
                    <el-option label="男" value="0"></el-option>
                    <el-option label="女" value="1"></el-option>
                    <el-option label="不限" value="2"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="年龄" prop="customerAge">
                <el-input v-model="ruleForm.customerAge"></el-input>
            </el-form-item>
            <el-form-item label="身份证" prop="idcard">
                <el-input v-model="ruleForm.idcard"></el-input>
            </el-form-item>
            <el-form-item label="入住类型" prop="elderType">
                <el-select v-model="ruleForm.elderType" placeholder="请选择入住类型">
                    <el-option label="月卡" value="0"></el-option>
                    <el-option label="季度" value="1"></el-option>
                    <el-option label="年卡" value="2"></el-option>
                    <el-option label="永久" value="3"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="楼号" prop="buildingId">
                <el-input v-model="ruleForm.buildingId"></el-input>
            </el-form-item>
            <el-form-item label="房间号" prop="roomid">
                <el-input v-model="ruleForm.roomid"></el-input>
            </el-form-item>
            <el-form-item label="床号" prop="bedId">
                <el-input v-model="ruleForm.bedId"></el-input>
            </el-form-item>

            <el-form-item label="入住时间">
                <span class="demonstration"></span>
                <el-date-picker
                        v-model="ruleForm.checkinDate"
                        align="right"
                        type="date"
                        placeholder="选择日期"
                        :picker-options="pickerOptions">
                </el-date-picker>
            </el-form-item>

            <el-form-item label="注意事项" prop="attention">
                <el-input rows="10" type="textarea" v-model="ruleForm.attention"></el-input>
            </el-form-item>
            <el-form-item>
                <el-button type="primary" @click="submitForm('ruleForm')">修改</el-button>
                <el-button @click="resetForm('ruleForm')">清空</el-button>
            </el-form-item>
        </el-form>
    </div>
</template>

<script>
    import axios from 'axios'
    import {HOST} from '../../common/config'
    import ElFormItem from "element-ui/packages/form/src/form-item";
    import {makeSimpleDate} from "../../common/dateformat";
    export default {
        components: {ElFormItem},
        data(){
            return {
                host: '',

                ruleForm: {
                    id:'',
                    customerName: '',
                    psychosomaticstate: '',
                    customerSex: '',
                    customerAge: '',
                    idcard: '',
                    elderType: '',
                    buildingId: '',
                    roomid: '',
                    bedId: '',
                    checkinDate:'',
                    attention:'',
                },
                rules: {
                    customerName: [
                        { required: true, message: '请输入姓名', trigger: 'blur' },
                    ],
                    idcard: [
                        { required: true, message: '请输入身份证', trigger: 'blur' },
                    ],
                    buildingId: [
                        { required: true, message: '请输入楼号', trigger: 'blur' },
                    ],
                    roomid: [
                        { required: true, message: '请输入房号', trigger: 'blur' },
                    ],
                    bedId: [
                        { required: true, message: '请输入床号', trigger: 'blur' },
                    ],
                    customerSex: [
                        { required: true, message: '请选择性别', trigger: 'blur' },
                    ],
                    elderType: [
                        { required: true, message: '请选择入住类型', trigger: 'blur' },
                    ],
                    psychosomaticstate: [
                        { required: true, message: '请输入职位信息', trigger: 'blur' },
                    ],
                    checkinDate: [
                        { required: true, message: '请输入职位信息', trigger: 'blur' },
                    ],
                }
            }
        },
        created(){
            //取出
            this.ruleForm.id = this.$route.params.id

            this.getData()
        },
        methods: {

            //加载数据
            getData(){

                let url = `${HOST}/hosteling/selById/${this.ruleForm.id}`
                axios.get(url).then(res=>{
                    this.ruleForm = res.data
                })

            },


            submitForm(ruleForm) {
                this.$refs[ruleForm].validate((valid) => {
                    if (valid) {
                        let url = `${HOST}/hosteling/update`
                        axios.post(url,this.ruleForm).then(res=>{
                            if(res.data.state === 200){
                                this.$message.success("修改成功")
                            }
                        })
                    }
                });
            },
            resetForm(ruleForm) {
                this.$refs[ruleForm].resetFields();
            },

            convert(data){
                return makeSimpleDate(data)

            }

        }

    }
</script>

<style scoped>
    .demo-ruleForm {
        margin-top: 10px;
    }
</style>