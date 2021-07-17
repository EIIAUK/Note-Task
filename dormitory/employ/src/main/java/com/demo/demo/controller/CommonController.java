package com.demo.demo.controller;

import com.demo.demo.vo.ResultVO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("common")
public class CommonController {

    @Value("C:/Users/apple/Desktop/food")
    private String filePath;

    @RequestMapping("upload")
    public ResultVO upload(MultipartFile file){
        //取上传的文件名
        String name = file.getOriginalFilename();
        //取上传的文件的扩展名
        String ext = name.substring(name.lastIndexOf("."));
        //构造目标文件名
        String desc = UUID.randomUUID() + ext;
        try {
            //创建需要复制的目标文件路径
            FileOutputStream fs = new FileOutputStream(filePath+desc);
            //复制文件
            FileCopyUtils.copy(file.getInputStream(),fs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ResultVO resultVO = new ResultVO(200,desc);
        return resultVO;
    }
}
