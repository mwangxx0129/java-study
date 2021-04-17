package com.xinxin.interview.amazon.shoppingoptions;

public class TwoPointerSolution {
    public static void main (String[] args) {
        int [] a = {1,2,3};
        int [] b = {5,6,7,8,9};
        int target = 7;
        int res = 0;


        for (int i = 0, j = b.length - 1; i < a.length && j >= 0; ++ i) {

            while(j >= 0 && b[j] + a[i] > target) j--;

            if (j != -1) res += (j + 1);

        }
        System.out.println(res);
    }
}
