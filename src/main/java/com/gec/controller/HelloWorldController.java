package com.gec.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author dbc
 * @create 2023-01-08 15:18
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello World !";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World!"+name;
    }

    //测试从配置文件中获取属性值
    @Value("${test.hello:test}")
    private String testHello;

    @GetMapping("/testHello")
    public String testHello(){
        return "Hello World!"+testHello;
    }
}
