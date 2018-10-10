package com.stoned.solutions.strategies.attack;

import com.stoned.solutions.models.fighters.AttackProfile;

public interface AttackBehavior {

    AttackProfile attack(int weaponDamage);

}