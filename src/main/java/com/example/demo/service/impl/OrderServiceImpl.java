package com.example.demo.service.impl;

import com.example.demo.DTO.OrderDTO;
import com.example.demo.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{


    /*
    * 创建订单
    * 先插入主表，随后插入详情表
    *
    * */
    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        return null;
    }
}
