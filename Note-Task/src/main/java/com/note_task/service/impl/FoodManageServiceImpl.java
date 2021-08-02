/*
package com.demo.demo.service.impl;

import com.demo.demo.service.FoodManageService;
import com.demo.demo.mapper.FoodManageMapper;
import com.demo.demo.model.FoodManage;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodManageServiceImpl implements FoodManageService {

    @Autowired
    private FoodManageMapper foodManageMapper;

    */
/**
     * 查询所有的记录
     * @return
     *//*


    */
/*@Override
    public List<FoodManage> selAll(FoodManage foodManage) {
        return foodManageMapper.selectAll(foodManage);
    }*//*


    @Override
    public List<FoodManage> selAll(FoodManage foodManage) {
        return foodManageMapper.selectAll(foodManage);
    }


    */
/**
     * 根据主键加载
     * @param id
     * @return
     *//*

    @Override
    public FoodManage selById(Integer id) {
        return foodManageMapper.selectByPrimaryKey(id);
    }

    */
/**
     * 删除
     * @param id
     *//*

    @Override
    public void del(Integer id) {
        foodManageMapper.deleteByPrimaryKey(id);
    }

    */
/**
     * 新增
     * @param foodManage
     *//*

    @Override
    public void add(FoodManage foodManage) {

        foodManageMapper.insert(foodManage);
    }

    */
/**
     * 修改
     * @param foodManage
     *//*

    @Override
    public void update(FoodManage foodManage) {

        foodManageMapper.updateByPrimaryKey(foodManage);
    }

    */
/**
     * 分页查询
     * @param currPage
     * @param foodManage
     * @return
     *//*

    @Override
    public PageInfo<FoodManage> query(Integer currPage, FoodManage foodManage) {
        if(currPage == null) currPage = 1;
        //设置查询第几页，每页的条数
        PageHelper.startPage(currPage,5);
        PageInfo<FoodManage> pageInfo = new PageInfo<>(foodManageMapper.selectAll(foodManage));
        return pageInfo;
    }
}

*/
