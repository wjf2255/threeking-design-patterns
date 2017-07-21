package com.jackframe.prototype;

/**
 * 兵营
 * Created by jack on 21/07/2017.
 */
public interface Barracks {

    /**
     * 征召骑兵
     * @return
     */
    Cavalry draftCavalry();

    /**
     * 征召步兵
     * @return
     */
    Infantry draftInfantry();
}
