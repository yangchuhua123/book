package com.example.demo.pojo;

import com.example.demo.enums.OrderStatusEnums;
import com.example.demo.enums.PayEnums;
import lombok.Data;

import java.util.Date;

@Data
public class OrderInfo {
    private String  orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private Integer orderPayStatus = OrderStatusEnums.NEW_ORDER.getCode();
    private Integer orderStatus = PayEnums.NOT_PAY.getCode();
    private double orderAmount;
    private Integer orderQuantity;
    private Date orderCreateTime;
    private Date orderUpdateTime;
}
