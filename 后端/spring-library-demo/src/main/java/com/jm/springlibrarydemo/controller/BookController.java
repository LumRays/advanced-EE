package com.jm.springlibrarydemo.controller;

import com.jm.springlibrarydemo.entity.BookInfo;
import com.jm.springlibrarydemo.entity.PageRequest;
import com.jm.springlibrarydemo.entity.PageResult;
import com.jm.springlibrarydemo.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getList")
    public List<BookInfo> getList() {

        List<BookInfo> bookInfos = bookService.getList();
        return bookInfos;

    }

    @PostMapping("/addBook")
    public String addBook(BookInfo bookInfo) {

        // 参数校验
        if (!StringUtils.hasLength(bookInfo.getBookName())
        || !StringUtils.hasLength(bookInfo.getAuthor())
        || !StringUtils.hasLength(bookInfo.getPublish())
        || bookInfo.getCount() == null
        || bookInfo.getPrice() == null
        || bookInfo.getStatus() == null) {
            return "参数不合法,请进行校验!";
        }
        // 添加图书
        Integer result = bookService.addBook(bookInfo);
        return result == 1 ? "" : "添加图书失败!";

    }

    @GetMapping("/getListByPage")
    public PageResult getListByPage(PageRequest pageRequest) {

        log.info("获取翻页信息 pageRequest: {}", pageRequest);
        // 参数校验
        if (pageRequest.getCurrentPage() < 0 || pageRequest.getPageSize() < 0) {
            throw new IllegalArgumentException("当前页和每页大小都不能小于 0!");
        }
        PageResult result = bookService.getListByPage(pageRequest);
        return result;

    }

}
