<template>
    <div>
        <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/main' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item :to="{ path: '/dietaryList' }">膳食日历</el-breadcrumb-item>
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
            <el-form-item label="膳食名称" prop="foodName">
                <el-input v-model="form.foodName"></el-input>
            </el-form-item>
            <el-form-item label="膳食种类" prop="foodType">
                <el-select v-model="form.foodType" placeholder="请选择种类">
                    <el-option label="大荤" value="1"></el-option>
                    <el-option label="小荤" value="2"></el-option>
                    <el-option label="素菜" value="3"></el-option>
                    <el-option label="水果" value="4"></el-option>
                    <el-option label="甜点" value="5"></el-option>
                    <el-option label="套餐" value="6"></el-option>
                    <el-option label="汤" value="7"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="膳食标签" prop="foodTag">
                <el-select v-model="form.foodTag" placeholder="请选择标签">
                    <el-option label="多糖" value="1"></el-option>
                    <el-option label="少糖" value="2"></el-option>
                    <el-option label="高脂肪" value="3"></el-option>
                    <el-option label="低脂肪" value="4"></el-option>
                    <el-option label="多盐" value="5"></el-option>
                    <el-option label="少盐" value="6"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="膳食价格" prop="foodPrice">
                <el-input v-model="form.foodPrice"></el-input>
            </el-form-item>
            <el-form-item label="照片">
                <el-upload
                        class="avatar-uploader"
                        :action="`${host}/common/upload`"
                        list-type="picture-card"
                        :show-file-list="false"
                        :on-success="handleAvatarSuccess"
                        :before-upload="beforeAvatarUpload">
                    <img v-if="form.foodPicture" :src="`${host}/${form.foodPicture}`" class="avatar">
                    <i v-else class="el-icon-plus avatar-uploader-icon"></i>
                </el-upload>
            </el-form-item>
            <el-form-item label="是否清真" prop="mamalFlag">
                <el-input v-model="form.mamalFlag"></el-input>
            </el-form-item>
            <el-form-item label="提供日期" prop="supplyDate">
                <el-input v-model="form.supplyDate"></el-input>
            </el-form-item>
            <el-form-item label="提供星期" prop="supplyType">
                <el-input v-model="form.supplyType"></el-input>
            </el-form-item>
            <el-form-item>
                <el-button type="primary" @click="onSubmit('form')">立即创建</el-button>
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
                host:'',
                form: {
                    createDate: '',
                    foodName: '',
                    foodType: '',
                    foodTag: '',
                    foodPrice:'',
                    foodPicture:'',
                    mamalFlag:'',
                    supplyDate:'',
                    supplyType:'',
                },
                rules: { //校验规则
                    foodName: [
                        { required: true, message: '请输入膳食名称', trigger: 'blur' },
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
            this.host = HOST
        },
        methods:{
            onSubmit(formName){
                this.$refs[formName].validate((valid) => {
                    if (valid) { //校验通过
                        let url = `${HOST}/dietary/update`
                        axios.post(url,this.form).then(res=>{
                            if(res.data.state === 200){//成功
                                this.$message.success("修改成功")
                            }
                        })
                    }
                })
            },
            beforeAvatarUpload(file) {
                const isJPG = file.type === 'image/jpeg' || 'image/png';
                const isLt2M = file.size / 1024 / 1024 < 20;

                if (!isJPG) {
                    this.$message.error('上传头像图片只能是 JPG 格式!');
                }
                if (!isLt2M) {
                    this.$message.error('上传头像图片大小不能超过 2MB!');
                }
                return isJPG && isLt2M;
            },
            //文件上传成功时的钩子
            handleAvatarSuccess(res) {
                console.log(res)
                //把上传的文件名赋给photo
                this.ruleForm.photo = res.msg
            },
        }
    }
</script>

<style scoped>
    .content {
        margin-top: 10px;
    }
</style>