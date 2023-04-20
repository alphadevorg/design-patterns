package com.alphadev.abstractfactory.os.mac;

import com.alphadev.abstractfactory.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac checkbox");
    }
}
