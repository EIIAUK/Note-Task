package com.demo.demo.mapper;

import com.demo.demo.model.UserInfo;
import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    List<UserInfo> selectAll(UserInfo userInfo);

    int updateByPrimaryKey(UserInfo record);
}