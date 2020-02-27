package com.sicimike.structural.proxy.dynamic.cglib;

/**
 * 被代理的类和方法均不能被final修饰
 * @author sicimike
 * @create 2020-02-26 21:13
 */
public class RentServiceImpl {

    public void signContract() {
        System.out.println("签署合同....");
    }
}
