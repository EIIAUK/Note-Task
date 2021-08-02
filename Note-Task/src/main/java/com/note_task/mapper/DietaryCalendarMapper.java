package com.note_task.mapper;

import com.note_task.model.DietaryCalendar;

import java.util.List;

public interface DietaryCalendarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DietaryCalendar record);

    DietaryCalendar selectByPrimaryKey(Integer id);

    List<DietaryCalendar> selectAll(DietaryCalendar dietaryCalendar);

    int updateByPrimaryKey(DietaryCalendar record);
}