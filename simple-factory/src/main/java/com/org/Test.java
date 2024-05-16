package com.org;

public class Test {
    public static void main(String[] args) {
        Weapon tank = WeaponFactory.get("TANK");
        tank.attack();
        Weapon fighter = WeaponFactory.get("FIGHTER");
        fighter.attack();
    }
}
