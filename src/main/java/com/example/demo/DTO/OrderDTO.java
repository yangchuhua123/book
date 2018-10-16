package com.example.demo.DTO;

import com.example.demo.pojo.OrderDetail;
import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private Integer orderPayStatus;
    private Integer orderStatus;
    private double orderAmount;
    private Integer orderQuantity;

    private List<OrderDetail> orderDetailList;
}
