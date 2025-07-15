package DesignPatterns.factory;

import DesignPatterns.factory.components.buttons.AndroidButton;
import DesignPatterns.factory.components.buttons.Button;
import DesignPatterns.factory.components.menu.AndroidMenu;
import DesignPatterns.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu showMenu() {
        return new AndroidMenu();
    }
}
