package com.sicimike.behavioral.strategy.complex;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 策略工厂
 *
 * @author sicimike
 * @create 2020-02-27 20:33
 */
public class TravelStrategyFactory {

    private static final ConcurrentMap<String, TravelStrategy> TRAVEL_STRATEGY_MAP = new ConcurrentHashMap<>(8);

    static {
        TRAVEL_STRATEGY_MAP.put(TravelKey.AIRPLANE, new AirplaneTravelStrategy());
        TRAVEL_STRATEGY_MAP.put(TravelKey.TRAIN, new TrainTravelStrategy());
        TRAVEL_STRATEGY_MAP.put(TravelKey.CAR, new CarTravelStrategy());
    }

    private TravelStrategyFactory() {}

    public interface TravelKey {
        String AIRPLANE = "Airplane";
        String TRAIN = "Train";
        String CAR = "Car";
    }

    public static TravelStrategy getTravelStrategy(String travelKey) {
        if (travelKey == null || Objects.equals(travelKey, "")) {
            throw new IllegalArgumentException("非法参数");
        }
        return TRAVEL_STRATEGY_MAP.get(travelKey);
    }
}
