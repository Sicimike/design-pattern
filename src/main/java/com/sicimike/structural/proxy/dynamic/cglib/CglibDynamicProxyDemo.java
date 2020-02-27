package com.sicimike.structural.proxy.dynamic.cglib;

/**
 * @author sicimike
 * @create 2020-02-26 21:19
 */
public class CglibDynamicProxyDemo {

    public static void main(String[] args) {
        RentServiceImpl proxy = (RentServiceImpl) new LogHandlerProxy(new RentServiceImpl()).bind();
        proxy.signContract();
    }
}
