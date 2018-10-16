package com.example.demo.eception;

import com.example.demo.enums.ResultEnums;

public class BookException extends RuntimeException {
    private Integer code;

    public BookException(ResultEnums resultEnums){
        super(resultEnums.getMessage());
        this.code = code;
;    }
}
