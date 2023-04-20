package com.alphadev.abstractfactory.uifactory;

import com.alphadev.abstractfactory.Button;
import com.alphadev.abstractfactory.CheckBox;
import com.alphadev.abstractfactory.os.win.WinButton;
import com.alphadev.abstractfactory.os.win.WinCheckBox;

public class WinUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
