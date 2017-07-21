package com.jackframe.designpatterns.simplefactory.position;

import java.util.ArrayList;

/**
 * 第三方平台的职位
 * Created by jack on 09/06/2017.
 */
public class ATSPosition extends Position {
    private int atsStatus;

    public ATSPosition() {
        this.setTitle("ATS position");
        this.setCity(new ArrayList<String>(){{this.add("全国");}});
        this.setAtsStatus(1);
    }

    public int getAtsStatus() {
        return atsStatus;
    }

    public void setAtsStatus(int atsStatus) {
        this.atsStatus = atsStatus;
    }
}
