package com.example.demo.convert;

import com.example.demo.DTO.OrderDTO;
import com.example.demo.eception.BookException;
import com.example.demo.enums.ResultEnums;
import com.example.demo.form.OrderForm;
import com.example.demo.pojo.OrderDetail;
import com.example.demo.utils.CharacterUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class OrderCreateConvert {

    public static OrderDTO convert(OrderForm orderForm){
        OrderDTO orderDTO = new OrderDTO();
        Gson gson = new Gson();
        orderDTO.setOrderId(CharacterUtils.getRandomString(16));
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());

        //将字符串转换成json格式
        List<OrderDetail> orderDetailList = new ArrayList<>();
        try{
            orderDetailList = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>() {
            }.getType());
        }catch(Exception e){
            throw new BookException(ResultEnums.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
