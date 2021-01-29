package com.example.myproject.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.myproject.api.CommonResult;
import com.example.myproject.exception.PrintException;
import com.example.myproject.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    public static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    TestService testService;

    @PostMapping("/my/test")
    public CommonResult<JSONObject> getPic(@RequestBody String json){
        JSONObject parseObject = null;
        try {
            parseObject = JSONObject.parseObject(json);
        }catch (Exception e){
            logger.error("传入参数:[{}]",json);
            logger.error("错误信息:[{}]", PrintException.getMessage(e));
        }


        return testService.getPic(parseObject);
    }
}
