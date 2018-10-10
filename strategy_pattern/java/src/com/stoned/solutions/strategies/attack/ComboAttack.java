package com.stoned.solutions.strategies.attack;

import com.stoned.solutions.models.fighters.AttackProfile;

import java.util.Random;

public class FastFastStrongCombo implements AttackBehavior {

    @Override
    public AttackProfile attack(int weaponDamage) {
        Random rand = new Random();
        double damage = rand.nextInt(weaponDamage) * FastAttack.EXHAUST_MULTIPLIER;
        damage += rand.nextInt(weaponDamage) * FastAttack.EXHAUST_MULTIPLIER;
        damage += rand.nextInt(weaponDamage) * StrongAttack.EXHAUST_MULTIPLIER;
        double exhaust = weaponDamage * (FastAttack.EXHAUST_MULTIPLIER * 2 + StrongAttack.EXHAUST_MULTIPLIER);
        return new AttackProfile(Math.round(damage), Math.round(exhaust));
    }
}
