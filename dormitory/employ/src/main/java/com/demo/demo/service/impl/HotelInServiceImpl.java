package com.demo.demo.service.impl;


import com.demo.demo.model.HotelIn;
import com.demo.demo.mapper.HotelInMapper;
import com.demo.demo.service.HotelInService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

/**
 *
 * @Autowired: 把Dao(数据操作)层的对象注入进来
 */
@Service
public class HotelInServiceImpl  implements HotelInService {

    @Autowired
    private HotelInMapper hotelInMapper;

    /**
     *查询所有
     * @return
     */
    @Override
    public List<HotelIn> selAll(HotelIn hotelIn) {
        return hotelInMapper.selectAll(hotelIn);
    }

    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @Override
    public HotelIn selById(Integer id) {
        return hotelInMapper.selectByPrimaryKey(id);
    }

    @Override
    public HotelIn selPsychosomatics(HotelIn hotelIn) {
        return null;
    }


    /**
     * 删除
     * @param id
     */
    @Override
    public void del(Integer id) {
        hotelInMapper.deleteByPrimaryKey(id);
    }

    /**
     * 新增
     * @param hotelIn
     */
    @Override
    public void add(HotelIn hotelIn) {
        hotelIn.setCreateDate(new Date());
        hotelInMapper.insert(hotelIn);
    }

    /**
     * 修改
     * @param hotelIn
     */
    @Override
    public void update(HotelIn hotelIn) {
        hotelInMapper.updateByPrimaryKey(hotelIn);
    }

    /**
     * 分页查询
     * @param currPage 查询的页码
     * @return
     */
    @Override
    public PageInfo<HotelIn> query(Integer currPage, HotelIn hotelIn) {
        if(currPage == null) currPage = 1;
        //设置查询第几页,每页的条数
        PageHelper.startPage(currPage,10);
        PageInfo<HotelIn> pageInfo = new PageInfo<>(hotelInMapper.selectAll(hotelIn));
        return pageInfo;
    }

}
