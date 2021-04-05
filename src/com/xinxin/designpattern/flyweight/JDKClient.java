package com.xinxin.designpattern.flyweight;

public class JDKClient {
    public static void main(String[] args) {
        // Integer.valueOf x is in [-128,127] use cached Integer
        // If not, new a Integer
        Integer x = Integer.valueOf(127);
        Integer y = Integer.valueOf(127);
        System.out.println(x == y);

        for (int i = -129; i < 150; ++ i) {
            Integer a = Integer.valueOf(i);
            Integer b = Integer.valueOf(i);
            System.out.println(i + "=" + (a == b));
        }
    }
}
