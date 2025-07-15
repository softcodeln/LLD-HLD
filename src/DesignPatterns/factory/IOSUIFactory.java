package DesignPatterns.factory;

import DesignPatterns.factory.components.buttons.Button;
import DesignPatterns.factory.components.buttons.IOSButton;
import DesignPatterns.factory.components.menu.IOSMenu;
import DesignPatterns.factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu showMenu() {
        return new IOSMenu();
    }
}
