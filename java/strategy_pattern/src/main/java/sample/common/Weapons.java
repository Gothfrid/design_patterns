package sample.common;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Weapons {

    private static final Map<String, Integer> WEAPONS = new HashMap<>();

    static {
        WEAPONS.put("SWORD", 5);
        WEAPONS.put("AXE", 6);
        WEAPONS.put("DAGGER", 3);
        WEAPONS.put("CLAYMORE", 7);
        WEAPONS.put("EMPTY_HANDS", 1);
    }

    public static final int getRandomWeapon() {
        Object[] weapons_list = WEAPONS.keySet().toArray();
        String weapon = (String) weapons_list[new Random().nextInt(weapons_list.length)];
        System.out.println("He picked: "  + weapon);
        return WEAPONS.get(weapon);
    }

    public static final double hitCalculator(int baseDamage) {
        return Math.random() * baseDamage;
    }

}
