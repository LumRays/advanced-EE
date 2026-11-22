package com.jm.springlibrarydemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class PageResult<T> {

    private List<T> records;

    private Integer count;

    private PageRequest pageRequest;

}
