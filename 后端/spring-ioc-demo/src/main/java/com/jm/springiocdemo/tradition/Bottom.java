package com.jm.springiocdemo.tradition;

public class Bottom {

    private Tire tire;

    public Bottom(int size) {
        this.tire = new Tire(size);
        System.out.println("bottom 初始化完成!");
    }
}
