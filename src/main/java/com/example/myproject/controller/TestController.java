package com.example.myproject.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.myproject.api.CommonResult;
import com.example.myproject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @PostMapping("/my/test")
    public CommonResult<JSONObject> getPic(@RequestBody JSONObject json){

        return testService.getPic(json);
    }
}
