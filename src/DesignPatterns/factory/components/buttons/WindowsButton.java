package DesignPatterns.factory.components.buttons;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows Button Clicked");
    }

    @Override
    public void changeSize() {
        System.out.println("Windows Button Size Changed");
    }
}
