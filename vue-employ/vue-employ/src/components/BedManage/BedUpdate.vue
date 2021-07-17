<template>
    <div>
        <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/main' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item :to="{ path: '/bedList' }">床位管理</el-breadcrumb-item>
            <el-breadcrumb-item>修改</el-breadcrumb-item>
        </el-breadcrumb>
        <el-form ref="form" :rules="rules" :model="form" label-width="100px" class="content">
            <el-form-item label="创建时间">
                <span class="demonstration"></span>
                <el-date-picker
                        v-model="form.createDate"
                        align="right"
                        type="date"
                        placeholder="选择日期"
                        :picker-options="pickerOptions">
                </el-date-picker>
            </el-form-item>
            <el-form-item label="床位名称" prop="name">
                <el-input v-model="form.name"></el-input>
            </el-form-item>
            <el-form-item label="床位编号">
                <el-input v-model="form.roomNumber"></el-input>
            </el-form-item>
            <el-form-item label="床位状态" prop="bedStatus">
                <el-select v-model="form.bedStatus" placeholder="请选择状态">
                    <el-option label="空闲中" value="0"></el-option>
                    <el-option label="使用中" value="1"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item>
                <el-button type="primary" @click="onSubmit('form')">确定</el-button>
            </el-form-item>
        </el-form>
    </div>
</template>

<script>
    import axios from 'axios'
    import {HOST} from "../../common/config";

    export default {
        data(){
            return{
                form: {
                    name: '',
                    roomNumber: '',
                    bedStatus: '',
                },
                rules: { //校验规则
                    name: [
                        { required: true, message: '请输入床位名称', trigger: 'blur' },
                    ],
                    roomNumber: [
                        { required: true, message: '请输入床位编号', trigger: 'blur' }
                    ],
                },
                pickerOptions: {
                    disabledDate(time) {
                        return time.getTime() > Date.now();
                    },
                    shortcuts: [{
                        text: '今天',
                        onClick(picker) {
                            picker.$emit('pick', new Date());
                        }
                    }, {
                        text: '昨天',
                        onClick(picker) {
                            const date = new Date();
                            date.setTime(date.getTime() - 3600 * 1000 * 24);
                            picker.$emit('pick', date);
                        }
                    }, {
                        text: '一周前',
                        onClick(picker) {
                            const date = new Date();
                            date.setTime(date.getTime() - 3600 * 1000 * 24 * 7);
                            picker.$emit('pick', date);
                        }
                    }]
                }
            }
        },
        created(){
            this.form.id = this.$route.params.id
            this.getData();
        },
        methods:{
            //加载数据
            getData(){
                let url = `${HOST}/bedmanage/selById/${this.form.id}`
                axios.get(url).then(res=>{
                    this.form = res.data
                })
            },

            onSubmit(formName){
                this.$refs[formName].validate((valid) => {
                    if (valid) { //校验通过
                        let url = `${HOST}/bedmanage/update`
                        axios.post(url,this.form).then(res=>{
                            if(res.data.state === 200){//成功
                                this.$message.success("修改成功")
                            }
                        })
                    }
                })
            }
        }
    }
</script>

<style scoped>
    .content {
        margin-top: 10px;
    }
</style>