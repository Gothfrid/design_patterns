package com.stoned.solutions.strategies.attack;

import com.stoned.solutions.models.fighters.AttackProfile;

import java.util.Random;

public class NormalAttack implements AttackBehavior{

    static final double EXHAUST = 1;
    static final double ATTACK_MULTIPLIER = 1;


    @Override
    public AttackProfile attack(int weaponDamage) {
        Random rand = new Random();
        int damage = rand.nextInt(weaponDamage);
        return new AttackProfile(Math.round(damage*EXHAUST), Math.round(weaponDamage*EXHAUST));
    }
}
