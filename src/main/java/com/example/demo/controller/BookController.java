package com.example.demo.controller;

import com.example.demo.pojo.Book;
import com.example.demo.pojo.Category;
import com.example.demo.service.BookService;
import com.example.demo.service.CategoryService;
import com.example.demo.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/bookList")
    public Map<String,Object> bookList(){
        Map<String,Object> map = new HashMap<>();
        //查找所有上架的图书
        List<Book> bookList = bookService.findBookUp();
        //查找所有商品的类目
        List<Category> categoryList = categoryService.categoryList();
        //遍历所有的类目，将booklist中的相同的类目，放进一个BookVOList中
        List<BookVO> bookVOList = new ArrayList<>();
        for (Category category:categoryList){
            BookVO bookVO = new BookVO();
            bookVO.setBookTypeId(category.getBookTypeId());
            bookVO.setBookTypeName(category.getBookTypeName());
            //获取该类目的书籍，放进bookList中
            List<Book> books = new ArrayList<>();
            for (Book book:bookList){
                if(book.getBookTypeName().equals(category.getBookTypeName())){
                    books.add(book);
                }
            }
            bookVO.setFoods(books);
            bookVOList.add(bookVO);
        }
        map.put("goods",bookVOList);
        return map;
    }

    //模糊查找，返回BookVO
    @GetMapping("/bookLike")
    public Map<String,Object> getListByLike(@RequestParam("x") String x){
        Map<String,Object> map = new HashMap<>();
        //查到的结果
        if(x == null ||("").equals(x)){
            map.put("books","");
            return map;
        }
        List<Book> bookList = bookService.findBookByLikeX(x);
        map.put("books",bookList);
        return map;
    }


}
