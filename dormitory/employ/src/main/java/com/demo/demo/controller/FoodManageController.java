/*
package com.demo.demo.controller;

import com.demo.demo.service.FoodManageService;
import com.demo.demo.model.FoodManage;
import com.demo.demo.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/foodmanage")
public class FoodManageController {

    @Resource
    private FoodManageService foodManageService;

    @RequestMapping("query/{currPage}")
    public PageInfo<FoodManage> query(@PathVariable Integer currPage, @RequestBody FoodManage foodManage){
        return foodManageService.query(currPage,foodManage);
    }

    @RequestMapping("selAll")
    private List<FoodManage> selAll(FoodManage foodManage){
        return foodManageService.selAll(foodManage);
    }

    @RequestMapping("selById/{id}")
    public FoodManage selById(@PathVariable Integer id){
        return foodManageService.selById(id);
    }

    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        foodManageService.del(id);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    @RequestMapping("add")
    public ResultVO add(@RequestBody FoodManage foodManage){
        foodManageService.add(foodManage);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    @RequestMapping("update")
    public ResultVO update(@RequestBody FoodManage foodManage ){
        foodManageService.update(foodManage);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

}
*/
