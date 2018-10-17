package sample.fighters;

import sample.attack.AttackBehavior;

public abstract class AbstractFighter {

    private AttackBehavior attackBehavior;
    private int healthPoints;
    private int staminaPoints;
    private int weaponDamage = 0;
    private String name = "UNKNOWN";
    private int restoringFactor = 0;


    public void attack(AbstractFighter enemy) {

        AttackProfile attackProfile = attackBehavior.attack(weaponDamage);
        if (staminaPoints >= attackProfile.getExhaust()) {
            System.out.println(getName() + " attacked with - " + attackProfile.getDamage());
            staminaPoints -= attackProfile.getExhaust();
            enemy.takeDamage(attackProfile.getDamage());
        }
    }


    private void takeDamage(long damage) {
        this.healthPoints -= damage;
    }

    public void restoreStamina() {
        this.staminaPoints += restoringFactor;
    }

    public boolean isAlive() {
        return this.healthPoints > 0;
    }

    public boolean isExhaust() {
        return this.staminaPoints <= 0;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStaminaPoints() {
        return staminaPoints;
    }

    public void setStaminaPoints(int staminaPoints) {
        this.staminaPoints = staminaPoints;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRestoringFactor() {
        return restoringFactor;
    }

    public void setRestoringFactor(int restoringFactor) {
        this.restoringFactor = restoringFactor;
    }

}

