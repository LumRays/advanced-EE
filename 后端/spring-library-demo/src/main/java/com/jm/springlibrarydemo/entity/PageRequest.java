package com.jm.springlibrarydemo.entity;

import lombok.Data;

@Data
public class PageRequest {

    private int currentPage = 1;

    private int pageSize = 10;

    public int getOffset() {
        return (currentPage - 1) * pageSize;
    }

}
