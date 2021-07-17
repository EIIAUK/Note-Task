package com.demo.demo.service;

import com.demo.demo.model.DietaryCalendar;
import com.github.pagehelper.PageInfo;

import java.util.List;


public interface DietaryCalendarService {
    List<DietaryCalendar> selAll(DietaryCalendar dietaryCalendar);

    DietaryCalendar selById(Integer id);

    void del(Integer id);

    void add(DietaryCalendar dietaryCalendar);

    void update(DietaryCalendar dietaryCalendar);

    PageInfo<DietaryCalendar> query(Integer currPage, DietaryCalendar dietaryCalendar);
}
