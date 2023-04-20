package com.alphadev.abstractfactory.os.mac;

import com.alphadev.abstractfactory.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
