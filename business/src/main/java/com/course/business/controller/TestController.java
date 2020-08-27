package com.course.business.controller;

import com.course.common.entity.Test;
import com.course.common.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestController
 * @Author ASUS
 * @Date 2020-08-25 19:12
 * @Version 1.0
 **/
@RestController
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public List<Test> test(){
        return testService.list();
    }
}
