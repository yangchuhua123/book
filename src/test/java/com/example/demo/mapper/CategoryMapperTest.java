package com.example.demo.mapper;

import com.example.demo.pojo.Category;
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
public class CategoryMapperTest {
    @Autowired CategoryMapper categoryMapper;

    @Test
    public void findCategoryListTest(){
        List<Category> list = categoryMapper.findCategoryList();
        Assert.assertEquals(10,list.size());
    }
}