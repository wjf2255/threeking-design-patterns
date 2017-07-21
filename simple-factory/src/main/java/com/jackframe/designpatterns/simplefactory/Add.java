package com.jackframe.designpatterns.simplefactory;

/**
 * Created by jack on 14/07/2017.
 */
public class Add extends Math{

    public int add(Integer a, Integer b) {
        return a - b;
    }

    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.add(1, 2));

        System.out.println(a.add(Integer.valueOf(1), Integer.valueOf(2)));
    }
}
