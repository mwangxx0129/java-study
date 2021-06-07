package com.xinxin.algo.basic.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class XXMath {
//    https://hjweds.gitbooks.io/leetcode/content/95-percentile.html
    public static void main(String[] args) {
        int[] A = new int[] {1,2,3,4,5,6,7,8,9};
        int b = 3;
        new XArrayList(A);

        List res = Arrays.asList(A);

//        ArrayList<int>
        System.out.println(res.get(0).getClass());
        System.out.println(res.get(0) instanceof Object);
        System.out.println(Integer.class);

    }

    private static class XArrayList<E> {
        E a;

        XArrayList(E var1) {

            this.a = Objects.requireNonNull(var1);
//            System.out.println("constructor=" + var1[0].getClass());
            System.out.println(a.getClass());
//            System.out.println(a[0].getClass());
        }
        public static <T> XArrayList<T> asList(T... var0) {
            XArrayList res = new XArrayList(var0);
            System.out.println("asList=" + var0.getClass());
            return res;
        }
    }

    public static void testDedup() {
        int[] arr = new int[] {0,8};

//        Arrays.stream(dedup(arr)).forEach(System.out::println);
//        Arrays.stream(dedupIV(arr)).forEach(System.out::println);
//        getLargeAndSmall(arr, 0, arr.length - 1);
        getLargestAndSecond(arr, 0, arr.length - 1);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);

    }

    public static void getLargestAndSecond(int[] A, int start, int end) {
        List<Integer> res = dfs(A, 0, A.length - 1);
        System.out.println(res.get(0));
    }

    public static List<Integer> dfs(int[] A, int start, int end) {
        if (start >= end) {
            return new ArrayList<>(Arrays.asList(A[start]));
        }
        int mid = (start + end) >>> 1;
        List<Integer> left = dfs(A, start, mid);
        List<Integer> right = dfs(A, mid + 1, end);

        if (left.get(0) < right.get(0)) {
            right.add(left.get(0));
            return right;
        } else {
            left.add(right.get(0));
            return left;
        }
    }

    public static void getLargeAndSmall(int[] A, int start, int end) {
        if (start + 1 >= end) {
            if (A[start] > A[end]) {
                swap(A, start, end);
            }
            return;
        }
        if (start >= end) {
            return;
        }

        int l = start, r = end;
        for (; l + 1 < r; ++l, --r ) {
            if (A[l] > A[r]) {
                swap(A, l, r);
            }
        }

        if (start == 0) getLargeAndSmall(A, start, r);
        if (end == A.length - 1) getLargeAndSmall(A, r, end);
    }


    public static void swap(int[] A, int l, int r) {
        int tmp = A[l];
        A[l] = A[r];
        A[r] = tmp;
    }

    public static int[] dedupIV(int[] array) {
        int slow = 0;
        for (int fast = 0; fast < array.length; ) {
            if (slow == 0 || array[slow - 1] != array[fast]) {
                array[slow++] = array[fast++];
                continue;
            }
            while (fast < array.length && array[slow - 1] == array[fast]) {
                ++ fast;
            }
            -- slow;
        }
        return Arrays.copyOf(array, slow );
    }

    public static int[] dedupIII(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int index = 0, slow = 0;
        for (int i = 1; i < array.length; ++ i) {
            if (array[i] == array[slow]) {
                continue;
            }

            if (slow + 1 == i) {
                array[index++] = array[slow];
            }
            slow = i;
        }

        if (slow == array.length - 1) {
            array[index++] = array[array.length - 1];

        }
        return Arrays.copyOf(array, index);

    }

    public static int[] dedupII(int[] array) {
        if (array.length <= 2) {
            return array;
        }

        int index = 2;
        for (int i = 2; i < array.length; ++ i) {
            if (array[i] != array[index - 2]) {
                array[index ++] = array[i];
            }
        }
        return Arrays.copyOf(array, index);
    }

    public static int[] dedup(int[] array) {
        if (array.length <= 1) return array;
        int index = 1;
        for (int i = 1; i < array.length; ++ i) {
            if (array[i] != array[index - 1]) {
                array[index ++ ] = array[i];
            }
        }
        return Arrays.copyOf(array,index);
    }


    public static void testPercentile95() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; ++ i) {
            list.add(i + 1);
        }
        System.out.println(percentile95(list));
    }

    public static int percentile95(List<Integer> lengths) {
        int[] bucket = new int[4097];
        int count5 = (int)(lengths.size() * 0.05);
        for (int e : lengths) {
            ++ bucket[e];
        }
        int len = 4097;
        int num = 0;
        while (num <= count5) {
            num += bucket[-- len];
        }
        return len;
    }
}
