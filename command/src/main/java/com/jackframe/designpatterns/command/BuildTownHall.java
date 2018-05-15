package com.jackframe.designpatterns.command;

/**
 * Created by jack on 2018/5/14.
 */
public class BuildTownHall implements Build {

    private Farmer farmer;

    public BuildTownHall(Farmer farmer) {
        this.farmer = farmer;
    }

    @Override
    public void build() {
        System.out.println(farmer+"建造城镇办公大厅！");
    }

    @Override
    public void demolish() {
        System.out.println(farmer+"拆毁城镇办公大厅！");
    }
}
