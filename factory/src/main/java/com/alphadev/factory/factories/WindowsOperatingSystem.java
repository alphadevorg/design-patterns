package com.alphadev.factory.factories;

import com.alphadev.factory.factories.OperatingSystem;

public class WindowsOperatingSystem extends OperatingSystem {
    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        //windows command
    }

    @Override
    public void removeDir(String dir) {
        //windows command
    }
}
