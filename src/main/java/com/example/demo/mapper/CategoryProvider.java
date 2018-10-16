package com.example.demo.mapper;

public class CategoryProvider {
    public String findCategoryList(){
        String sql = "select * from category";
        return sql;
    }
}
