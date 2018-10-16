package com.example.demo.mapper;

import com.example.demo.pojo.Buyer;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

public interface BuyerMapper {
    //根据buyerId查找buyer
    @SelectProvider(type = BuyerProvider.class,method = "selectBuyerById")
    Buyer selectBuyerById(Integer buyerId);

    //插入一个buyer
    @InsertProvider(type = BuyerProvider.class,method = "insertBuyer")
   int insterBuyer(@Param("buyer") Buyer buyer);

    //验证一个buyer
    @SelectProvider(type = BuyerProvider.class,method = "selectByPhoneAndPassword")
    Buyer selectByPhoneAndPassword(@Param("buyerPhone")String buyerPhone,@Param("buyerPassword")String buyerPassword);
}
