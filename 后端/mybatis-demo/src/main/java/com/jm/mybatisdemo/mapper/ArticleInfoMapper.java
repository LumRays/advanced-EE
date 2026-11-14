package com.jm.mybatisdemo.mapper;

import com.jm.mybatisdemo.entity.ArticleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ArticleInfoMapper {

    @Select("select ta.*, tb.username, tb.password from article_info ta" +
            " LEFT JOIN user_info tb on ta.uid = tb.id" +
            " WHERE ta.id = #{id}")
    ArticleInfo selectById(Integer id);

}
