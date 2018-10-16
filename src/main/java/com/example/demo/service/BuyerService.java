package com.example.demo.service;

import com.example.demo.pojo.Buyer;

public interface BuyerService {
    int insertBuyer(Buyer buyer);
    Buyer selectByPhoneAndPassword(String buyerPhone,String buyerPassword);
}
