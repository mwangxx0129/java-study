package com.xinxin.algo.basic;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
//        int[] A = {8,6,1,2,2,2,3,4,9};
//        mergeSort(A, new int[A.length], 0, A.length - 1);
//
//        int[] res = quickSelect(A, 2, 0, A.length - 1);
//        System.out.println(res[0] + "\t" + res[1]);
//        quickSort(A, 0, A.length - 1);
//        for (int e : A) {
//            System.out.println(e);
//        }
        int[] array =  new int[]{1,3,4,2,5,2,1};
        rainBow(array, 5);
        System.out.println(Arrays.toString(array));
    }

    private static void rainBow(int[] A, int k) {
        if (A.length < 2) {
            return;
        }

        int left = 0;
        int right = A.length - 1;

        for (int round = 1; round <= k / 2; ++ round) {
            int LColor = round, RColor = k + 1 - round;
            System.out.println(round);
            for (int i = left; i <= right; ) {
                if (A[i] == LColor) {
                    swap(A, left, i);
                    ++ left;
                    ++ i;
                } else if (A[i] == RColor) {
                    swap(A, i, right);
                    -- right;
                } else {
                    ++ i;
                }
            }
        }
    }

    private static void quickSort(int[] A, int start, int end) {
        if (start >= end || start < 0 || end < 0 || start >= A.length || end >= A.length) {
            return;
        }
        int[] range = quickSelect(A, A[start], start, end);
        quickSort(A, start, range[0] - 1);
        quickSort(A, range[1] + 1, end);
    }

    private static int[] quickSelect(int[] A, int pivot, int l, int r) {

        int i = l;
        while ( i <= r) {
            if (A[i] < pivot) {
                swap(A, i, l);
                ++ l;
                ++ i;
            } else if (A[i] == pivot) {
                ++ i;
            } else {
                swap(A, i, r);
                -- r;
            }
        }
        return new int[] {l, r};
    }

    private static void swap(int[] A, int i, int j) {
        if (A[i] == A[j]) return;
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    private static void mergeSort(int[] A, int[] copy, int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(A, copy, start, mid);
        mergeSort(A, copy,mid + 1, end);

        int aStart = start, aEnd = mid, bStart = mid + 1, bEnd = end;
        int index = start;
        while (aStart <= aEnd && bStart <= bEnd) {
            if (A[aStart] <= A[bStart]) {
                copy[index ++ ] = A[aStart ++];
            } else {
                copy[index ++] = A[bStart ++];
            }
        }

        while (aStart <= aEnd) {
            copy[index ++] = A[aStart ++];
        }

        while (bStart <= bEnd) {
            copy[index ++] = A[bStart ++];
        }

        for (int i = start; i <= end; ++ i) {
            A[i] = copy[i];
        }

    }
}
