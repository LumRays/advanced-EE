package com.jm.springlibrarydemo.enums;

import lombok.Getter;

public enum BookStatus {
    DELETED(0,"无效"),
    NORMAL(1,"可借阅"),
    FORBIDDEN(2,"不可借阅"),
    ;

    private int code;

    @Getter
    private String name;

    BookStatus(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static BookStatus getStatusByCode(int code) {
        switch (code) {
            case 0: return BookStatus.DELETED;
            case 1: return BookStatus.NORMAL;
            case 2: return BookStatus.FORBIDDEN;
            default: return null;
        }
    }

}
