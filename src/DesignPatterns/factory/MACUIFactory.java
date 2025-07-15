package DesignPatterns.factory;

import DesignPatterns.factory.components.buttons.Button;
import DesignPatterns.factory.components.buttons.MACButton;
import DesignPatterns.factory.components.menu.MACMenu;
import DesignPatterns.factory.components.menu.Menu;

public class MACUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new MACButton();
    }

    @Override
    public Menu showMenu() {
        return new MACMenu();
    }
}
