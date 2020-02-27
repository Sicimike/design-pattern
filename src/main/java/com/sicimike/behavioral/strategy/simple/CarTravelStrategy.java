package com.sicimike.behavioral.strategy.simple;

/**
 * 自驾出行
 * @author sicimike
 * @create 2020-02-27 20:23
 */
public class CarTravelStrategy implements TravelStrategy {

    @Override
    public void travel() {
        System.out.println("自驾出行...");
    }
}
