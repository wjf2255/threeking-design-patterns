package com.jackframe.designpatterns.command;

/**
 * Created by jack on 2018/5/13.
 */
public class App {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();

        Build building1 = new BuildSchool(farmer);
        Build building2 = new BuildTownHall(farmer);

        Load load = new Load();
        load.build(building1);
        load.demolish(building1);

        load.build(building2);
        load.demolish(building2);
    }
}
