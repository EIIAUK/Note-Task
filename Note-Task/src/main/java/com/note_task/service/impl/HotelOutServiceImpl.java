package com.note_task.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.note_task.mapper.HotelOutMapper;
import com.note_task.model.HotelOut;
import com.note_task.service.HotelOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelOutServiceImpl implements HotelOutService {
    @Autowired
  private HotelOutMapper hotelOutMapper;
    //  private HotelOutMapper hotelOutMapper;



    /**
     *查询所有
     * @return
     */
    @Override
    public List<HotelOut> selAll(HotelOut hotelOut) {
        return hotelOutMapper.selectAll(hotelOut);

    }

    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @Override
    public HotelOut selById(Integer id) {
        return hotelOutMapper.selectByPrimaryKey(id);
    }




    /**
     * 删除
     * @param id
     */
    @Override
    public void del(Integer id) {
        hotelOutMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(HotelOut hotelOut) {
        hotelOutMapper.insert(hotelOut);
    }

    /**
     * 新增
     * @param hotelOut
     */
 /* @Override
    public void add(HotelOut hotelOut) {
        hotelOut.setCreateDate(new Date());
        hotelOutMapper.insert(hotelOut);
    }*/

    /**
     * 修改
     * @param hotelOut
     */
    @Override
    public void update(HotelOut hotelOut) {
        hotelOutMapper.updateByPrimaryKey(hotelOut);
    }


    /**
     * 分页查询
     * @param currPage 查询的页码
     * @return
     */
    @Override
    public PageInfo<HotelOut> query(Integer currPage, HotelOut hotelOut) {
        if(currPage == null) currPage = 1;
        //设置查询第几页,每页的条数
        PageHelper.startPage(currPage,10);
        PageInfo<HotelOut> pageInfo = new PageInfo<>(hotelOutMapper.selectAll(hotelOut));
        return pageInfo;
    }
}
