package com.example.demo.pojo;

import lombok.Data;

@Data
public class Book {
    private Integer bookId;
    private String sellerId;
    private String bookTypeName;
    private String bookTitle;
    private String bookIcon;
    private String bookDescription;
    private double bookPrice;
    private String bookSum;
    private Integer bookStatus;
    private Integer Count = 0;
}
