package com.sicimike.structural.strategy.simple;

/**
 * @author sicimike
 * @create 2020-02-27 20:24
 */
public class SimpleStrategyDemo {

    public static void main(String[] args) {

        TravelActivity travelActivity = new TravelActivity(new AirplaneTravelStrategy());
        travelActivity.travel();

        travelActivity = new TravelActivity(new TrainTravelStrategy());
        travelActivity.travel();
    }
}
