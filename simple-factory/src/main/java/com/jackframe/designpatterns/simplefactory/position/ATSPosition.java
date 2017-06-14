package com.jackframe.designpatterns.simplefactory.position;

import java.util.ArrayList;

/**
 * Created by jack on 09/06/2017.
 */
public class ATSPosition extends Position {
    public ATSPosition() {
        this.setTitle("ATS position");
        this.setCity(new ArrayList<String>(){{this.add("全国");}});
    }
}
