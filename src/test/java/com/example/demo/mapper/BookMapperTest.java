package com.example.demo.mapper;

import com.example.demo.pojo.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookMapperTest {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void findBookUp(){
        List<Book> list = bookMapper.findBookUp();
        Assert.assertEquals(2,list.size());
    }

    @Test
    public void findBookLikeX(){
        List<Book> list = bookMapper.findBookLikeX("大学");
        System.out.println(list.toString());
        Assert.assertEquals(2,list.size());
    }

}