package com.jackframe.design_partterns.decorator;

/**
 * Created by jack on 2018/5/4.
 */
public class MilitaryCamp implements Barrack {

    private Barrack barrack;

    public MilitaryCamp(Barrack barrack) {
        this.barrack = barrack;
    }

    @Override
    public Corps createCorps() {
        Corps corps = barrack.createCorps();
        General general = new General();
        general.setName("将军");
        corps.addGeneral(general);
        return corps;
    }
}
