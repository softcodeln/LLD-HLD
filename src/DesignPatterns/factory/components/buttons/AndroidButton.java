package DesignPatterns.factory.components.buttons;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("Android Button Clicked");
    }

    @Override
    public void changeSize() {
        System.out.println("Android Button Size Changed");
    }
}
