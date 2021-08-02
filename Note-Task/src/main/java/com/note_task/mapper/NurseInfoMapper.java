package com.note_task.mapper;

import com.note_task.model.NurseInfo;

import java.util.List;

public interface NurseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NurseInfo record);

    NurseInfo selectByPrimaryKey(Integer id);

    List<NurseInfo> selectAll(NurseInfo nurseInfo);

    int updateByPrimaryKey(NurseInfo record);
}