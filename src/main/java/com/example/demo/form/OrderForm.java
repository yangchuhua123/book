package com.example.demo.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class OrderForm {
    @NotNull(message = "名字不能为空")
    private String name;

    @NotNull(message = "电话不能为空")
    private String phone;

    @NotNull(message = "地址不能为空")
    private String address;

    @NotNull(message = "列表不能为空")
    private String items;
}
