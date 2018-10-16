package com.example.demo.mapper;

import com.example.demo.pojo.Buyer;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

public class BuyerProvider {
    public String selectBuyerById(Integer buyerId){
        String sql = "select * from buyer where buyer_id = #{buyerId}";
        return sql;
    }
    public String insertBuyer(@Param("buyer") Buyer buyer){
        String sql = "insert into buyer(buyer_phone,buyer_password,buyer_name,buyer_identity,buyer_wechat) " +
                "values(#{buyer.buyerPhone},#{buyer.buyerPassword},#{buyer.buyerName},#{buyer.buyerIdentity},#{buyer.wechat})";
        return sql;
    }

    public String selectByPhoneAndPassword(@Param("buyerPhone")String buyerPhone,@Param("buyerPassword")String buyerPassword){
        String sql = "select * from buyer where buyer_phone = #{buyerPhone} and buyer_password = #{buyerPassword}";
        return sql;
    }
}
