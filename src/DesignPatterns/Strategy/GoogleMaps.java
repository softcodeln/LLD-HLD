package DesignPatterns.Strategy;

import DesignPatterns.Strategy.PathCalculatorStrategies.*;

public class GoogleMaps {
    PathCalculatorStrategy pc;

    void findPath(String source, String dest, TravelMode mode) {
        //Other logics can be here..
        pc = PathCalculatorStrategyFactory.getStrategy(mode);
        pc.calculatorPath(source, dest, mode);
    }
}
