package com.jackframe.designpatterns.flyweight;

/**
 * Created by jack on 2018/5/11.
 */
public class GuoJia extends Human {

    public GuoJia() {
        super("郭嘉");
    }

    @Override
    SpecialSkill training(School school) {
        return school.training(SpecialSkillType.Counsellor);
    }
}
