package com.example.demo.mapper;

import com.example.demo.pojo.Buyer;
import com.example.demo.pojo.Seller;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

public interface SellerMapper {
    //根据sellerId查找seller
    @SelectProvider(type = SellerProvider.class,method = "selectSellerById")
    Seller selectSellerById(Integer SellerId);

    //插入一个seller
    @InsertProvider(type = SellerProvider.class,method = "insertSeller")
    int insterSeller(@Param("seller") Seller seller);

    //验证一个seller
    @SelectProvider(type = SellerProvider.class,method = "selectByPhoneAndPassword")
    Seller selectByPhoneAndPassword(@Param("sellerPhone")String sellerPhone,@Param("sellerPassword")String sellerPassword);
}
