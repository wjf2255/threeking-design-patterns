package com.jackframe.designpatterns.simplefactory;

import com.jackframe.designpatterns.simplefactory.position.Position;
import com.jackframe.designpatterns.simplefactory.position.PositionType;
import org.junit.Test;

/**
 * 职位的业务处理类
 * Created by jack on 09/06/2017.
 */
public class PositionBiz {

    public void positionBiz() {
        Position atsPosition = PositionFactory.createPosition(PositionType.ATS);
        System.out.println(atsPosition.getCity());
        System.out.println(atsPosition.getTitle());

        Position moseekerPosition = PositionFactory.createPosition(PositionType.MOSEEKER);
        System.out.println(moseekerPosition.getCity());
        System.out.println(moseekerPosition.getTitle());
    }
}
