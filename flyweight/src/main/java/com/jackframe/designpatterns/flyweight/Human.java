package com.jackframe.designpatterns.flyweight;

/**
 * Created by jack on 2018/5/11.
 */
public abstract class Human {

    private String name;

    private SpecialSkill specialSkill;

    public Human(String name) {
        this.name = name;
    }

    public void useSpecialSkill() {
        if (specialSkill != null) {
            System.out.println(name + "使用特技:");
            specialSkill.use();
        } else {
            System.out.println(name + "废人一个！");
        }

    }

    public void goToSchool(School school) {
        specialSkill = training(school);
    }

    abstract SpecialSkill training(School school);
}
