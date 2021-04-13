package com.xinxin.interview.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingOptions {
    public static void main(String[] args) {
        int[] list1 = {4};
        int[] list2 = {3,4};
        int[] list3 = {1,2};
        int[] list4 = {2,1};
        int budget = 10;


        List<List<Integer>> res = shoppingOptions(list1,
                list2,
                list3,
                list4,
                budget);

        for (List e : res) {
            System.out.println(e);
        }
    }

    public static List<List<Integer>> shoppingOptions(int[] list1,
                                                      int[] list2,
                                                      int[] list3,
                                                      int[] list4,
                                                      int budget) {
        Arrays.sort(list1);
        Arrays.sort(list2);
        Arrays.sort(list3);
        Arrays.sort(list4);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < list1.length; ++ i) {
            int sum = list1[i];
            if (sum > budget) {
                return res;
            }

            for (int j = 0; j < list2.length; ++ j) {

                sum += list2[j];
                if (sum > budget) {
                    return res;
                }

                for (int k = 0; k < list3.length; ++ k) {

                    sum += list3[k];
                    if (sum > budget) {
                        return res;
                    }

                    for (int m = 0; m < list4.length; ++ m) {
                        sum += list4[m];
                        if (sum <= budget) {
                            res.add(Arrays.asList(list1[i], list2[j], list3[k], list4[m]));
                        } else {
                            return res;
                        }
                    }
                }
            }
        }
        return res;
    }
}
