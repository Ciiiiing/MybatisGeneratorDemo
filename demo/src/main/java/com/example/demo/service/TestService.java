package com.example.demo.service;

import com.example.demo.dao.TestMapper;
import com.example.demo.model.Test;
import com.example.demo.model.TestExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    TestMapper testMapper;

    public List<Test> getTest(String name){
        TestExample testExample = new TestExample();
        TestExample.Criteria criteria = testExample.createCriteria();
        criteria.andNameEqualTo(name);
        List<Test> test = testMapper.selectByExample(testExample);
        return test;
    }

}
