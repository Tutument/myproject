package com.example.myproject.api;


import org.apache.ibatis.annotations.Param;

public enum ResultCode implements IErrorCode {
    SUCCESS(00, "成功"),
    FAILED(500, "服务器失败"),
    PARAM_IS_NULL(10101,"必要参数为空");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
