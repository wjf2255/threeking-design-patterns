package com.jackframe.designpatterns.flyweight;

/**
 * Created by jack on 2018/5/11.
 */
public class XiaHouDun extends Human {

    public XiaHouDun() {
        super("夏侯惇");
    }

    @Override
    SpecialSkill training(School school) {
        return school.training(SpecialSkillType.TroopTraining);
    }
}
