package DesignPatterns.Decorator;

public class Espresso extends Beverage {
    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public void getDescription() {
        System.out.println("Espresso Description");
    }
}
