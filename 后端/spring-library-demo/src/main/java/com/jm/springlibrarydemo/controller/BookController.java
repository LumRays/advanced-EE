package com.jm.springlibrarydemo.controller;

import com.jm.springlibrarydemo.entity.BookInfo;
import com.jm.springlibrarydemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/getList")
    public List<BookInfo> getList() {

        //BookService bookService = new BookService();
        List<BookInfo> bookInfos = bookService.getList();
        return bookInfos;

    }
}
