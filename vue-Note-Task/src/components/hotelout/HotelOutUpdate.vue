<template>
    <div>
        <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/main' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item :to="{ path: '/HotelEgressList' }">退住管理</el-breadcrumb-item>
            <el-breadcrumb-item>编辑</el-breadcrumb-item>
        </el-breadcrumb>
        <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
            <el-form-item label="姓名" prop="customerName">
                <el-input v-model="ruleForm.customerName"></el-input>
            </el-form-item>


            <el-form-item label="申请时间">
                <span class="demonstration"></span>
                <el-date-picker
                        v-model="ruleForm.askTime"
                        align="right"
                        type="date"
                        placeholder="选择日期"
                        :picker-options="pickerOptions">
                </el-date-picker>
            </el-form-item>

            <el-form-item label="退住时间">
                <span class="demonstration"></span>
                <el-date-picker
                        v-model="ruleForm.retreatTime"
                        align="right"
                        type="date"
                        placeholder="选择日期"
                        :picker-options="pickerOptions">
                </el-date-picker>
            </el-form-item>

            <el-form-item label="退住原因" prop="retreatReason">
                <el-input v-model="ruleForm.retreatReason"></el-input>
            </el-form-item>

            <el-form-item label="审核人" prop="auditperson">
                <el-input v-model="ruleForm.auditperson"></el-input>
            </el-form-item>


            <el-form-item label="审核状态" prop="status">
                <el-select v-model="ruleForm.status" placeholder="请选择审核状态">
                    <el-option label="未审核" value="0"></el-option>
                    <el-option label="已通过" value="1"></el-option>
                    <el-option label="未通过" value="2"></el-option>
                </el-select>
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
                    askTime: '',
                    retreatTime: '',
                    retreatReason: '',
                    auditperson: '',
                    status: '',


                },
                rules: {
                    customerName: [
                        { required: true, message: '请输入姓名', trigger: 'blur' },
                    ],
                    askTime: [
                        { required: true, message: '请输入申请时间', trigger: 'blur' },
                    ],
                    retreatTime: [
                        { required: true, message: '请输入退住时间', trigger: 'blur' },
                    ],
                    retreatReason: [
                        { required: true, message: '请输入退住原因', trigger: 'blur' },
                    ],


                }
            }
        },
        created(){
            this.ruleForm.id = this.$route.params.id

            this.getData()

        },
        methods: {
            getData(){

                let url = `${HOST}/hotelOut/selById/${this.ruleForm.id}`
                axios.get(url).then(res=>{
                    this.ruleForm = res.data
                })

            },

            resetForm(ruleForm) {
                this.$refs[ruleForm].resetFields();
            },
            submitForm(ruleForm) {
                this.$refs[ruleForm].validate((valid) => {
                    if (valid) {
                        let url = `${HOST}/hotelOut/update`
                        axios.post(url,this.ruleForm).then(res=>{
                            if(res.data.state === 200){
                                this.$message.success("修改成功")
                            }
                        })
                    }
                });
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