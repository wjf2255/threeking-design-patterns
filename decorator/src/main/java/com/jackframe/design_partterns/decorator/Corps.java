package com.jackframe.design_partterns.decorator;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * 军团
 *
 * Created by jack on 2018/5/4.
 */
public class Corps {

    private List<Cavalry> cavalries = new ArrayList<>();
    private List<Infantry> infantries = new ArrayList<>();
    private List<General> generals = new ArrayList<>();

    public void addCavalry(Cavalry cavalry) {
        boolean flag = false;
        Iterator<Cavalry> iterator = cavalries.iterator();
        while (iterator.hasNext()) {
            Cavalry c = iterator.next();
            if (c.getName().equals(cavalry.getName())) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            cavalries.add(cavalry);
        }
    }

    public void addInfantry(Infantry infantry) {
        boolean flag = false;
        Iterator<Infantry> iterator = infantries.iterator();
        while (iterator.hasNext()) {
            Infantry i = iterator.next();
            if (i.getName().equals(infantry.getName())) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            infantries.add(infantry);
        }
    }

    public void addGeneral(General general) {
        boolean flag = false;
        Iterator<General> iterator = generals.iterator();
        while (iterator.hasNext()) {
            General i = iterator.next();
            if (i.getName().equals(general.getName())) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            generals.add(general);
        }
    }

    @Override
    public String toString() {

        return JSONObject.toJSONString(this);
    }

    public List<Cavalry> getCavalries() {
        return cavalries;
    }

    public List<Infantry> getInfantries() {
        return infantries;
    }

    public List<General> getGenerals() {
        return generals;
    }
}
