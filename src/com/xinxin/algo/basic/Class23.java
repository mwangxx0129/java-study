package com.xinxin.algo.basic;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class23 {
    public static void main(String[] args) {
        // [1,2,3]  [1,2,3]
        // list of list [[1,2,3],[1,2,3]]
        // set of list [[1,2,3]]
        List<List<Integer>> input = new ArrayList<>();
        List<Integer> sub1 =  new ArrayList<>();
        sub1.add(1);
        sub1.add(2);
        sub1.add(3);


        List<Integer> sub2 = new ArrayList<>();
        sub2.add(1);
        sub2.add(2);
        sub2.add(3);

        input.add(sub1);
        input.add(sub2);

        System.out.println(sub1.equals(sub2));

        Set<List<Integer>> set = new HashSet<>(input);
        System.out.println(set);

        Deque q = new ArrayDeque();
        Queue qq = new PriorityQueue();
    }

    public List<List<Integer>> allPairsII(int[] array, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Set<String> isVisited = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; ++ i) {
            int t = target - array[i];
            if (set.contains(t) && isVisited.add((Math.min(t, array[i])+ "#" + Math.max(t, array[i])))) {
                    List<Integer> sub = new ArrayList<>();
                    sub.add(t);
                    sub.add(array[i]);
                    res.add(sub);
            }
            set.add(array[i]);
        }

        return res;
    }

    public List<List<Integer>> allPairs(int[] array, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < array.length; ++ i) {
            List<Integer> targetVal = map.getOrDefault(target - array[i], new ArrayList<>());
            for (int index : targetVal) {
                List<Integer> sub = new ArrayList<>();
                sub.add(index);
                sub.add(i);
                res.add(sub);
            }

            List<Integer> val = map.getOrDefault(array[i], new ArrayList<>());
            val.add(i);
            map.put(array[i], val);
        }

        return res;
    }

    public List<String> validParenthesesIII(int l, int m, int n) {
        List<String> res = new ArrayList<>();
        dfs(new int[] {l, l, m, m, n, n}, "{}<>()", "", new Stack<>(), res, 2 * (l + m + n));
        return res;
    }

    private void dfs(int[] counts, String src, String path, Stack<Integer> stack, List<String> res, int len) {
        if (path.length() == len) {
            res.add(path);
            return;
        }

        int index = stack.isEmpty() ? 0 : stack.peek();
        // match right
        if (!stack.isEmpty()) {
            stack.pop();
            dfs(counts, src, path + src.charAt(index + 1), stack, res, len);
            stack.push(index);
        }

        // add left
        index = stack.isEmpty() ? 0 : (stack.peek() + 2);
        for (int i = index; i < counts.length; i+=2) {
            if (counts[i] <= 0) continue;
            stack.push(i);
            -- counts[i];
            dfs(counts, src, path + src.charAt(i), stack, res, len);
            ++ counts[i];
            stack.pop();
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, nums, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int start, int[] nums, List<Integer> sub, List<List<Integer>> res) {
        if (sub.size() == nums.length) {
            res.add(new ArrayList(Arrays.asList(nums)));
            return;
        }

        for (int i = start; i < nums.length; ++ i) {
            swap(nums, start, i);
            // sub.add(nums[i]);
            dfs(i + 1, nums, sub, res);
            // sub.remove(sub.size() - 1);
            swap(nums, start, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    //    5
    // 2     11
    //     6    14

    // inOrder = [2, 5, 6, 11, 14]
    // levelOrder = [5,2,11,6,14]
    public TreeNode reconstruct(int[] inOrder, int[] levelOrder) {
        return dfs(inOrder, levelOrder, 0, inOrder.length - 1);
    }

    private TreeNode dfs(int[] inOrder, int[] levelOrder, int start, int end) {
        if (start > end) {
            return null;
        }

        if (start == end) {
            return new TreeNode(inOrder[start]);
        }

        return null;

    }

    public int largestSmaller(TreeNode root, int target) {
        int result = Integer.MIN_VALUE;
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val >= target) {
                cur = cur.left;
            } else {
                result = cur.val;
                cur = cur.right;
            }
        }
        return result;
    }

    class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public int[] mergeSortedList(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int[] res = new int[m + n];
        int i = 0, j = 0, index = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                res[index] = a[i];
                ++ i;
            } else {
                res[index] = b[j];
                ++ j;
            }
        }

        while (i < m) {
            res[index] = a[i];
            ++ i;
        }

        while (j < n) {
            res[index] = a[j];
            ++ j;
        }
        return res;
    }

    private static int countWord(String s) {
        return s.trim().split("//s+").length;
    }

    private static boolean isValid(byte[] arr, int p, int target, int count) {
        // 0 1 2 3 4 5
        while (arr.length >= count + count && count != 0) {
            if (arr[p] == target)
                -- count;
            ++ p;
        }
        return count == 0;
    }

    private static void dfs(int start, String word, List<String> res, StringBuilder sb) {
        if (start == word.length()) {
            res.add(sb.toString());
            return;
        }

        if (word.charAt(start) == '?') {
            sb.append("0");
            dfs(start + 1, word, res, sb);
            sb.setLength(sb.length() - 1);

            sb.append("1");
            dfs(start + 1, word, res, sb);
            sb.setLength(sb.length() - 1);
        } else {
            sb.append(word.charAt(start));
            dfs(start + 1, word, res, sb);
            sb.setLength(sb.length() - 1);

        }
    }

}
