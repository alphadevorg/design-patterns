package com.alphadev.abstractfactory.uifactory;

import com.alphadev.abstractfactory.Button;
import com.alphadev.abstractfactory.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
