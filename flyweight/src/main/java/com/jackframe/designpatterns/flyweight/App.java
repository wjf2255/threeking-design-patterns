package com.jackframe.designpatterns.flyweight;

/**
 * Created by jack on 2018/5/11.
 */
public class App {

    public static void main(String[] args) {
        School school = new School();
        SunCe sunCe = new SunCe();
        sunCe.useSpecialSkill();
        sunCe.goToSchool(school);
        sunCe.useSpecialSkill();

        System.out.println("------------");

        XiaHouDun xiaHouDun = new XiaHouDun();
        xiaHouDun.useSpecialSkill();
        xiaHouDun.goToSchool(school);
        xiaHouDun.useSpecialSkill();

        System.out.println("------------");

        GuoJia guoJia = new GuoJia();
        guoJia.useSpecialSkill();
        guoJia.goToSchool(school);
        guoJia.useSpecialSkill();
    }
}
