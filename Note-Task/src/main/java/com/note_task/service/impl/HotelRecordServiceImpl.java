package com.note_task.service.impl;

import com.note_task.model.HotelRecord;
import com.note_task.service.HotelRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.note_task.mapper.HotelRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelRecordServiceImpl implements HotelRecordService {
    @Autowired
    private HotelRecordMapper hotelRecordMapper;

    /**
     * 查询所有
     * @return
     */

    @Override
    public List<HotelRecord> selAll(HotelRecord hotelRecord) {
        return hotelRecordMapper.selectAll(hotelRecord);
    }



    @Override
    public HotelRecord selById(Integer id) {
        return hotelRecordMapper.selectByPrimaryKey(id);
    }



    /**
     * 删除
     * @param id
     */
    @Override
    public void del(Integer id) {
        hotelRecordMapper.deleteByPrimaryKey(id);
    }



    /**
     * 新增
     * @param hotelRecord
     */
   @Override
    public void add(HotelRecord hotelRecord) {
      //  hotelRecord.setOutgoingTime(new Date());
        hotelRecordMapper.insert(hotelRecord);
    }

    /**
     * 修改
     * @param hotelRecord
     */

    @Override
    public void update(HotelRecord hotelRecord) {
        hotelRecordMapper.updateByPrimaryKey(hotelRecord);
    }

    /**
     * 分页查询
     * @param currPage 查询的页码
     * @return
     */
    @Override
    public PageInfo<HotelRecord> query(Integer currPage, HotelRecord hotelRecord) {
        if(currPage == null) currPage = 1;
        //设置查询第几页,每页的条数
        PageHelper.startPage(currPage,10);
        PageInfo<HotelRecord> pageInfo = new PageInfo<>(hotelRecordMapper.selectAll(hotelRecord));
        return pageInfo;
    }


}
