package com.jackframe.designpatterns.simplefactory.position;

import java.util.ArrayList;

/**
 * 仟寻职位
 * Created by jack on 09/06/2017.
 */
public class MoseekerPosition extends Position {

    public MoseekerPosition() {
        this.setTitle("Moseeker position");
        this.setCity(new ArrayList<String>(){{this.add("上海");}});
    }
}
