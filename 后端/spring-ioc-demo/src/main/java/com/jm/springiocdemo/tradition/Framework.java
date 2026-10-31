package com.jm.springiocdemo.tradition;

public class Framework {

    private Bottom bottom;

    public Framework(int size) {
        this.bottom = new Bottom(size);
        System.out.println("framework 初始化完成!");
    }

}
