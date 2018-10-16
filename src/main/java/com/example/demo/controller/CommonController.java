package com.example.demo.controller;

import com.example.demo.enums.ResultEnums;
import com.example.demo.pojo.Buyer;
import com.example.demo.pojo.Seller;
import com.example.demo.service.BuyerService;
import com.example.demo.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/common")
public class CommonController {
    @Autowired
    private BuyerService buyerService;

    @Autowired
    private SellerService sellerService;
    @GetMapping("/selectByPhoneAndPassword")
    public Map<String,Object> selectByPhoneAndPassword(String identity,String phone, String password){
        Map<String,Object> map = new HashMap<>();
        if (identity.equals("buyer")){
            Buyer buyer = buyerService.selectByPhoneAndPassword(phone,password);
            if(buyer == null){
                map.put("message", ResultEnums.SELECT_FAILURE.getMessage());

            }else{
                map.put("message",ResultEnums.SELECT_SUCCESS.getMessage());
                map.put("people",buyer);
            }
        }else if(identity.equals("seller")){
            Seller seller = sellerService.selectByPhoneAndPassword(phone,password);
            if(seller == null){
                map.put("message", ResultEnums.SELECT_FAILURE.getMessage());

            }else{
                map.put("message",ResultEnums.SELECT_SUCCESS.getMessage());
                map.put("people",seller);
            }
        }

        return map;
    }
}
