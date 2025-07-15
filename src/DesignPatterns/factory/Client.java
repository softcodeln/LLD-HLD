package DesignPatterns.factory;

import DesignPatterns.factory.components.buttons.Button;
import DesignPatterns.factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatform.IOS);

        Button button = uiFactory.createButton();
        button.click();
        button.changeSize();

        Menu menu = uiFactory.showMenu();
        menu.showMenu();

    }
}
