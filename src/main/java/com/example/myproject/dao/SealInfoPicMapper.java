package com.example.myproject.dao;


import com.example.myproject.pojo.SealInfoPic;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SealInfoPicMapper{
    //查询印模图片通过uid
    List<String> findPicCompress(@Param("uid") String uid);
    //查询印模信息通过印模编号
    SealInfoPic findPicBySealCode(@Param("sealCode") String sealCode);

    @Select("select * from t_seal_info_pic where seal_code = #{sealCode}")
    SealInfoPic findPicBySealCode2(@Param("sealCode") String sealCode);

}
