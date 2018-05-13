package com.jackframe.designpatterns.proxy;

/**
 * Created by jack on 2018/5/13.
 */
public class App {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        City city = new City(farmer);
        city.growWheat();
        city.atWar();
        city.growWheat();
        city.disaster();
        city.growWheat();
    }
}
