package com.example.myproject.service;

import com.alibaba.fastjson.JSONObject;
import com.example.myproject.api.CommonResult;

public interface TestService {

    CommonResult<JSONObject> getPic(JSONObject json);

}
