package sample.attack;

import sample.common.Weapons;
import sample.fighters.AttackProfile;

import java.util.Random;

public class ComboAttack implements AttackBehavior {

    @Override
    public AttackProfile attack(int weaponDamage) {
        double damage =  Weapons.hitCalculator(weaponDamage) * LightAttack.EXHAUST_MULTIPLIER;
        damage +=  Weapons.hitCalculator(weaponDamage) * LightAttack.EXHAUST_MULTIPLIER;
        damage +=  Weapons.hitCalculator(weaponDamage) * StrongAttack.EXHAUST_MULTIPLIER;
        double exhaust = weaponDamage * (LightAttack.EXHAUST_MULTIPLIER * 2 + StrongAttack.EXHAUST_MULTIPLIER);
        return new AttackProfile(Math.round(damage), Math.round(exhaust));
    }
}
