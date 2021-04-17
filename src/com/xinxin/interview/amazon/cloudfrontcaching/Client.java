package com.xinxin.interview.amazon.cloudfrontcaching;

public class Client {
    public static void main(String[] args) {
        Solution solution = new Solution();
        double res = solution.costEvaluation(7, new int[][]{
                {0, 1},
                {1, 2},
                {5, 4},
                {5,6}
        });
        System.out.println(res);

    }
}
