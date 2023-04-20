package com.alphadev.abstractfactory;

import com.alphadev.abstractfactory.uifactory.MacUIFactory;
import com.alphadev.abstractfactory.uifactory.WinUIFactory;

public class Main {
    public static void main(String[] args) {
        Application application = new Application(new MacUIFactory());
        application.paint();
    }
}
