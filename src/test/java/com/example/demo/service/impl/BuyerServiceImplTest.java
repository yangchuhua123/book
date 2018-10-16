package com.example.demo.service.impl;

import com.example.demo.pojo.Buyer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuyerServiceImplTest {
    @Autowired
    private BuyerServiceImpl buyerService;

    @Test
    public void insertBuyer(){
        Buyer buyer = new Buyer();
        buyer.setBuyerPhone("15107686227");
        buyer.setBuyerPassword("123456");
        buyer.setBuyerName("杨楚华");
        buyer.setBuyerIdentity("买家");
        int result = buyerService.insertBuyer(buyer);
        Assert.assertEquals(1,result);
    }

    @Test
    public void selectByPhoneAndPassword(){
        Buyer buyer = buyerService.selectByPhoneAndPassword("15363360655","123456");
        Assert.assertEquals("123456",buyer.getBuyerPassword());
    }

}