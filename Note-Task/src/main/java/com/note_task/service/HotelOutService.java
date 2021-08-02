package com.note_task.service;


import com.github.pagehelper.PageInfo;
import com.note_task.model.HotelOut;

import java.util.List;

public interface HotelOutService {

    List<HotelOut> selAll(HotelOut hotelOut);


    HotelOut selById(Integer id);


    void del(Integer id);

    void add(HotelOut hotelOut);

    void update(HotelOut hotelOut);

    PageInfo<HotelOut> query(Integer currPage, HotelOut hotelOut);


}
