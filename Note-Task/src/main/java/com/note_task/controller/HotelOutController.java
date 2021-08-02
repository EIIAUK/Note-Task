package com.note_task.controller;

import com.note_task.vo.ResultVO;
import com.note_task.model.HotelOut;
import com.note_task.service.HotelOutService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("hotelOut")
public class HotelOutController {


    @Resource
    private HotelOutService hotelOutService;

    @RequestMapping("/selAll")
    private List<HotelOut> selAll(@RequestBody HotelOut hotelOut){
        System.out.println(hotelOut);
        return  hotelOutService.selAll(hotelOut);
    }


    @RequestMapping("selById/{id}")
    public HotelOut selById(@PathVariable Integer id){
        return hotelOutService.selById(id);
    }
    /**
     * 分页查询
     * @param currPage
     * @return
     */


    //分页查询 --获取页码

    @RequestMapping("query/{currPage}")
    public PageInfo<HotelOut> query(@PathVariable Integer currPage, @RequestBody HotelOut hotelOut){
        return hotelOutService.query(currPage,hotelOut);
    }



    /**
     * 取所有的症状
     * @return
     */
    @RequestMapping("selOutgoingReason")
    public  List<HotelOut> selOutgoingReason(){
        return hotelOutService.selAll(new HotelOut());
    }
    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        hotelOutService.del(id);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }
    /**
     * 新增
     * @param hotelOut
     * @return
     */
    @RequestMapping("add")
    public ResultVO add(@RequestBody HotelOut hotelOut){
        hotelOutService.add(hotelOut);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     * 修改
     * @param hotelOut
     * @return
     */

    @RequestMapping("update")
    public ResultVO update(@RequestBody HotelOut hotelOut){
        hotelOutService.update(hotelOut);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

}
