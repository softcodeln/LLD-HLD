package DesignPatterns.factory;

import DesignPatterns.factory.components.buttons.Button;
import DesignPatterns.factory.components.menu.Menu;

public interface UIFactory {
    // Factory methods.

    Button createButton();
    Menu showMenu();

    // we can create other factory methods here below like createDropdownMenu,etc.
}
