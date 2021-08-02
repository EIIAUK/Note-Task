package com.note_task.mapper;

import com.note_task.model.HotelRecord;

import java.util.List;

public interface HotelRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelRecord record);

    HotelRecord selectByPrimaryKey(Integer id);

    List<HotelRecord> selectAll(HotelRecord hotelRecord);

    int updateByPrimaryKey(HotelRecord record);
}