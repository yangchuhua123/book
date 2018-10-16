package com.example.demo.controller;

import com.example.demo.convert.RegisterFormConvertBuyer;
import com.example.demo.eception.BookException;
import com.example.demo.enums.ResultEnums;
import com.example.demo.form.RegisterForm;
import com.example.demo.pojo.Buyer;
import com.example.demo.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/buyer")
public class BuyerInfoController {
    @Autowired
    private BuyerService buyerService;

    @GetMapping("/insertBuyer")
    public Map<String,Object> insertBuyer(@Valid RegisterForm registerForm , BindingResult bindingResult){
        Map<String,Object> map = new HashMap<>();

        if (bindingResult.hasErrors()){
            throw  new BookException(ResultEnums.PARAM_ERROR);
        }
        Buyer buyer = RegisterFormConvertBuyer.convertRegisterForm(registerForm);
        int result = buyerService.insertBuyer(buyer);
        if(result >=0){
            map.put("message", ResultEnums.REGISTER_SUCCESS.getCode());
        }else{
            map.put("message",ResultEnums.REGISTER_FAILURE.getCode());
        }
        return map;
    }


}
