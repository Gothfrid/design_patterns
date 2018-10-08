package com.stoned.solutions.models.fighters;

import com.stoned.solutions.models.weapons.Weapon;

public abstract class AbstractFighter {

    private Weapon weapon;
    private int healthPoints;
    private int strengthPoints;
    private int agilePoints;


    public void attack(AbstractFighter enemy) {
        int damage = getWeapon().attack();
        enemy.takeDamage(damage);
    }


    private void takeDamage(int damage) {
        this.healthPoints -= damage;
    }

    public boolean isAlive() {
        return this.healthPoints > 0;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrengthPoints() {
        return strengthPoints;
    }

    public void setStrengthPoints(int strengthPoints) {
        this.strengthPoints = strengthPoints;
    }

    public int getAgilePoints() {
        return agilePoints;
    }

    public void setAgilePoints(int agilePoints) {
        this.agilePoints = agilePoints;
    }
}

