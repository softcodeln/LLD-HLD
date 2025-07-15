package DesignPatterns.factory;

public class Flutter {
    // Non Factory Method

    void refreshUI() {
        System.out.println("Refreshing UI");
    }

    void setTheme() {
        System.out.println("Setting Theme");
    }

    // Factory method to get object of corresponding UI Factory based on user input.
    public UIFactory createUIFactory(SupportedPlatform supportedPlatform) {
        return UIFactoryFactory.getUIFactory(supportedPlatform);
    }
}
