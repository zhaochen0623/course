package com.course.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Author ASUS
 * @Date 2020-08-25 19:12
 * @Version 1.0
 **/
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
