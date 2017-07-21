package com.jackframe.designpatterns.factorymethod;

/**
 * Created by jack on 30/06/2017.
 */
public interface CacheFactory {

    public Cache createCache(CacheType cacheType);
}
