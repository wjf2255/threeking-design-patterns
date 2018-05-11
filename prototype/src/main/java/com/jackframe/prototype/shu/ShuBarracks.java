package com.jackframe.prototype.shu;

import com.jackframe.prototype.Barracks;
import com.jackframe.prototype.Cavalry;
import com.jackframe.prototype.Infantry;

/**
 * 蜀国兵营
 * Created by jack on 21/07/2017.
 */
public class ShuBarracks implements Barracks {

    private static ShuCavalry cavalry = new ShuCavalry();
    private static ShuInfantry shuInfantry = new ShuInfantry();

    public Cavalry draftCavalry() {
        try {
            return cavalry.clone();

        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Infantry draftInfantry() {
        try {
            return shuInfantry.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
