package com.xinxin.interview.amazon.cloudfrontcaching;

public class Solution {

    public double costEvaluation(int n, int[][] connections) {
        UF uf = new UF(n);
        for (int[] e : connections) {
            uf.union(e[0], e[1]);
        }

        double res = 0;
        for (int i = 0; i < n; ++ i) {
            if (uf.father[i] == i) {
                res += Math.sqrt(uf.group[i]);
            }
        }
        return res;
    }

    class UF {
        int [] father;
        int [] group;

        UF(int n) {
            father = new int[n];
            group = new int[n];
            for (int i = 0; i < n; ++ i) {
                father[i] = i;
                group[i] = 1;
            }
        }

        public int find(int x) {
            int fa = father[x];
            if (fa == x) return fa;
            return father[x] = find(fa);
        }

        public void union(int a, int b) {
            int fa = find(a);
            int fb = find(b);
            if (fa != fb) {
                father[fb] = fa;
                group[fa] += group[fb];
            }
        }
    }

}
