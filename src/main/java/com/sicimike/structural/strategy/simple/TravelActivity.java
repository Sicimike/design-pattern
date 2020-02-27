package com.sicimike.structural.strategy.simple;

/**
 * @author sicimike
 * @create 2020-02-27 20:26
 */
public class TravelActivity {

    private TravelStrategy travelStrategy;

    public TravelActivity(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travel() {
        travelStrategy.travel();
    }
}
