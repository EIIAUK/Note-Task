package com.demo.demo.mapper;

import com.demo.demo.model.DietaryCalendar;
import java.util.List;

public interface DietaryCalendarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DietaryCalendar record);

    DietaryCalendar selectByPrimaryKey(Integer id);

    List<DietaryCalendar> selectAll(DietaryCalendar dietaryCalendar);

    int updateByPrimaryKey(DietaryCalendar record);
}