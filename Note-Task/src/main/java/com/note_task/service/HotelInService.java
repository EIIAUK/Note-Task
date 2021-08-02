package com.note_task.service;


import com.note_task.model.HotelIn;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface HotelInService {

    List<HotelIn> selAll(HotelIn hotelIn);

    HotelIn selById(Integer id);


    HotelIn selPsychosomatics(HotelIn hotelIn);

    void del(Integer id);

    void add(HotelIn hotelIn);

    void update(HotelIn hotelIn);

    PageInfo<HotelIn> query(Integer currPage, HotelIn hotelIn);


}
