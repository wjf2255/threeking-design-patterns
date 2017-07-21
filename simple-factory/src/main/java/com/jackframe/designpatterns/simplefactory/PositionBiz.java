package com.jackframe.designpatterns.simplefactory;

import com.jackframe.designpatterns.simplefactory.position.Position;
import com.jackframe.designpatterns.simplefactory.position.PositionType;

/**
 * 职位的业务处理类
 * Created by jack on 09/06/2017.
 */
public class PositionBiz {

    /**
     * 工厂的模式依赖存在不同的产品，但是这些产品能够抽象出一组行为。
     * 比如：不管是ATS职位还是Moseeker职位都需要入库，并且具体入库的操作是有一定区别的，那么可以简单的抽象出一个职位保存的方法。
     * 具体的实现，ats职位需要关心ats_status字段，MoSeeker不需要关心，则由具体的职位保存的实现去实现。
     */
    public void positionBiz() {
        Position atsPosition = PositionFactory.createPosition(PositionType.ATS);
        System.out.println(atsPosition.getCity());
        System.out.println(atsPosition.getTitle());

        Position moseekerPosition = PositionFactory.createPosition(PositionType.MOSEEKER);
        System.out.println(moseekerPosition.getCity());
        System.out.println(moseekerPosition.getTitle());
    }
}
