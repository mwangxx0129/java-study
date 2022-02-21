package com.xinxin.algo.basic.tiktok;


public class Solution {
    public static void main(String[] args) {
        int [] res = starAndBars(new int[] {1, 2, 2, 2, 1}, new int[] {2, 7, 8, 9, 4}, "**|*|**|*****|**");
        System.out.println("======");
        for(int e : res) {
            System.out.println(e);
        }
    }


    public static int[] starAndBars(int[] startIndex, int[] endIndex, String s) {
        int n = startIndex.length;
        int[] res = new int[n];

        // step1: get presum of bar
        int[] prefixSum = new int[s.length()];
        int lastVal = 0;
        for (int i = 0; i < s.length(); ++ i) {
            prefixSum[i] = s.charAt(i) == '|' ? ++ lastVal: lastVal;
        }

        // step2
        for (int i = 0; i < n; ++ i) {
            int left = -1, right = -1;

            if (s.charAt(startIndex[i] - 1) == '|') {
                left = startIndex[i] - 1;
            } else {
                left = findFirstIndexOfTarget(prefixSum, prefixSum[startIndex[i] - 1] + 1, startIndex[i] - 1 ,endIndex[i] - 1);
            }

            if (s.charAt(endIndex[i] - 1) == '|') {
                right = endIndex[i] - 1;
            } else {
                right = findLastIndexOfTarget(prefixSum, prefixSum[endIndex[i] - 1] - 1, startIndex[i] - 1 ,endIndex[i] - 1);
            }

            // step3
            if (left == -1 || right == -1) {
                res[i] = 0;
            } else {
                res[i] = right - left - (prefixSum[right] - prefixSum[left]);
            }
        }

        return res;
    }

    public static int findFirstIndexOfTarget(int[] array, int target, int first, int last) {
        int l = first, r = last;
        System.out.println("findFirstIndexOfTarget target = " + target);
        while (l + 1 < r) {
            int m = (l + r) / 2;
            if (array[m] < target) {
                l = m;
            } else {
                r = m;
            }
            System.out.println(l);
            System.out.println(r);
        }
        if (array[l] == target) {
            return l;
        }
        if (array[r] == target) {
            return r;
        }
        return -1;
    }

    public static int findLastIndexOfTarget(int[] array, int target, int first, int last) {
        System.out.println("findLastIndexOfTarget target = " + target);
        int l = first, r = last;
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (array[m] > target) {
                r = m;
            } else {
                l = m;
            }
        }
        if (array[r] == target) {
            return r;
        }

        if (array[l] == target) {
            return l;
        }
        return -1;
    }
}
