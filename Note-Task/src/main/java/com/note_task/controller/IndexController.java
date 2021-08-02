package com.note_task.controller;

import com.note_task.vo.ResultVO;
import com.note_task.model.IndexInfo;
import com.note_task.service.IndexInfoService;
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



