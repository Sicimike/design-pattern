package com.sicimike.structural.proxy.dynamic.jdk;

/**
 * @author sicimike
 * @create 2020-02-26 20:10
 */
public class JdkDynamicProxyDemo {

    public static void main(String[] args) {
        // RentService必须是接口
        RentService proxy = (RentService) new LogHandlerProxy(new RentServiceImpl()).bind();
        proxy.signContract();
    }
}
