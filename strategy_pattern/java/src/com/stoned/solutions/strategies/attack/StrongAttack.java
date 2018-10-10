package com.stoned.solutions.strategies.attack;

import com.stoned.solutions.common.Weapons;
import com.stoned.solutions.models.fighters.AttackProfile;

import java.util.Random;

public class StrongAttack implements AttackBehavior{

    public static final double EXHAUST_MULTIPLIER = 2;
    public static final double ATTACK_MULTIPLIER = 2;


    @Override
    public AttackProfile attack(int weaponDamage) {
        double damage = Weapons.hitCalculator(weaponDamage);
        return new AttackProfile(Math.round(damage*ATTACK_MULTIPLIER), Math.round(weaponDamage*EXHAUST_MULTIPLIER));
    }
}
