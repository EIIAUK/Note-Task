package com.demo.demo.mapper;

import com.demo.demo.model.NurseInfo;

import java.util.List;

public interface NurseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NurseInfo record);

    NurseInfo selectByPrimaryKey(Integer id);

    List<NurseInfo> selectAll(NurseInfo nurseInfo);

    int updateByPrimaryKey(NurseInfo record);
}