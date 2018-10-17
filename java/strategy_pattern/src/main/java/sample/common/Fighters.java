package sample.common;

import sample.fighters.AbstractFighter;
import sample.fighters.DwarfFighter;
import sample.fighters.ElvenFighter;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Fighters {

    private static final Map<String, AbstractFighter> FIGHTERS = new HashMap<>();

    static {
        FIGHTERS.put("ELF", new ElvenFighter());
        FIGHTERS.put("DWARF", new DwarfFighter());
    }

    public static final AbstractFighter getFighter() {
        Object[] fighter_list = FIGHTERS.keySet().toArray();
        String fighter_name = (String) fighter_list[new Random().nextInt(fighter_list.length)];
        System.out.println(" " + fighter_name + " enters the arena.");
        return FIGHTERS.get(fighter_name);
    }

}
