package com.jm.springlibrarydemo.service;

import com.jm.springlibrarydemo.dao.BookDao;
import com.jm.springlibrarydemo.entity.BookInfo;
import com.jm.springlibrarydemo.entity.PageRequest;
import com.jm.springlibrarydemo.entity.PageResult;
import com.jm.springlibrarydemo.enums.BookStatus;
import com.jm.springlibrarydemo.mapper.BookMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private BookMapper bookMapper;

    public List<BookInfo> getList() {

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

    public Integer addBook(BookInfo bookInfo) {
        Integer result = null;
        try {
            result = bookMapper.insertBook(bookInfo);
        } catch (Exception e) {
            log.error("添加图书异常, e: ", e);
        }
        return result == null ? 0 : result;
    }

    public PageResult getListByPage(PageRequest pageRequest) {

        int count = bookMapper.count();
        List<BookInfo> bookInfos = bookMapper.getListByLimit(pageRequest);
        // 处理图书状态
        for (BookInfo bookInfo : bookInfos) {
            bookInfo.setStatusCN(BookStatus.getStatusByCode(bookInfo.getStatus()).getName());
        }
        PageResult result = new PageResult(bookInfos, count, pageRequest);
        return result;

    }

    public BookInfo queryBookById(Integer bookId) {

        return bookMapper.queryBookById(bookId);

    }

    public Integer updateBook(BookInfo bookInfo) {

        Integer result = null;
        try {
            result = bookMapper.updateBookById(bookInfo);
        } catch (Exception e) {
            log.error("图书更新异常, e: ", e);
        }
        return result == null ? 0 : result;

    }

    public Integer batchDeleteBook(List<Integer> ids) {

        return bookMapper.batchDeleteBook(ids);

    }

}
