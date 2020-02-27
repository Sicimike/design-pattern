package com.sicimike.structural.strategy.simple;

/**
 * 飞机出行
 * @author sicimike
 * @create 2020-02-27 20:20
 */
public class AirplaneTravelStrategy implements TravelStrategy {

    @Override
    public void travel() {
        System.out.println("飞机出行...");
    }
}
