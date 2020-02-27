package com.asys1920.model;


import java.util.HashMap;
import java.util.Map;

public enum VehicleType {
    CABRIOLET("cabriolet"),
    ESTATE_CAR("estate_car"),
    SALOON("saloon"),
    SMALL_CAR("small_car"),
    COUPE("coupe"),
    SUV("suv"),
    VAN("van"),
    OTHER("other");

    private String value;

    VehicleType(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }

    // Lookup table

    private static final Map<String, VehicleType> lookup = new HashMap<>();

    static {
        for(VehicleType type : VehicleType.values()) {
            lookup.put(type.getValue(), type);
        }
    }

    public static VehicleType get(String value) {
        return lookup.get(value.toLowerCase());
    }

    public static boolean contains(String test) {

        for (VehicleType type : VehicleType.values()) {
            if (type.name().equals(test)) {
                return true;
            }
        }

        return false;
    }
}