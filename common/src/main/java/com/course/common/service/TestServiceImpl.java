package com.course.common.service;

import com.course.common.entity.Test;
import com.course.common.entity.TestExample;
import com.course.common.mapper.TestMapper;
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
        TestExample testExample=new TestExample();
        testExample.createCriteria().andIdEqualTo("1");
        testExample.setOrderByClause("id desc");
        return testMapper.selectByExample(testExample);
    }
}
