package com.alphadev.abstractfactory.os.win;

import com.alphadev.abstractfactory.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Windows checkbox");
    }
}
