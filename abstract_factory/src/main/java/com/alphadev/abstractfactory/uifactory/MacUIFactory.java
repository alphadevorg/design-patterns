package com.alphadev.abstractfactory.uifactory;

import com.alphadev.abstractfactory.Button;
import com.alphadev.abstractfactory.CheckBox;
import com.alphadev.abstractfactory.os.mac.MacButton;
import com.alphadev.abstractfactory.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
