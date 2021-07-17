<template>
    <div>
        <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/main' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item :to="{ path: '/HotelEgressList' }">外出管理</el-breadcrumb-item>
            <el-breadcrumb-item>新增</el-breadcrumb-item>
        </el-breadcrumb>
        <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
            <el-form-item label="姓名" prop="customerName">
                <el-input v-model="ruleForm.customerName"></el-input>
            </el-form-item>

            <el-form-item label="外出时间">
                <span class="demonstration"></span>
                <el-date-picker
                        v-model="ruleForm.outgoingTime"
                        align="right"
                        type="date"
                        placeholder="选择日期"
                        :picker-options="pickerOptions">
                </el-date-picker>
            </el-form-item>


            <el-form-item label="预计返回时间">
                <span class="demonstration"></span>
                <el-date-picker
                        v-model="ruleForm.expectedreturnTime"
                        align="right"
                        type="date"
                        placeholder="选择日期"
                        :picker-options="pickerOptions">
                </el-date-picker>
            </el-form-item>
            <el-form-item label="实际返回时间">
                <span class="demonstration"></span>
                <el-date-picker
                        v-model="ruleForm.actualreturnTime"
                        align="right"
                        type="date"
                        placeholder="选择日期"
                        :picker-options="pickerOptions">
                </el-date-picker>
            </el-form-item>
            <el-form-item label="出行原因" prop="outgoingReason">
                <el-input v-model="ruleForm.outgoingReason"></el-input>
            </el-form-item>


            <el-form-item label="陪同人" prop="escorted">
                <el-input v-model="ruleForm.escorted"></el-input>
            </el-form-item>
            <el-form-item label="关系" prop="relation">
                <el-input v-model="ruleForm.relation"></el-input>
            </el-form-item>
            <el-form-item label="联系电话" prop="escortedtel">
                <el-input v-model="ruleForm.escortedtel"></el-input>
            </el-form-item>

            <el-form-item label="审核状态" prop="auditStatus">
                <el-select v-model="ruleForm.auditStatus" placeholder="请选择审核状态">
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
                    outgoingReason: '',
                    outgoingTime: '',
                    expectedreturnTime: '',
                    actualreturnTime: '',
                    escorted: '',
                    relation: '',
                    escortedtel: '',
                    auditStatus: '',

                },
                rules: {
                    customerName: [
                        { required: true, message: '请输入姓名', trigger: 'blur' },
                    ],
                    outgoingReason: [
                        { required: true, message: '请输入出行原因', trigger: 'blur' },
                    ],
                    outgoingTime: [
                        { required: true, message: '请输入出行时间', trigger: 'blur' },
                    ],
                    expectedreturnTime: [
                        { required: true, message: '请输入预计返回时间', trigger: 'blur' },
                    ],
                    escorted: [
                        { required: true, message: '请输入陪同人', trigger: 'blur' },
                    ],
                    escortedtel: [
                        { required: true, message: '请选择电话', trigger: 'blur' },
                    ],

                }
            }
        },
        created(){

           this.ruleForm.id = this.$route.params.id
          //  console.log(this.ruleForm.id)
             this.getData()
        },
        methods: {
            getData(){

                let url = `${HOST}/hotelRecord/selById/${this.ruleForm.id}`
                axios.get(url).then(res=>{
                    this.ruleForm = res.data
                })

            },
            submitForm(ruleForm) {
                this.$refs[ruleForm].validate((valid) => {
                    if (valid) {
                        let url = `${HOST}/hotelRecord/update`
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