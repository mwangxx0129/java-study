package com.xinxin.interview.amazon.shoppingoptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Client {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(5);
        System.out.println(Collections.binarySearch(list, 2) + 1);


        int[] list1 = {4};
        int[] list2 = {3,4};
        int[] list3 = {1,2};
        int[] list4 = {2,1};
        int budget = 10;

        System.out.println(new Solution().getNumberOfOptions(Arrays.asList(4),
                Arrays.asList(3,4),
                Arrays.asList(1,2),
                Arrays.asList(2,1),
                budget));
    }
}
