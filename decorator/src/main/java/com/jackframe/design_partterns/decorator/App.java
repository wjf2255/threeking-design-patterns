package com.jackframe.design_partterns.decorator;

/**
 * Created by jack on 2018/5/6.
 */
public class App {

    public static void main(String[] args) {
        BarrackImpl barrack = new BarrackImpl();
        Corps corps = barrack.createCorps();
        System.out.println(corps);

        MilitaryCamp militaryCamp = new MilitaryCamp(barrack);
        Corps corps1 = militaryCamp.createCorps();
        System.out.println(corps1);
    }
}
