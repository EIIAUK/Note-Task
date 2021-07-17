package com.demo.demo.mapper;

import com.demo.demo.model.IndexInfo;

import java.util.List;

public interface IndexInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IndexInfo record);

    IndexInfo selectByPrimaryKey(Integer id);

    List<IndexInfo> selectAll();

    int updateByPrimaryKey(IndexInfo record);

    IndexInfo selectByUserName(String username);
}