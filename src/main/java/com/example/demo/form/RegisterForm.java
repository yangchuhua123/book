package com.example.demo.form;

import lombok.Data;


import javax.validation.constraints.NotNull;


@Data
public class RegisterForm {
    @NotNull(message = "注册电话不能为空")
    private String  phone;

    @NotNull(message = "注册密码不能为空")
    private String  password;
    private String  name;

    @NotNull(message = "注册身份不能为空")
    private String  identity;
    private String wechat;
}
