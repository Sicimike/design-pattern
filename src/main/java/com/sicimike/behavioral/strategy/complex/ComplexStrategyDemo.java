package com.sicimike.behavioral.strategy.complex;

/**
 * @author sicimike
 * @create 2020-02-27 20:42
 */
public class ComplexStrategyDemo {

    public static void main(String[] args) {
        String key = TravelStrategyFactory.TravelKey.AIRPLANE;
        TravelStrategy travelStrategy = TravelStrategyFactory.getTravelStrategy(key);
        travelStrategy.travel();
    }
}
