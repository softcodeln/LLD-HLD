package DesignPatterns.Strategy.PathCalculatorStrategies;

import DesignPatterns.Strategy.TravelMode;

public class PathCalculatorStrategyFactory {
    public static PathCalculatorStrategy getStrategy(TravelMode travelMode) {
        if (travelMode == TravelMode.BIKE) {
            return new BikePathCalculatorStrategy();
        } else if (travelMode == TravelMode.CAR) {
            return new CarPathCalculatorStrategy();
        } else if (travelMode == TravelMode.WALK) {
            return new WalkPathCalculatorStrategy();
        } else {
            throw new RuntimeException("Travel mode not supported");
        }
    }
}
