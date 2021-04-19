package com.xinxin.algo.basic;

import java.util.LinkedList;
import java.util.Stack;

public class Class3 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(6);
        stack.push(2);
        stack.push(4);
        stack.push(7);
        stack.push(9);

//        stackWith3Stack(stack);
        sortStackWith2Stack(stack);
        System.out.println(stack);
    }

//    class Deque {
//        Stack<>
//    }

    private static void sortStackWith2Stack(Stack<Integer> stack1) {
        Stack<Integer> stack2 = new Stack<>();

        int bottomSize = 0;

        while (bottomSize < stack1.size()) {

            int max = Integer.MIN_VALUE;
            int count = 0;
            while (!stack1.isEmpty() && stack1.size() > bottomSize) {
                int val = stack1.pop();
                if (val > max) {
                    max = val;
                    count = 1;
                } else if (val == max) {
                    ++count;
                } else {
                    stack2.push(val);
                }
            }

            for (int i = 0; i < count; ++i) {
                stack1.push(max);
            }
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            bottomSize += count;
        }
    }

    private static void stackWith3Stack(Stack<Integer> stack1) {
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();


        for (int round = 1; round < stack1.size(); round *= 2) {
            int m = 0, n = 0;
            while (!stack1.isEmpty()) {
                m = 0;
                n = 0;
                for (int i = 0; i < round && !stack1.isEmpty(); ++i) {
                    stack2.push(stack1.pop());
                    ++ m;
                }

                for (int i = 0; i < round && !stack1.isEmpty(); ++i) {
                    stack3.push(stack1.pop());
                    ++ n;
                }
            }

            merge(stack1, stack2, stack3, m, n, round);
        }

    }

    private static void merge(Stack<Integer> stack1, Stack<Integer> stack2, Stack<Integer> stack3,
                              int m, int n, int round) {


        for (int i = 0, j = 0; i < m || j < n;) {
            if (j >= n || (i < m && stack2.peek() > stack3.peek())) {
                stack1.push(stack2.pop());
                ++ i;
            } else {
                stack1.push(stack3.pop());
                ++ j;
            }
        }

        while (!stack2.isEmpty()) {
            for (int i = 0, j = 0; i < round || j < round;) {
                if (j == round || (i < m && stack2.peek() > stack3.peek())) {
                    stack1.push(stack2.pop());
                    ++ i;
                } else {
                    stack1.push(stack3.pop());
                    ++ j;
                }
            }

        }

    }
}
