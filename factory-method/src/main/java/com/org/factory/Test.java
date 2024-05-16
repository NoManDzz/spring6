package com.org.factory;

public class Test {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new TankFactory();
        Weapon weapon = weaponFactory.get();
        weapon.attack();
    }
}
