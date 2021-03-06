package com.jackframe.prototype;

import java.io.Serializable;

/**
 * 骑兵队
 * Created by jack on 21/07/2017.
 */
public abstract class Cavalry implements Cloneable {

    protected String name = "骑兵队";
    protected int power = 15;
    protected int speed = 10;

    public Cavalry() {
        reviseProperty();
    }

    @Override
    public Cavalry clone() throws CloneNotSupportedException {
        return (Cavalry) super.clone();
    }

    /**
     * 修正属性
     */
    protected abstract void reviseProperty();

    @Override
    public String toString() {
        return "Cavalry{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", speed=" + speed +
                '}';
    }

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
