package com.xinxin.interpreter;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 1);
        map.put("c", 1);
        map.put("d", 1);

        System.out.println(new Calculator("a+b+c-d").run(map));
    }
}
