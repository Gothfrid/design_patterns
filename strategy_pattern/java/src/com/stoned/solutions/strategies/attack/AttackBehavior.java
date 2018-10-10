package com.stoned.solutions.models.attack;

import java.util.Random;

public interface AttackBehavior {

    static final int EXHAUST = 5;

    default public int attack() {
        Random rand = new Random();
        return rand.nextInt(10);
    }

    default public int exhaust() {
        return EXHAUST;
    }

}
