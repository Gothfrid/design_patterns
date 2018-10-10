package com.stoned.solutions.models.fighters;

public class DwarfFighter extends AbstractFighter {

    public DwarfFighter(String name, int weaponDamage) {
        this.setName(name);
        this.setHealthPoints(100);
        this.setStaminaPoints(80);
        this.setRestoringFactor(2);
        this.setWeaponDamage(weaponDamage);
    }


}
