package com.demo.demo.service.impl;

import com.demo.demo.mapper.IndexInfoMapper;
import com.demo.demo.model.IndexInfo;
import com.demo.demo.service.IndexInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IndexInfoServiceImpl implements IndexInfoService{

    @Autowired
    private IndexInfoMapper indexInfoMapper;

    /**
     * 登录
     * @param indexInfo
     * @return 0-成功 1-密码错误 2-用户名错误
     */
    @Override
    public int login(IndexInfo indexInfo) {

         /*   //随机生成一个uuid 作为盐 + md5   存储密码
         String salt =   UUID.randomUUID().toString().substring(0,5);*/
        int flag = 0;
        IndexInfo u = indexInfoMapper.selectByUserName(indexInfo.getUsername());
        if(u != null){//有当前的用户
            //密码错误
            if(u.getPassword().equals(indexInfo.getPassword())) {
               /* if (u.getLabel().equals(indexInfo.getLabel())){}
                else{ flag = 3;}*/
            }
            else{flag= 1;}
        }
        else {//没有用户
            flag = 2;
        }
        return flag;
    }
}
