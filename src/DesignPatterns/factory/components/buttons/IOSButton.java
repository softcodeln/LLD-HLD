package DesignPatterns.factory.components.buttons;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("IOS button clicked");
    }

    @Override
    public void changeSize() {
        System.out.println("IOS button size changed");
    }
}
