package com.example.demo.mapper;

import com.example.demo.pojo.Book;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface BookMapper {
    //查找上架物品
    @SelectProvider(type = BookProvider.class,method = "findBookUp")
    List<Book> findBookUp();

    //模糊查找
    @SelectProvider(type = BookProvider.class,method = "findBookByLikeX")
    List<Book> findBookLikeX(String x);

}
