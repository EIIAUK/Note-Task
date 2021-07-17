package com.demo.demo.service;

import com.demo.demo.model.UserInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> selAll(UserInfo userInfo);

    UserInfo selById(Integer id);

    void del(Integer id);

    void add(UserInfo userInfo);

    void update(UserInfo userInfo);

    PageInfo<UserInfo> query(Integer currPage,UserInfo userInfo);
}
