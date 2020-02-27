package com.sicimike.structural.proxy.statics;

/**
 * @author sicimike
 * @create 2020-02-26 19:40
 */
public class StaticProxyDemo {

    public static void main(String[] args) {
        LandlordProxy landlordProxy = new LandlordProxy();
        landlordProxy.rentHouse();
    }
}
