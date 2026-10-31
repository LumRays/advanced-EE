package com.jm.springlibrarydemo.service;

import com.jm.springlibrarydemo.dao.BookDao;
import com.jm.springlibrarydemo.entity.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService {

    @Autowired
    private BookDao bookDao;

    public List<BookInfo> getList() {

        //BookDao bookDao = new BookDao();
        List<BookInfo> bookInfos = bookDao.mockData();
        // 处理图书状态
        for (BookInfo bookInfo : bookInfos) {
            if (bookInfo.getStatus() == 1) {
                bookInfo.setStatusCN("可借阅!");
            } else {
                bookInfo.setStatusCN("不可借阅!");
            }
        }
        return bookInfos;
    }
}
