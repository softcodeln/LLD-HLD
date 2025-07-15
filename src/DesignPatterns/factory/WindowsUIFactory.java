package DesignPatterns.factory;

import DesignPatterns.factory.components.buttons.Button;
import DesignPatterns.factory.components.buttons.WindowsButton;
import DesignPatterns.factory.components.menu.Menu;
import DesignPatterns.factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu showMenu() {
        return new WindowsMenu();
    }
}
