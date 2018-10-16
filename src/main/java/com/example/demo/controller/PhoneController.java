package com.example.demo.controller;

import com.example.demo.base.GetSMS;
import com.example.demo.base.RandomNum;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
class SendMessage {

    @RequestMapping(value = "/hello")
    public String index(){
        return "hello!";
    }
    @GetMapping(value = "/sms")
    public Map<String,Object> sendSMS(@RequestParam("phone") String phone){
        Map<String,Object> map = new HashMap<>();
        map.put("success",GetSMS.getmMssage(phone)) ;
        return map;
    }

    @GetMapping(value = "/validate")
    public Map<String,Object> validateCode(@RequestParam("phone") String phone,@RequestParam("code") String code){
        Map<String,Object> map = new HashMap<>();
        if(code.equals(RandomNum.num)){
            map.put("success",1);
        }else{
            map.put("failure",0);
        }
        return map;
    }
}
