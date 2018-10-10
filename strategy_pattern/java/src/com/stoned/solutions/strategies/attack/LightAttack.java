package com.stoned.solutions.strategies.attack;

import com.stoned.solutions.models.fighters.AttackProfile;

import java.util.Random;

public class FastAttack implements AttackBehavior{

    public static final double EXHAUST_MULTIPLIER = 0.5;
    public static final double ATTACK_MULTIPLIER = 0.7;


    @Override
    public AttackProfile attack(int weaponDamage) {
        Random rand = new Random();
        int damage = rand.nextInt(weaponDamage);
        return new AttackProfile(Math.round(damage*ATTACK_MULTIPLIER), Math.round(weaponDamage*EXHAUST_MULTIPLIER));
    }

}