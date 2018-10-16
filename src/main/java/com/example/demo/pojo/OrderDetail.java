package com.example.demo.pojo;

import lombok.Data;

@Data
public class OrderDetail {
    private Integer orderDetailId;
    private Integer orderId;
    private String bookTitle;
    private String bookIcon;
    private String bookDescription;
    private double bookPrice;
}
