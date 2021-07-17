package com.demo.demo.controller;

import com.demo.demo.model.HotelRecord;
import com.demo.demo.service.HotelRecordService;
import com.demo.demo.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("hotelRecord")
public class HotelRecordController {


    @Resource
    private HotelRecordService hotelRecordService;

    @RequestMapping("/selAll")
    private List<HotelRecord> selAll(@RequestBody HotelRecord hotelRecord){
        return  hotelRecordService.selAll(hotelRecord);
    }

    @RequestMapping("selById/{id}")
    public HotelRecord selById(@PathVariable Integer id){
        return hotelRecordService.selById(id);
    }



    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @RequestMapping("query/{currPage}")
    public PageInfo<HotelRecord> query(@PathVariable Integer currPage, @RequestBody HotelRecord hotelRecord){
        return hotelRecordService.query(currPage,hotelRecord);
    }

    /**
     * 取所有的症状
     * @return
     */

    @RequestMapping("selOutgoingReason")
    public  List<HotelRecord> selOutgoingReason(){
        return hotelRecordService.selAll(new HotelRecord());
    }
    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        hotelRecordService.del(id);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     * 新增
     * @param hotelRecord
     * @return
     */
    @RequestMapping("add")
    public ResultVO add(@RequestBody HotelRecord hotelRecord){
        hotelRecordService.add(hotelRecord);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }


    /**
     * 修改
     * @param hotelRecord
     * @return
     */


    @RequestMapping("update")
    public ResultVO update(@RequestBody HotelRecord hotelRecord){
        hotelRecordService.update(hotelRecord);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    }

