package com.example.blogs.controller;

import com.example.blogs.base.apiresult.ApiResult;
import com.example.blogs.service.UserService;
import com.example.blogs.util.QiniuUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    public ApiResult<String> getUser(){
//        User user=userService.getUser(1l);
        System.out.println("开始");
        return new ApiResult<>(0,"成功","my name is jack!");
    }
    @PostMapping("/fileUp")
    public String fileUp(@RequestParam(value="path",required=true) String path,
                         @RequestParam(value="name",required=true) String name){
        System.out.println("fileup");
        String str= QiniuUpload.UploadPic(path,name);
        return str;
    }
}
