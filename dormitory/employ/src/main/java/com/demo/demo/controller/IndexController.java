package com.demo.demo.controller;

import com.demo.demo.vo.ResultVO;
import com.demo.demo.model.IndexInfo;
import com.demo.demo.service.IndexInfoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class IndexController {

    @Resource
    private IndexInfoService indexInfoService;

    @RequestMapping("login")
    public ResultVO login(@RequestBody IndexInfo indexInfo) {
        int status = indexInfoService.login(indexInfo);
        ResultVO resultVO = new ResultVO(200, status + "");
        return resultVO;
    }
}



