package com.xinxin.algo.basic;

import java.util.ArrayList;
import java.util.List;

public class Class7 {

    public static void main(String[] args) {
        System.out.println(removeSpace("    a b    c  "));

        System.out.println(removeCertainChars("rtyuibyugagff", "abcdr"));

        subsets(new int[] {1,2,3});
    }

    public static int laiOffer(int[]  arr) {
        int neg = 0;
        for (int e : arr) {
            if (e < 0) {
                ++ neg;
            } else if (e == 0) {
                return 0;
            }
        }
        return neg % 2 == 0 ? 1 : -1;
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ddfs(nums, 0, res, new ArrayList<Integer>());
        return res;
    }

    public static void dfs(int[] nums, int start, List<List<Integer>> res, List<Integer> sub) {

        res.add(new ArrayList<>(sub));
        for (int i = start; i < nums.length; ++ i) {
            sub.add(nums[i]);
            dfs(nums, i + 1, res, sub);
            sub.remove(sub.size() - 1);
        }



    }

    public static  void ddfs(int[] nums, int start, List<List<Integer>> res, List<Integer> sub) {
        if (start == nums.length) {
            res.add(new ArrayList<>(sub));
            return;
        }

        dfs(nums, start + 1, res, sub);

        sub.add(nums[start]);
        dfs(nums, start + 1, res, sub);
        sub.remove(sub.size() - 1);
    }

    private static String removeSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c != ' ') {
                sb.append(c).append(" ");
            }
        }
        sb.setLength(sb.length() - 1);

        return sb.toString().trim();
    }

    private static String removeCertainChars(String s, String t) {
        StringBuilder sb = new StringBuilder();
        int[] map = new int[256];
        for (char c : t.toCharArray()) {
            map[c] = 1;
        }

        for (char c : s.toCharArray()) {
            if (map[c] != 1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
