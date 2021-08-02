package com.note_task.service.impl;

import com.note_task.service.BedManageService;
import com.note_task.mapper.BedManageMapper;
import com.note_task.model.BedManage;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedManageServiceImpl implements BedManageService {

    @Autowired
    private BedManageMapper bedManageMapper;


    @Override
    public List<BedManage> selAll(BedManage bedManage) {
        return bedManageMapper.selectAll(bedManage);
    }

    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @Override
    public BedManage selById(Integer id) {
        return bedManageMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void del(Integer id) {
        bedManageMapper.deleteByPrimaryKey(id);
    }

    /**
     * 新增
     * @param bedManage
     */
    @Override
    public void add(BedManage bedManage) {

        bedManageMapper.insert(bedManage);
    }

    /**
     * 修改
     * @param bedManage
     */
    @Override
    public void update(BedManage bedManage) {

        bedManageMapper.updateByPrimaryKey(bedManage);
    }

    /**
     * 分页查询
     * @param currPage
     * @param bedManage
     * @return
     */
    @Override
    public PageInfo<BedManage> query(Integer currPage, BedManage bedManage) {
        if(currPage == null) currPage = 1;
        //设置查询第几页，每页的条数
        PageHelper.startPage(currPage,5);
        PageInfo<BedManage> pageInfo = new PageInfo<>(bedManageMapper.selectAll(bedManage));
        return pageInfo;
    }
}
