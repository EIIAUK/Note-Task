package com.note_task.service;

import com.note_task.model.NurseInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface NurseInfoService {

    List<NurseInfo> selAll(NurseInfo nurseInfo);

    NurseInfo selById(Integer id);

    void del(Integer id);

    void add(NurseInfo nurseInfo);

    void update(NurseInfo nurseInfo);

    PageInfo<NurseInfo> query(Integer currPage, NurseInfo nurseInfo);

}
