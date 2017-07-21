package com.jackframe.designpatterns.simplefactory;

/**
 * Created by jack on 14/07/2017.
 */
public class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Math startMain = new Add();
        Integer a = 2;
        Integer b = 2;
        System.out.println(startMain.add(a, b));
    }
}
