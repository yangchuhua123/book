package com.example.demo.mapper;

import com.example.demo.pojo.OrderInfo;
import com.example.demo.utils.CharacterUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderInfoMapperTest {
    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Test
    public void inserOrderInfo(){
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(CharacterUtils.getRandomString(16));
        orderInfo.setBuyerName("杨楚哗");
        orderInfo.setBuyerPhone("15363360655");
        orderInfo.setBuyerAddress("广州加速器");
        orderInfo.setOrderAmount(5.2);
        orderInfo.setOrderQuantity(2);

        int result = orderInfoMapper.insertOrderInfo(orderInfo);
        Assert.assertEquals(1,result);

    }
}