package com.stoned.solutions.common;

public class Weapons {

    public static final int SWORD = 5;
    public static final int AXE = 6;
    public static final int DAGGER = 3;
    public static final int CLAYMORE = 7;

    public static final int pickWeapon(String weapon) {
        switch (weapon.toUpperCase()) {
            case "SWORD" :
                return SWORD;
            case "AXE":
                return AXE;
            case "DAGGER":
                return DAGGER;
            case "CLAYMORE":
                return CLAYMORE;
            default:
                return 0;
        }
    }

    public static final double hitCalculator(int baseDamage) {
        return Math.random() * baseDamage;
    }

}
