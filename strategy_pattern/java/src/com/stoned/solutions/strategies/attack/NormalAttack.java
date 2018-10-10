package com.stoned.solutions.strategies.attack;

import com.stoned.solutions.models.fighters.AttackProfile;

import java.util.Random;

public class FastAttack implements AttackBehavior{

    static final double EXHAUST = 0.5;
    static final double ATTACK_MULTIPLIER = 0.7;


    @Override
    public AttackProfile attack(int weaponDamage) {
        Random rand = new Random();
        int damage = rand.nextInt(weaponDamage);
        return new AttackProfile(Math.round(damage*EXHAUST), Math.round(weaponDamage*EXHAUST));
    }
}
