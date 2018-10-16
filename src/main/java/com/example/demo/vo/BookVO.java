package com.example.demo.vo;

import com.example.demo.pojo.Book;
import lombok.Data;

import java.util.List;

@Data
public class BookVO {
    private Integer bookTypeId;
    private String bookTypeName;

    private List<Book> foods;
}
