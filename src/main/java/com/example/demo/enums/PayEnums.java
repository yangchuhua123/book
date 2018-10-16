package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum PayEnums {
    NOT_PAY(1,"未支付订单"),
    HAS_PAY(2,"已支付订单")
    ;
    private Integer code;
    private String message;
    PayEnums(Integer code,String message){
        this.code = code;
        this.message =message;
    }
}
