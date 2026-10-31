package com.jm.springiocdemo.ioc;

public class Bottom {

    private Tire tire;

    public Bottom(Tire tire) {
        this.tire = tire;
        System.out.println("bottom 初始化完成!");
    }
}
