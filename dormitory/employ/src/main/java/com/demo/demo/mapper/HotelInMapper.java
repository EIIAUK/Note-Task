package com.demo.demo.mapper;

import com.demo.demo.model.HotelIn;

import java.util.List;

public interface HotelInMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelIn record);

    HotelIn selectByPrimaryKey(Integer id);

    List<HotelIn> selectAll(HotelIn hotelIn);

    int updateByPrimaryKey(HotelIn record);
}