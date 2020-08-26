package com.course.system.service;

import com.course.system.domain.Test;
import com.course.system.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestServiceImpl
 * @Author ASUS
 * @Date 2020-08-26 14:07
 * @Version 1.0
 **/
@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper testMapper;
    @Override
    public List<Test> list() {
        return testMapper.list();
    }
}
