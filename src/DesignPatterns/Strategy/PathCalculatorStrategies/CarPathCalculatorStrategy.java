package DesignPatterns.Strategy.PathCalculatorStrategies;

import DesignPatterns.Strategy.TravelMode;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void calculatorPath(String source, String dest, TravelMode mode) {
        System.out.println("Going from " + source + " To " + dest + " by " + mode);
    }
}