package com.xinxin.algo.basic.amazon;

import java.util.PriorityQueue;

public class GroupCluster {
    public static void main(String[] args) {
        int res = maxSustainableCluster(new int[] {3,6,1,3,4}, new int[] {2,1,3,4,5}, 25);
        System.out.println(res);
    }

    // 3,6,1,3,4
    public static int maxSustainableCluster(int[]  bootingPower, int[] processingPower, int powerMax) {
        int n = bootingPower.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        int[] preSum = new int[n+1];
        for (int i = 1; i < n; ++ i) {
            preSum[i] = preSum[i - 1] + processingPower[i];
        }

        int start = 0;
        int end = 0;
        int maxGroupSize = 0;

        while (start <= end && end < n) {
            maxHeap.add(bootingPower[end]);
            int maxBootingPower = maxHeap.peek();
            int curPower = maxBootingPower + (preSum[end + 1] - preSum[start]) * (end - start + 1);
            if (curPower <= powerMax) {
                maxGroupSize = Math.max(maxGroupSize, end - start + 1);
                ++ end;
            } else {
                maxHeap.remove(bootingPower[start]);
                ++ start;
            }
        }
        return maxGroupSize;
    }
}
