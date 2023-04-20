package com.alphadev.factory;

import com.alphadev.factory.factories.LinuxOperatingSystem;
import com.alphadev.factory.factories.OperatingSystem;
import com.alphadev.factory.factories.WindowsOperatingSystem;

public class OperatingSystemFactory {

    private OperatingSystemFactory() {
    }

    /*
    * One more advantage, tomorrow you planned to change the OS here, you can change
    * */

    /*
    * Example creation of object.
    * OperatingSystem operatingsystem = OperatingSystemFactory.getInstance("WINDOWS")
    * * OperatingSystem operatingsystem1 = OperatingSystemFactory.getInstance("Linux")
    * */

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type) {
            case "WINDOWS":
                return new WindowsOperatingSystem(version, architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("OS Not Supported .");
        }
    }
}
