package com.demo.demo.service.impl;

import com.demo.demo.service.DietaryCalendarService;
import com.demo.demo.mapper.DietaryCalendarMapper;
import com.demo.demo.model.DietaryCalendar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DietaryCalendarServiceImpl implements DietaryCalendarService {
    @Autowired
    private DietaryCalendarMapper dietaryCalendarMapper;

    /**
     * 查询所有的记录
     * @return
     */

    @Override
    public List<DietaryCalendar> selAll(DietaryCalendar dietaryCalendar) {
        return dietaryCalendarMapper.selectAll(dietaryCalendar);
    }


    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @Override
    public DietaryCalendar selById(Integer id) {
        return dietaryCalendarMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void del(Integer id) {
        dietaryCalendarMapper.deleteByPrimaryKey(id);
    }

    /**
     * 新增
     * @param dietaryCalendar
     */
    @Override
    public void add(DietaryCalendar dietaryCalendar) {

        dietaryCalendarMapper.insert(dietaryCalendar);
    }

    /**
     * 修改
     * @param dietaryCalendar
     */
    @Override
    public void update(DietaryCalendar dietaryCalendar) {

        dietaryCalendarMapper.updateByPrimaryKey(dietaryCalendar);
    }

    /**
     * 分页查询
     * @param currPage
     * @param dietaryCalendar
     * @return
     */
    @Override
    public PageInfo<DietaryCalendar> query(Integer currPage, DietaryCalendar dietaryCalendar) {
        if(currPage == null) currPage = 1;
        //设置查询第几页，每页的条数
        PageHelper.startPage(currPage,5);
        PageInfo<DietaryCalendar> pageInfo = new PageInfo<>(dietaryCalendarMapper.selectAll(dietaryCalendar));
        return pageInfo;
    }
}
