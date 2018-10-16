package com.example.demo.enums;

import lombok.Getter;

import javax.jnlp.IntegrationService;

@Getter
public enum ResultEnums {
    REGISTER_SUCCESS(1,"注册成功"),
    REGISTER_FAILURE(2,"注册失败"),
    PARAM_ERROR(3,"参数有错"),
    SELECT_SUCCESS(4,"登录成功"),
    SELECT_FAILURE(5,"登录失败")

    ;


    private Integer code;
    private String message;

    ResultEnums(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
