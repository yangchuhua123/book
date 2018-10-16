package com.example.demo.service;

import com.example.demo.pojo.Buyer;
import com.example.demo.pojo.Seller;

public interface SellerService {
    int insertSeller(Seller seller);
    Seller selectByPhoneAndPassword(String sellerPhone,String sellerPassword);
}
