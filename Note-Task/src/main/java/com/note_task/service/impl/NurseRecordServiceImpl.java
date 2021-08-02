package com.note_task.service.impl;

import com.note_task.service.NurseRecordService;
import com.note_task.mapper.NurseRecordMapper;
import com.note_task.model.NurseRecord;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NurseRecordServiceImpl implements NurseRecordService {

    @Autowired
    private NurseRecordMapper nurseRecordMapper;

    /**
     * 查询所有的记录
     * @return
     */
    @Override
    public List<NurseRecord> selAll(NurseRecord nurseRecord) {
        return nurseRecordMapper.selectAll(nurseRecord);
    }

    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @Override
    public NurseRecord selById(Integer id) {
        return nurseRecordMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void del(Integer id) {
        nurseRecordMapper.deleteByPrimaryKey(id);

    }

    /**
     * 新增
     * @param nurseRecord
     */
    @Override
    public void add(NurseRecord nurseRecord) {
        nurseRecordMapper.insert(nurseRecord);

    }

    /**
     * 修改
     * @param nurseRecord
     */
    @Override
    public void update(NurseRecord nurseRecord) {
        nurseRecordMapper.updateByPrimaryKey(nurseRecord);
    }

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @Override
    public PageInfo<NurseRecord> query(Integer currPage,NurseRecord nurseRecord) {
        if(currPage == null) currPage = 1;
        //设置查询第几页，每页的条数
        PageHelper.startPage(currPage,10);
        PageInfo<NurseRecord> pageInfo = new PageInfo<>(nurseRecordMapper.selectAll(nurseRecord));
        return pageInfo;
    }
}
