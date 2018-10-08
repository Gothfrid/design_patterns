package com.stoned.solutions;

import com.stoned.solutions.models.fighters.AbstractFighter;
import com.stoned.solutions.models.fighters.DwarfFighter;
import com.stoned.solutions.models.weapons.Sword;

public class Main {

    public static void main(String[] args) {

        AbstractFighter player = new DwarfFighter();
        player.setWeapon(new Sword(player.getStrengthPoints()));
        AbstractFighter enemy = new DwarfFighter();
        enemy.setWeapon(new Sword(enemy.getStrengthPoints()));

        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            System.out.println("After your attack enemy was left with " + enemy.getHealthPoints() + " health points");
            if (enemy.isAlive()) {
                enemy.attack(player);

            } else {
                System.out.println(" YOU KILLED THE ENEMY");
                System.exit(0);
            }
            if (player.isAlive()) {
                System.out.println("After enemy attack you was left with " + enemy.getHealthPoints() + " health points");
            } else {
                System.out.println(" YOU DIED ");
            }
        }


    }
}
