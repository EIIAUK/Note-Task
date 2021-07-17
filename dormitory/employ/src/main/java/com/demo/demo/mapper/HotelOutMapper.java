package com.demo.demo.mapper;

import com.demo.demo.model.HotelOut;
import java.util.List;

public interface HotelOutMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelOut record);

    HotelOut selectByPrimaryKey(Integer id);

    List<HotelOut> selectAll(HotelOut hotelOut);

    int updateByPrimaryKey(HotelOut record);
}