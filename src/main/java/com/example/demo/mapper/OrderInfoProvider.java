package com.example.demo.mapper;

import com.example.demo.pojo.OrderInfo;
import org.apache.ibatis.annotations.Param;

public class OrderInfoProvider {
    //插入主表
    public String insertOrderInfo(@Param("orderInfo") OrderInfo orderInfo){
        String sql = " insert into order_info" +
                " values(#{orderInfo.orderId}, #{orderInfo.buyerName}, #{orderInfo.buyerPhone}, #{orderInfo.buyerAddress}," +
                " #{orderInfo.orderPayStatus}, #{orderInfo.orderStatus}, #{orderInfo.orderAmount}, #{orderInfo.quantity},)";
        return sql;
    }
}
