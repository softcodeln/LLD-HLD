package DesignPatterns.Decorator;

public class Hazelnut extends Beverage {
    @Override
    public int getCost() {
        return 2;
    }
    @Override
    public void getDescription() {
        System.out.println("Hazelnut Description");
    }
}
