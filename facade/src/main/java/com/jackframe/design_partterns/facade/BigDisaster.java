package com.jackframe.design_partterns.facade;

/**
 * Created by jack on 2018/5/6.
 */
public class BigDisaster implements Disaster{

    private City city = new City();
    private Corps corps = new Corps();

    public void disaster() {
        city.disaster();
        corps.disaster();
    }
}
