package com.example.demo.service.impl;

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
public class BookServiceImplTest {
    @Autowired
    private BookServiceImpl bookService;

    @Test
    public void findBookUp(){
        List<Book> list = bookService.findBookUp();
        Assert.assertEquals(2,list.size());
    }

    @Test
    public void findBookLikeXTest(){
        String X = "大学";
        List<Book> list = bookService.findBookByLikeX(X);
        Assert.assertEquals(2,list.size());
    }
}