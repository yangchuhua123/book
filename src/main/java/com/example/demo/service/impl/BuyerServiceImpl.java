package com.example.demo.service.impl;

import com.example.demo.mapper.BuyerMapper;
import com.example.demo.pojo.Buyer;
import com.example.demo.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private BuyerMapper buyerMapper;


    @Override
    public int insertBuyer(Buyer buyer) {
        return buyerMapper.insterBuyer(buyer);
    }

    @Override
    public Buyer selectByPhoneAndPassword(String buyerPhone, String buyerPassword) {
        return buyerMapper.selectByPhoneAndPassword(buyerPhone,buyerPassword);
    }

}
