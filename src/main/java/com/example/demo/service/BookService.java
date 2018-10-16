package com.example.demo.service;

import com.example.demo.pojo.Book;

import java.util.List;

public interface BookService {
    //查找上架书籍
    List<Book> findBookUp();

    //模糊查询
    List<Book> findBookByLikeX(String X);
 }
