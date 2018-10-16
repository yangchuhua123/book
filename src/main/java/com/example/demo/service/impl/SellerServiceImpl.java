package com.example.demo.service.impl;

import com.example.demo.mapper.BuyerMapper;
import com.example.demo.mapper.SellerMapper;
import com.example.demo.pojo.Buyer;
import com.example.demo.pojo.Seller;
import com.example.demo.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService{
    @Autowired
    private SellerMapper sellerMapper;


    @Override
    public int insertSeller(Seller seller) {
        return sellerMapper.insterSeller(seller);
    }

    @Override
    public Seller selectByPhoneAndPassword(String sellerPhone, String sellerPassword) {
        return sellerMapper.selectByPhoneAndPassword(sellerPhone,sellerPassword);
    }
}
