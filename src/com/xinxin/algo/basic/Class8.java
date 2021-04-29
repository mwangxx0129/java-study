package com.xinxin.algo.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class8 {
    public static void main(String[] args) {
//        findAnagrams("cbaebabacd", "abc");
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
//        reorder(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
        validWordAbbreviation("internationalization", "i12iz4n");

    }

//    "internationalization"
//"i12iz4n"
    public static boolean validWordAbbreviation(String word, String abbr) {
        int index = 0;
        // int count = 0;

        for (int i = 0; i < abbr.length(); ++ i) {
            if (index >= word.length()) {
                return false;
            }


            char c = abbr.charAt(i);
            if (c < '0' || c > '9') {
                if (word.charAt(index ++) != c) {
                    return false;
                }
            } else {
                int count = 0;

                while (i < abbr.length() && c >= '0' && c <= '9') {
                    System.out.println(c);
                    count = c - '0' + count * 10;
                    ++ i;
                    c = abbr.charAt(i);
                }
                -- i;
                index += count;
                System.out.println(count);
            }
        }
        return index == word.length();
    }

    // 1,2,3,4,5,6 -> 1,4,2,5,3,6
    // 1,2,3, 4,5,6
    public static void reorder(int[] array, int l, int r) {
        if (l + 1 >= r ) return;

        int[] first = new int[2];
        int[] second = new int[2];
        int[] third = new int[2];
        int[] fourth = new int[2];

        int quarter = (r - l + 1) / 4;
        int half = (r - l + 1) / 2;

        System.out.println(half);

        first[0] = l;
        first[1] = l + quarter - 1;

        second[0] = first[1] + 1;
        second[1] = l + half - 1;

        third[0] = second[1] + 1;
        third[1] = third[0] + quarter - 1;

        fourth[0] = third[1] + 1;
        fourth[1] = r;

        // 3 swap second and third
        reverse(array, second[0], second[1]);
        reverse(array, third[0], third[1]);
        reverse(array, second[0], third[1]);

        reorder(array, l, l + quarter + third[1] - third[0]);
        reorder(array, l + quarter + third[1] - third[0] + 1, r);

        return;
    }

    private static void reverse(int[] array, int l, int r) {
        while (l < r) {
            int tmp = array[l];
            array[l] = array[r];
            array[r] = tmp;
            ++ l;
            -- r;
        }
    }

    private void swap(int[] array, int l, int r) {

    }


    public static List<Integer> findAnagrams(String s, String p) {
        if(p == null || p.length() == 0)
            return new ArrayList<Integer>();
        if(s == null || s.length() < p.length())
            return new ArrayList<Integer>();
        int count = 0;
        int[] map = new int[256];

        int n = p.length();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; ++ i) {
            if (map[p.charAt(i)]++ == 0) ++ count;
        }

        for (int i = 0; i < s.length(); ++ i) {

            if (i - n >= 0 && map[s.charAt(i - n)]++ == 0) ++ count;
            if (map[s.charAt(i)]-- == 1) -- count;
            if (count == 0) res.add(i - n + 1);
        }
        return res;

    }
}
