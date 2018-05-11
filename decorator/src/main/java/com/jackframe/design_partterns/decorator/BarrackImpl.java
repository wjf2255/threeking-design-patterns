package com.jackframe.design_partterns.decorator;

import java.util.ArrayList;

/**
 * Created by jack on 2018/5/4.
 */
public class BarrackImpl implements Barrack {

    @Override
    public Corps createCorps() {
        Corps corps = new Corps();
        Cavalry cavalry = new Cavalry();
        corps.addCavalry(cavalry);

        Infantry infantry = new Infantry();
        infantry.setName("步兵一大队");
        corps.addInfantry(infantry);

        Infantry infantry2 = new Infantry();
        infantry.setName("步兵二大队");
        corps.addInfantry(infantry2);

        return corps;
    }
}
