package com.alphadev.abstractfactory.os.win;

import com.alphadev.abstractfactory.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
