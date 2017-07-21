package com.jackframe.designpatterns.factorymethod;

/**
 * Created by jack on 30/06/2017.
 */
public interface Cache {

    public void store(String key, Object value);
    public Object get(String key);
}
