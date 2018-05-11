package com.jackframe.designpatterns.flyweight;

/**
 * Created by jack on 2018/5/11.
 */
public class SunCe extends Human {

    public SunCe() {
        super("孙策");
    }

    @Override
    SpecialSkill training(School school) {
        return school.training(SpecialSkillType.Conqueror);
    }
}
