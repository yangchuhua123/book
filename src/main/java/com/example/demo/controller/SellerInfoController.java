package com.example.demo.controller;

import com.example.demo.convert.RegisterFormConvertBuyer;
import com.example.demo.convert.RegisterFormConvertSeller;
import com.example.demo.eception.BookException;
import com.example.demo.enums.ResultEnums;
import com.example.demo.form.RegisterForm;
import com.example.demo.pojo.Buyer;
import com.example.demo.pojo.Seller;
import com.example.demo.service.BuyerService;
import com.example.demo.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/seller")
public class SellerInfoController {
    @Autowired
    private SellerService sellerService;

    @GetMapping("/insertSeller")
    public Map<String,Object> insertBuyer(@Valid RegisterForm registerForm , BindingResult bindingResult){
        Map<String,Object> map = new HashMap<>();

        if (bindingResult.hasErrors()){
            throw  new BookException(ResultEnums.PARAM_ERROR);
        }
        Seller seller = RegisterFormConvertSeller.convertRegisterForm(registerForm);
        int result = sellerService.insertSeller(seller);
        if(result >=0){
            map.put("message", ResultEnums.REGISTER_SUCCESS.getCode());
        }else{
            map.put("message",ResultEnums.REGISTER_FAILURE.getCode());
        }
        return map;
    }
}
