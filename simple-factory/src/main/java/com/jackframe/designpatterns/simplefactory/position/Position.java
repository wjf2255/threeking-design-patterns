package com.jackframe.designpatterns.simplefactory.position;

import java.util.List;

/**
 * 职位信息
 * Created by jack on 09/06/2017.
 */
public abstract class Position {

    private int id;
    private String title;
    private List<String> city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }
}
