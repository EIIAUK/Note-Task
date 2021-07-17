package com.demo.demo.controller;

//import com.demo.demo.service.UserInfoService;
import com.demo.demo.model.UserInfo;
import com.demo.demo.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {
    @Resource
    private com.demo.demo.service.UserInfoService userInfoService;

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @RequestMapping("query/{currPage}")
    public PageInfo<UserInfo> query(@PathVariable Integer currPage,@RequestBody UserInfo userInfo){
        return userInfoService.query(currPage,userInfo);
    }


    /**
     * 查询所有记录
     * @return
     */
    @RequestMapping("selAll")
    private List<UserInfo> selAll(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        return userInfoService.selAll(userInfo);
    }

    /**
     * 取所有的记录
     * @return
     */
    @RequestMapping("selUser")
    public  List<UserInfo> selUser(){
        return userInfoService.selAll(new UserInfo());
    }


    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @RequestMapping("selById/{id}")
    public UserInfo selById(@PathVariable  Integer id){
        return userInfoService.selById(id);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        userInfoService.del(id);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     * 新增
     * @param userInfo
     * @return
     */
    @RequestMapping("add")
    public ResultVO add(@RequestBody UserInfo userInfo){
        userInfoService.add(userInfo);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     *修改
     * @param userInfo
     * @return
     */
    @RequestMapping("update")
    public ResultVO update(@RequestBody UserInfo userInfo ){
        userInfoService.update(userInfo);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }
}
