package com.stoned.solutions.models.fighters;

public class ElvenFighter extends AbstractFighter {

    public ElvenFighter(String name, int weaponDamage){
        this.setName(name);
        this.setHealthPoints(100);
        this.setStaminaPoints(90);
        this.setRestoringFactor(1);
        this.setWeaponDamage(weaponDamage);
    }

}
