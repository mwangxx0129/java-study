package com.xinxin.algo.basic.math;

import java.util.Objects;

public class TestGeneric {
    public static void main(String[] args) {
        int a = 3;
        XArrayList list = new XArrayList(a);
        System.out.println(list.a.getClass());
    }
    private static class XArrayList<E> {
        E a;

        XArrayList(E var1) {

            this.a = Objects.requireNonNull(var1);
//            System.out.println("constructor=" + var1[0].getClass());
            System.out.println(a.getClass());
//            System.out.println(a[0].getClass());
        }
        // var args
        // [Object, ...]
        public static <T> XArrayList<T> asList(T... var0) {
            XArrayList res = new XArrayList(var0);
            System.out.println("asList=" + var0.getClass());
            return res;
        }
    }
}
