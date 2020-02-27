package com.sicimike.structural.proxy.dynamic.jdk;

/**
 * @author sicimike
 * @create 2020-02-26 20:09
 */
public class RentServiceImpl implements RentService {
    @Override
    public void signContract() {
        System.out.println("签署合同....");
    }
}
