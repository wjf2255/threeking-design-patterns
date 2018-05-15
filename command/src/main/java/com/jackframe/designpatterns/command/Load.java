package com.jackframe.designpatterns.command;

/**
 * Created by jack on 2018/5/14.
 */
public class Load {

    public void build(Build build) {
        build.build();
    }

    public void demolish(Build build) {
        build.demolish();
    }
}
