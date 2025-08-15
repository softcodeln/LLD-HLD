package DesignPatterns.Strategy.PathCalculatorStrategies;

import DesignPatterns.Strategy.TravelMode;

public interface PathCalculatorStrategy {
    void calculatorPath(String source, String dest, TravelMode mode);
}
