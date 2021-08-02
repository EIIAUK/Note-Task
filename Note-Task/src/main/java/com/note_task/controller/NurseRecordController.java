package com.note_task.controller;

import com.note_task.service.NurseRecordService;
import com.note_task.model.NurseRecord;
import com.note_task.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/nurserecord")
public class NurseRecordController {

    @Resource
    private NurseRecordService nurseRecordService;

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @RequestMapping("query/{currPage}")
    public PageInfo<NurseRecord> query(@PathVariable Integer currPage,@RequestBody NurseRecord nurseRecord){
        return nurseRecordService.query(currPage,nurseRecord);
    }

    /**
     * 查询所有记录
     * @return
     */
    @RequestMapping("selAll")
    private List<NurseRecord> selAll(NurseRecord nurseRecord){
        return nurseRecordService.selAll(nurseRecord);
    }

    /**
     * 取所有的护理
     * @return
     */
    @RequestMapping("selNurseRecord")
    public  List<NurseRecord> selNurseRecord(){
        return nurseRecordService.selAll(new NurseRecord());
    }

    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @RequestMapping("selById/{id}")
    public NurseRecord selById(@PathVariable  Integer id){
        return nurseRecordService.selById(id);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        nurseRecordService.del(id);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     * 新增
     * @param nurseRecord
     * @return
     */
    @RequestMapping("add")
    public ResultVO add(@RequestBody NurseRecord nurseRecord){
        nurseRecordService.add(nurseRecord);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     *修改
     * @param nurseRecord
     * @return
     */
    @RequestMapping("update")
    public ResultVO update(@RequestBody NurseRecord nurseRecord ){
        nurseRecordService.update(nurseRecord);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

}
