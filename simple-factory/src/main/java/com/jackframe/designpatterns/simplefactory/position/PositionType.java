package com.jackframe.designpatterns.simplefactory.position;

import java.util.Hashtable;
import java.util.Map;

/**
 * 职位类型
 * Created by jack on 09/06/2017.
 */
public enum PositionType {

    MOSEEKER(1), ATS(2);

    private static Map<Integer, PositionType> types = new Hashtable<>();
    private int value;

    static {
        for (PositionType type : values()) {
            types.put(type.getValue(), type);
        }
    }

    private PositionType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static PositionType instanceFromValue(int value) {
        return types.get(value);
    }
}
