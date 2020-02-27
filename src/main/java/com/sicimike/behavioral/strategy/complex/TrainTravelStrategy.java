package com.sicimike.behavioral.strategy.complex;

/**
 * 火车出行
 * @author sicimike
 * @create 2020-02-27 20:21
 */
public class TrainTravelStrategy implements TravelStrategy {

    @Override
    public void travel() {
        System.out.println("火车出行...");
    }
}
