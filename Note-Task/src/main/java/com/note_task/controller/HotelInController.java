package com.note_task.controller;
import com.note_task.model.HotelIn;
import com.note_task.service.HotelInService;
import com.note_task.vo.ResultVO;
import com.github.pagehelper.PageInfo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;

@RestController
 @RequestMapping("hosteling")
public class HotelInController {
    /**
     * 查询所有
     */
    @Resource
    private HotelInService hotelInService;

    @RequestMapping("/selAll")
    private List<HotelIn> selAll(@RequestBody HotelIn hotelIn){

        System.out.println(hotelIn);
        return  hotelInService.selAll(hotelIn);
    }

    /**
     * 根据主键查询
     * @param id
     * @return
     */



    @RequestMapping("selById/{id}")
    public HotelIn selById(@PathVariable Integer id){
        return hotelInService.selById(id);
    }



    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @RequestMapping("query/{currPage}")
    public PageInfo<HotelIn> query(@PathVariable Integer currPage, @RequestBody HotelIn hotelIn){
        return hotelInService.query(currPage,hotelIn);
    }

    /**
     * 取所有的症状
     * @return
     */

    @RequestMapping("selPsychosomatics")
    public  List<HotelIn> selPsychosomatics(){
        return hotelInService.selAll(new HotelIn());
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        hotelInService.del(id);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     * 新增
     * @param hotelIn
     * @return
     */
    @RequestMapping("add")
    public ResultVO add(@RequestBody HotelIn hotelIn){
        hotelInService.add(hotelIn);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     * 修改
     * @param hotelIn
     * @return
     */
    @RequestMapping("update")
    public ResultVO update(@RequestBody HotelIn hotelIn){
        hotelInService.update(hotelIn);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

}
