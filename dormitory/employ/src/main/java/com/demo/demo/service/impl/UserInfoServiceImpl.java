package com.demo.demo.service.impl;

import com.demo.demo.mapper.UserInfoMapper;
import com.demo.demo.model.UserInfo;
import com.demo.demo.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {


    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 查询所有记录
     * @return
     */
    @Override
    public List<UserInfo> selAll(UserInfo userInfo) {
        return userInfoMapper.selectAll(userInfo);
    }

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    @Override
    public UserInfo selById(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void del(Integer id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    /**
     * 新增
     * @param userInfo
     */
    @Override
    public void add(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }

    /**
     * 修改
     * @param userInfo
     */
    @Override
    public void update(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);
    }

    /**
     * 分页查询
     * @param currPage
     * @param userInfo
     * @return
     */
    @Override
    public PageInfo<UserInfo> query(Integer currPage, UserInfo userInfo) {
        if(currPage == null) currPage = 1;
        //设置查询第几页，每页的条数
        PageHelper.startPage(currPage,10);
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfoMapper.selectAll(userInfo));
        return pageInfo;
    }

}
