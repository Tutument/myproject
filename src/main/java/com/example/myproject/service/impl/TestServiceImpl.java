package com.example.myproject.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.myproject.api.CommonResult;
import com.example.myproject.api.ResultCode;
import com.example.myproject.config.MyProjectConfig;
import com.example.myproject.dao.SealInfoPicMapper;
import com.example.myproject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    SealInfoPicMapper sealInfoPicMapper;

    @Autowired
    MyProjectConfig myProjectConfig;

    @Override
    public CommonResult<JSONObject> getPic(JSONObject json) {

        JSONObject res = new JSONObject();
        String uid = json.getString("uid");
        if(StringUtils.isEmpty(uid)){
            return CommonResult.failed(ResultCode.PARAM_IS_NULL);
        }
        //sealInfoPicMapper.findPicBySealCode(sealCode);
        List<String> picCompress = sealInfoPicMapper.findPicCompress(uid);
        String pic = picCompress.get(0);
        res.put("pic",pic);
        res.put("name" ,myProjectConfig.getName());
        return CommonResult.success(res);
    }
}
