
package com.note_task.controller;

import com.note_task.service.NurseInfoService;
import com.note_task.model.NurseInfo;
import com.note_task.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/nurseinfo")
public class NurseInfoController {

    @Resource
    private NurseInfoService nurseInfoService;

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @RequestMapping("query/{currPage}")
    public PageInfo<NurseInfo> query(@PathVariable Integer currPage,@RequestBody NurseInfo nurseInfo){
        return nurseInfoService.query(currPage,nurseInfo);
    }

    /**
     * 查询所有记录
     * @return
     */
    @RequestMapping("selAll")
    private List<NurseInfo> selAll(@RequestBody NurseInfo nurseInfo){
        System.out.println(nurseInfo);
        return nurseInfoService.selAll(nurseInfo);
    }

    /**
     * 取所有的护理
     * @return
     */
    @RequestMapping("selNurseInfo")
    public  List<NurseInfo> selNurseInfo(){
        return nurseInfoService.selAll(new NurseInfo());
    }

    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @RequestMapping("selById/{id}")
    public NurseInfo selById(@PathVariable  Integer id){
        return nurseInfoService.selById(id);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        nurseInfoService.del(id);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     * 新增
     * @param nurseInfo
     * @return
     */
    @RequestMapping("add")
    public ResultVO add(@RequestBody NurseInfo nurseInfo){
        nurseInfoService.add(nurseInfo);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     *修改
     * @param nurseInfo
     * @return
     */
    @RequestMapping("update")
    public ResultVO update(@RequestBody NurseInfo nurseInfo ){
        nurseInfoService.update(nurseInfo);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }
}
