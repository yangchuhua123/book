package com.example.demo.mapper;

public class BookProvider {
    //查找上架物品
    public String findBookUp(){
        String sql = "select * from book where book_status = 1";

        return sql;

    }

    //模糊查找
    public String findBookByLikeX(String x){
        String sql = "select * from book where book_title like concat(concat('%',#{x}),'%')";
        return sql;
    }
}
