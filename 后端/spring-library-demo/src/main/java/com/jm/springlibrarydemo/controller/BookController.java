package com.jm.springlibrarydemo.controller;

import com.jm.springlibrarydemo.entity.BookInfo;
import com.jm.springlibrarydemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Controller
@ResponseBody
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
