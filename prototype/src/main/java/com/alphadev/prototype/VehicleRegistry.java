package com.alphadev.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static Map<String, Vehicle> mapVehicle = new HashMap<>();

    static {
        mapVehicle.put("TWO", new TwoWheelerVehicle("120", "royal", 120000, false));
        mapVehicle.put("FOUR", new FourWheelerVehicle("120", "base", 1340000, true, false));
    }

    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
        return mapVehicle.get(vehicle).clone();
    }
}
