package com.org.factory;

public class AircraftFactory extends WeaponFactory {
    @Override
    public Weapon get() {
        return new Aircraft();
    }
}
