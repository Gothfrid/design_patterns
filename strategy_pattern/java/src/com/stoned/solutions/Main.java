package com.stoned.solutions;

import com.stoned.solutions.common.Weapons;
import com.stoned.solutions.models.fighters.AbstractFighter;
import com.stoned.solutions.models.fighters.DwarfFighter;
import com.stoned.solutions.models.fighters.ElvenFighter;
import com.stoned.solutions.strategies.attack.LightAttack;
import com.stoned.solutions.strategies.attack.StrongAttack;

public class Main {

    public static void main(String[] args) {

        AbstractFighter player = new DwarfFighter("PLAYER", Weapons.pickWeapon("AXE"));
        AbstractFighter enemy = new ElvenFighter("ENEMY", Weapons.pickWeapon("SWORD"));

        player.setAttackBehavior(new StrongAttack());
        enemy.setAttackBehavior(new LightAttack());

        boolean keepFighting = true;
        while (keepFighting) {
            System.out.println(player.getName() + ": " + player.getHealthPoints() + "HP  " +
                    " | " + player.getStaminaPoints() + "SP  " +
                    "||  " + enemy.getName() + ": " + enemy.getHealthPoints() + "HP" +
                    " | " + enemy.getStaminaPoints() + "SP  "
            );
            player.attack(enemy);
            if (enemy.isAlive()) {
                enemy.attack(player);
            } else {
                System.out.println("Enemy died");
                keepFighting = false;
                continue;
            }
            if (!player.isAlive()) {
                System.out.println("You died");
                keepFighting = false;
                continue;
            }

            player.restoreStamina();
            enemy.restoreStamina();

        }


    }
}
