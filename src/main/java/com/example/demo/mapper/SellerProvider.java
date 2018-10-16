package com.example.demo.mapper;

import com.example.demo.pojo.Buyer;
import com.example.demo.pojo.Seller;
import org.apache.ibatis.annotations.Param;

public class SellerProvider {
    public String selectSellerById(Integer sellerId){
        String sql = "select * from seller where seller_id = #{sellerId}";
        return sql;
    }
    public String insertSeller(@Param("seller") Seller seller){
        String sql = "insert into seller(seller_phone,seller_password,seller_name,seller_identity,seller_wechat) " +
                "values(#{seller.sellerPhone},#{seller.sellerPassword},#{seller.sellerName},#{seller.sellerIdentity},#{seller.wechat})";
        return sql;
    }

    public String selectByPhoneAndPassword(@Param("sellerPhone")String sellerPhone,@Param("sellerPassword")String sellerPassword){
        String sql = "select * from seller where seller_phone = #{sellerPhone} and seller_password = #{sellerPassword}";
        return sql;
    }
}
