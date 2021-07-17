package com.demo.demo.controller;

import com.demo.demo.service.BedManageService;
import com.demo.demo.model.BedManage;
import com.demo.demo.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bedmanage")
public class BedManageController {

    @Resource
    private BedManageService bedManageService;


    @RequestMapping("query/{currPage}")
    public PageInfo<BedManage> query(@PathVariable Integer currPage, @RequestBody BedManage bedManage){
        return bedManageService.query(currPage,bedManage);
    }

    @RequestMapping("selAll")
    private List<BedManage> selAll(BedManage bedManage){
        return bedManageService.selAll(bedManage);
    }



    @RequestMapping("selById/{id}")
    public BedManage selById(@PathVariable Integer id){
        return bedManageService.selById(id);
    }



    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        bedManageService.del(id);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     * 新增
     * @param bedManage
     * @return
     */

    @RequestMapping("add")
    public ResultVO add(@RequestBody BedManage bedManage){
        bedManageService.add(bedManage);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    @RequestMapping("update")
    public ResultVO update(@RequestBody BedManage bedManage ){
        bedManageService.update(bedManage);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

}
