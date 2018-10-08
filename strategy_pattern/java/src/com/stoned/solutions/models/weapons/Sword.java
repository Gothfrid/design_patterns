package com.stoned.solutions.models.weapons;

public class Sword implements Weapon {

    private int damageLimit;

    public Sword(int ownerStrength) {
        int damage = ownerStrength - 5;
        if (damage < 0) {
            damage = 0;
        }
        this.damageLimit = damage;
    }

    @Override
    public int attack() {
        return damageLimit;
    }
}
