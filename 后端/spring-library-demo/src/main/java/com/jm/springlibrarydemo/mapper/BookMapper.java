package com.jm.springlibrarydemo.mapper;

import com.jm.springlibrarydemo.entity.BookInfo;
import com.jm.springlibrarydemo.entity.PageRequest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    @Insert("""
    insert into book_info (book_name, author, count, price, publish, status) 
    values (#{bookName}, #{author}, #{count}, #{price}, #{publish}, #{status})
    """)
    Integer insertBook(BookInfo bookInfo);

    @Select("select * from book_info where status != 0 limit #{offset}, #{pageSize}")
    List<BookInfo> getListByLimit(PageRequest pageRequest);

    @Select("select count(1) from book_info where status != 0")
    Integer count();

    @Select("select * from book_info where id = #{id}")
    BookInfo queryBookById(Integer id);

    Integer updateBookById(BookInfo bookInfo);

    Integer batchDeleteBook(List<Integer> ids);

}
