package com.jackframe.designpatterns.proxy;

/**
 * Created by jack on 2018/5/13.
 */
public class Farmer implements Agriculture {

    @Override
    public void growWheat() {
        System.out.println("Farmer grows wheat!");
    }
}
