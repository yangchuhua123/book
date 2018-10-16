package com.example.demo.mapper;

import com.example.demo.pojo.Category;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface CategoryMapper {
    //根据图书类别id，查找不同的图书list
    @SelectProvider(type = CategoryProvider.class,method = "findCategoryList")
    List<Category>  findCategoryList();
}
