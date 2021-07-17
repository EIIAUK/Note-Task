package com.demo.demo.controller;

import com.demo.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Controller: 当前类是一个控制器
 * @RequestMapping: URL访问地址
 * @ResponseBody: 返回的数据是JSON格式
 */

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("select")
    @ResponseBody
    public Student query(){
        Student student = new Student("张三",22,95.5);
        return student;
    }

    @RequestMapping("add")
    public String add(){
        System.out.println("add");
        return "";
    }
}
