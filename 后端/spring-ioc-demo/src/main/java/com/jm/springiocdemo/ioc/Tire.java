package com.jm.springiocdemo.ioc;

public class Tire {

    private int size;

    public Tire(int size) {
        this.size = size;
        System.out.println("tire 初始化完成!");
    }

}
