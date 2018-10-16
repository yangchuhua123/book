package com.example.demo.service;

import com.example.demo.DTO.OrderDTO;

public interface OrderService {
    /*创建订单*/
    OrderDTO create(OrderDTO orderDTO);
}
