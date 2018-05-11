package com.jackframe.prototype;

import com.jackframe.prototype.shu.ShuBarracks;
import com.jackframe.prototype.wei.WeiBarracks;
import com.jackframe.prototype.wu.WuBarracks;

/**
 *
 * Created by jack on 21/07/2017.
 */
public class App {

    public static void main(String[] args) {

        Barracks shuBarracks = new ShuBarracks();
        Cavalry shuCavalry = shuBarracks.draftCavalry();
        Infantry shuInfantry = shuBarracks.draftInfantry();
        System.out.println(shuCavalry);
        System.out.println(shuInfantry);

        Barracks weiBarracks = new WeiBarracks();
        Cavalry weiCavalry = weiBarracks.draftCavalry();
        Infantry weiInfantry = weiBarracks.draftInfantry();
        System.out.println(weiCavalry);
        System.out.println(weiInfantry);

        Barracks wuBarracks = new WuBarracks();
        Cavalry wuCavalry = wuBarracks.draftCavalry();
        Infantry wuInfantry = wuBarracks.draftInfantry();
        System.out.println(wuCavalry);
        System.out.println(wuInfantry);
    }
}
