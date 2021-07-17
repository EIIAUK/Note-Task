package com.demo.demo.mapper;

import com.demo.demo.model.NurseRecord;
import java.util.List;

public interface NurseRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NurseRecord record);

    NurseRecord selectByPrimaryKey(Integer id);

    List<NurseRecord> selectAll(NurseRecord nurseRecord);

    int updateByPrimaryKey(NurseRecord record);
}