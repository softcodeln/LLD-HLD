package DesignPatterns.factory.components.menu;

public class IOSMenu implements Menu{
    @Override
    public void showMenu() {
        System.out.println("iOS Menu Displayed");
    }
}
