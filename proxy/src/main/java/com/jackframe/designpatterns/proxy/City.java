package com.jackframe.designpatterns.proxy;

/**
 * Created by jack on 2018/5/13.
 */
public class City implements Agriculture{

    private Farmer farmer;

    private CityState cityState = CityState.Peace;

    public City(Farmer farmer) {
        this.farmer = farmer;
    }

    public void atWar() {
        cityState = CityState.War;
    }

    public void disaster() {
        cityState = CityState.Disaster;
    }

    @Override
    public void growWheat() {
        switch (cityState) {
            case Disaster:
                System.out.println("City is sick!");
                break;
            case Peace:
                farmer.growWheat();
                break;
            case War:
                System.out.println("City is at war!");
                break;
        }
    }
}
