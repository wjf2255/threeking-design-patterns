package com.jackframe.design_partterns.decorator;

/**
 * Created by jack on 2018/5/4.
 */
public class Cavalry {

    protected String name = "骑兵队";
    protected int power = 15;
    protected int speed = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
