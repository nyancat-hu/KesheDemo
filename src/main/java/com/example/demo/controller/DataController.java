package com.example.demo.controller;

import com.example.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/data")
public class DataController {
    @Autowired
    DataService ds;

    @RequestMapping("/get")
    public String get(String name) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        // 将List转换为JSON字符串
        String jsonStr = objectMapper.writeValueAsString(ds.getData(name));
        return jsonStr;
    }
}
