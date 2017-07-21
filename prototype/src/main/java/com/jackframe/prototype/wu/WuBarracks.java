package com.jackframe.prototype.wu;

import com.jackframe.prototype.Barracks;
import com.jackframe.prototype.Cavalry;
import com.jackframe.prototype.Infantry;

/**
 * 吴国兵营
 * Created by jack on 21/07/2017.
 */
public class WuBarracks implements Barracks {

    private static WuCavalry cavalry = new WuCavalry();
    private static WuInfantry infantry = new WuInfantry();

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
