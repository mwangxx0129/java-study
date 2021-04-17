package com.xinxin.algo.basic;

import java.util.Arrays;

public class Class2 {
    public static void main(String[] args) {
        System.out.println(power(0, 10));
        int[] A = {1,2,2,3,4,5};
//        Arrays.binarySearch();
    }

    public static int[] kCloset(int[] A, int target, int k) {
        int[] res = new int[k];
        int l = closet(A, target);
        int r = l + 1;
        for (int i = 0; i < k; ++ i) {
            int rDiff = r == A.length ? Integer.MAX_VALUE : Math.abs(A[r] - target);
            int lDiff = l == -1 ? Integer.MIN_VALUE : Math.abs(A[l] - target);
            if (lDiff <= rDiff) {
                res[i] = A[l];
                -- l;
            } else {
                res[i] = A[r];
                ++ r;
            }
        }
        return res;
    }

    public static int closet(int[] A, int target) {
        int l = 0, r = A.length - 1;
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (A[m] < target) {
                r = m;
            } else {
                l = m;
            }
        }

        return Math.abs(A[l] - target) < Math.abs(A[r] - target) ? l : r;
    }

    public static long power(int a, int b) {
        if (b == 0) return 1L;
        if (a == 0) return 0L;
        return power(a, b - 1) * a;
    }

    public static int binarySearchI(int[] A, int left, int right, int target) {
        if (A == null || A.length == 0) return -1;

        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (A[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (A[left] == target) return right;
        else if (A[right] == target) return left;
        else return -1;
    }

    public static int binarySearch(int[] A, int target) {
        if (A == null || A.length == 0) return -1;
        int left = 0, right = A.length - 1;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (A[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (A[left] == target) return left;
        if (A[right] == target) return right;
        return -1;
    }
}
