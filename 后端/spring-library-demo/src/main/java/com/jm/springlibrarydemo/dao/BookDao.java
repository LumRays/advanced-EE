package com.jm.springlibrarydemo.dao;

import com.jm.springlibrarydemo.entity.BookInfo;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class BookDao {

    public List<BookInfo> mockData() {

        List<BookInfo> bookInfos = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            BookInfo book = new BookInfo();
            book.setId(i);
            book.setBookName("熊出没 " + i);
            book.setAuthor("丁亮");
            book.setCount(new Random().nextInt(100));
            book.setPrice(new BigDecimal(new Random().nextInt(100)));
            book.setPublish("华强方特动漫有限公司 " + i);
            book.setStatus(i % 5 == 0 ? 2 : 1);
            bookInfos.add(book);
        }
        return bookInfos;
    }

}
