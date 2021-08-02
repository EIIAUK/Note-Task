package com.note_task.mapper;

import com.note_task.model.HotelIn;

import java.util.List;

public interface HotelInMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelIn record);

    HotelIn selectByPrimaryKey(Integer id);

    List<HotelIn> selectAll(HotelIn hotelIn);

    int updateByPrimaryKey(HotelIn record);
}