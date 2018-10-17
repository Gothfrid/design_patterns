package sample;

import sample.attack.LightAttack;
import sample.attack.StrongAttack;
import sample.common.Fighters;
import sample.common.Weapons;
import sample.fighters.AbstractFighter;
import sample.fighters.DwarfFighter;
import sample.fighters.ElvenFighter;

public class App

{
    public static void main( String[] args )
    {

        AbstractFighter player = Fighters.getFighter();
        player.setWeaponDamage(Weapons.getRandomWeapon());
        AbstractFighter enemy = Fighters.getFighter();
        enemy.setWeaponDamage(Weapons.getRandomWeapon());

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
