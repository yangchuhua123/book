package com.example.demo.mapper;

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
public class BuyerMapperTest {
    @Autowired
    private BuyerMapper buyerMapper;

    @Test
    public void buyerMapperTest(){
        Buyer buyer = new Buyer();
        System.out.println("buyer"+ buyerMapper.selectBuyerById(1));
    }

    @Test
    public void insertBuyer(){
        Buyer buyer = new Buyer();
        buyer.setBuyerPhone("15107686227");
        buyer.setBuyerPassword("123456");
        buyer.setBuyerName("杨楚华");
        buyer.setBuyerIdentity("买家");
        int result = buyerMapper.insterBuyer(buyer);
        System.out.println(result);
    }

    @Test
    public void selectByNameAndPassword(){
        Buyer buyer = buyerMapper.selectByPhoneAndPassword("15363360655","123456");
        System.out.println("aa  "+buyer );
        Assert.assertEquals("123456",buyer.getBuyerPassword());
    }


}