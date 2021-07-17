package com.demo.demo.service.impl;

import com.demo.demo.service.NurseInfoService;
import com.demo.demo.mapper.NurseInfoMapper;
import com.demo.demo.model.NurseInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NurseInfoServiceImpl implements NurseInfoService{

    @Autowired
    private NurseInfoMapper nurseInfoMapper;

    /**
     * 查询所有的记录
     * @return
     */
    @Override
    public List<NurseInfo> selAll(NurseInfo nurseInfo) {
        return nurseInfoMapper.selectAll(nurseInfo);
    }

    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @Override
    public NurseInfo selById(Integer id) {
        return nurseInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void del(Integer id) {
        nurseInfoMapper.deleteByPrimaryKey(id);

    }

    /**
     * 新增
     * @param nurseInfo
     */
    @Override
    public void add(NurseInfo nurseInfo) {
        nurseInfoMapper.insert(nurseInfo);
    }

    /**
     * 修改
     * @param nurseInfo
     */
    @Override
    public void update(NurseInfo nurseInfo) {
        nurseInfoMapper.updateByPrimaryKey(nurseInfo);
    }

    /**
     * 分页查询
     * @param currPage
     * @param nurseInfo
     * @return
     */
    @Override
    public PageInfo<NurseInfo> query(Integer currPage, NurseInfo nurseInfo) {
        if(currPage == null) currPage = 1;
        //设置查询第几页，每页的条数
        PageHelper.startPage(currPage,10);
        PageInfo<NurseInfo> pageInfo = new PageInfo<>(nurseInfoMapper.selectAll(nurseInfo));
        return pageInfo;
    }
}

