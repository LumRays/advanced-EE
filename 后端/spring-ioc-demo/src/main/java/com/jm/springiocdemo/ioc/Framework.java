package com.jm.springiocdemo.ioc;

public class Framework {

    private Bottom bottom;

    public Framework(Bottom bottom) {
        this.bottom = bottom;
        System.out.println("framework 初始化完成!");
    }
}
