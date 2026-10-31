package com.jm.springiocdemo.tradition;

public class Car {

    private Framework framework;

    public Car(int size) {
        this.framework = new Framework(size);
        System.out.println("car 初始化完成!");
    }

    public void run() {
        System.out.println("car run!");
    }

}
