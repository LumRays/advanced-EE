package com.jm.springiocdemo.ioc;

public class Car {

    private Framework framework;

    public Car(Framework framework) {
        this.framework = framework;
        System.out.println("car 初始化完成!");
    }

    public void run() {
        System.out.println("car run!");
    }

}
