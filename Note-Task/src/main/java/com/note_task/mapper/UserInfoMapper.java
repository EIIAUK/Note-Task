package com.note_task.mapper;

import com.note_task.model.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    List<UserInfo> selectAll(UserInfo userInfo);

    int updateByPrimaryKey(UserInfo record);
}