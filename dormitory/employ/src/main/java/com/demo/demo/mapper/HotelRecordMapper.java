package com.demo.demo.mapper;

import com.demo.demo.model.HotelRecord;

import java.util.List;

public interface HotelRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelRecord record);

    HotelRecord selectByPrimaryKey(Integer id);

    List<HotelRecord> selectAll(HotelRecord hotelRecord);

    int updateByPrimaryKey(HotelRecord record);
}