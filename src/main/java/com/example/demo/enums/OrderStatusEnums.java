package com.example.demo.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum OrderStatusEnums {
    NEW_ORDER(1,"新订单"),
    FINISH_ORDER(2,"完结订单"),
    ;

    private Integer code;
    private String message;
    OrderStatusEnums(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
