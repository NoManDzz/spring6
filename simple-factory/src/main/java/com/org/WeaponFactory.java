package com.org;

/**
 * 工厂类
 *
 * @author 28317
 */
public class WeaponFactory {

    public static Weapon get(String weaponType) {
        if ("TANK".equals(weaponType)) {
            return new Tank();
        } else if ("FIGHTER".equals(weaponType)) {
            return new Fighter();
        } else {
            throw new RuntimeException("武器类型错误");
        }
    }
}
