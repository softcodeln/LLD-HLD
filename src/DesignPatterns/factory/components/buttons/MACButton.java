package DesignPatterns.factory.components.buttons;

public class MACButton implements Button {

    @Override
    public void click() {
        System.out.println("MAC Button clicked");
    }

    @Override
    public void changeSize() {
        System.out.println("MAC Button size changed");
    }
}
