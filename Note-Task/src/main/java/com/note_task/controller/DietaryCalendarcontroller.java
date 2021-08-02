package com.note_task.controller;

import com.note_task.service.DietaryCalendarService;
import com.note_task.model.DietaryCalendar;
import com.note_task.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dietary")
public class DietaryCalendarcontroller {

    @Resource
    private DietaryCalendarService dietaryCalendarService;

    @RequestMapping("query/{currPage}")
    public PageInfo<DietaryCalendar> query(@PathVariable Integer currPage, @RequestBody DietaryCalendar dietaryCalendar){
        return dietaryCalendarService.query(currPage,dietaryCalendar);
    }

    @RequestMapping("selAll")
    private List<DietaryCalendar> selAll(DietaryCalendar dietaryCalendar){
        return dietaryCalendarService.selAll(dietaryCalendar);
    }

    @RequestMapping("selById/{id}")
    public DietaryCalendar selById(@PathVariable Integer id){
        return dietaryCalendarService.selById(id);
    }

    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        dietaryCalendarService.del(id);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    @RequestMapping("add")
    public ResultVO add(@RequestBody DietaryCalendar dietaryCalendar){
        dietaryCalendarService.add(dietaryCalendar);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }


}
