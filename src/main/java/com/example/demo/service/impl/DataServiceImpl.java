package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.entity.Sheet1;
import com.example.demo.mapper.Sheet1Mapper;
import com.example.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private Sheet1Mapper sm;
    @Override
    public List<Sheet1> getData(String name) {
        LambdaQueryWrapper<Sheet1> lqw = new LambdaQueryWrapper<>();
        lqw.eq(Sheet1::getTargetName, name);
        return sm.selectList(lqw);
    }
}
