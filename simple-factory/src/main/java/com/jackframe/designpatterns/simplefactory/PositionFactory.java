package com.jackframe.designpatterns.simplefactory;

import com.jackframe.designpatterns.simplefactory.position.ATSPosition;
import com.jackframe.designpatterns.simplefactory.position.MoseekerPosition;
import com.jackframe.designpatterns.simplefactory.position.Position;
import com.jackframe.designpatterns.simplefactory.position.PositionType;

/**
 * 创建职位的简单工厂。
 * Created by jack on 09/06/2017.
 */
public class PositionFactory {

    public static Position createPosition(PositionType positionType) {
        Position position = null;
        switch (positionType) {
            case ATS: position = new ATSPosition();break;
            case MOSEEKER: position = new MoseekerPosition(); break;
            default:
        }
        return position;
    }
}
