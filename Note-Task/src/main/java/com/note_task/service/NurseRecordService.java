package com.note_task.service;

import com.note_task.model.NurseRecord;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface NurseRecordService {

    List<NurseRecord> selAll(NurseRecord nurseRecord);

    NurseRecord selById(Integer id);

    void del(Integer id);

    void add(NurseRecord nurseRecord);

    void update(NurseRecord nurseRecord);

    PageInfo<NurseRecord> query(Integer currPage,NurseRecord nurseRecord);
}
