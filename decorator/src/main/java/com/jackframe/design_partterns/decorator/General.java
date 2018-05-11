package com.jackframe.design_partterns.decorator;

/**
 * Created by jack on 2018/5/4.
 */
public class General {

    protected String name = "将军卫队";
    protected int power = 20;
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
