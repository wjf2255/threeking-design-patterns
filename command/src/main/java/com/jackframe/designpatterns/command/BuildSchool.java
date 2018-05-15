package com.jackframe.designpatterns.command;

/**
 * Created by jack on 2018/5/14.
 */
public class BuildSchool implements Build {

    private Farmer farmer;

    public BuildSchool(Farmer farmer) {
        this.farmer = farmer;
    }

    @Override
    public void build() {
        System.out.println(farmer+"建造小学！");
    }

    @Override
    public void demolish() {
        System.out.println(farmer+"拆除小学！");
    }
}
