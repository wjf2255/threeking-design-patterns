package com.jackframe.prototype.wei;

import com.jackframe.prototype.Barracks;
import com.jackframe.prototype.Cavalry;
import com.jackframe.prototype.Infantry;

/**
 * 魏国兵营
 * Created by jack on 21/07/2017.
 */
public class WeiBarracks implements Barracks {

    private static WeiCavalry cavalry = new WeiCavalry();
    private static WeiInfantry infantry = new WeiInfantry();

    public Cavalry draftCavalry() {
        try {
            return cavalry.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Infantry draftInfantry() {
        try {
            return infantry.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
