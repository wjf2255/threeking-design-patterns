package com.jackframe.prototype;

/**
 * 步兵
 * Created by jack on 21/07/2017.
 */
public abstract class Infantry implements Cloneable {

    protected String name = "步兵队";
    protected int power = 10;
    protected int speed = 7;

    public Infantry() {
        reviseProperty();
    }

    @Override
    public Infantry clone() throws CloneNotSupportedException {
        return (Infantry)super.clone();
    }

    /**
     * 修正属性
     */
    protected abstract void reviseProperty();

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Infantry{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", speed=" + speed +
                '}';
    }
}
