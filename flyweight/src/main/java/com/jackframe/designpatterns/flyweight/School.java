package com.jackframe.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 私塾
 *
 * Created by jack on 2018/5/11.
 */
public class School {

    private static Map<SpecialSkillType, SpecialSkill> storage = new HashMap<>();

    public SpecialSkill training(SpecialSkillType type) {
        SpecialSkill specialSkill = storage.get(type);
        if (specialSkill != null) {
            return specialSkill;
        } else {
            switch (type) {
                case Conqueror:
                    specialSkill = new Conqueror();
                    storage.put(type, specialSkill);
                    break;
                case Counsellor:
                    specialSkill = new Counsellor();
                    storage.put(type, specialSkill);
                    break;
                case TroopTraining:
                    specialSkill = new TroopTraining();
                    storage.put(type, specialSkill);
                    break;
                default:
            }
        }
        return specialSkill;
    }
}
