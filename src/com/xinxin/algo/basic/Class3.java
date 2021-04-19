package com.xinxin.algo.basic;

import java.util.LinkedList;
import java.util.List;
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


        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        partition(n1, 3);

    }

    static class ListNode {
        int value;
        ListNode next;
        ListNode(int val) {
            this.value = val;
        }
    }
    static ListNode partition (ListNode head, int target) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode h1 = dummy1, h2 = dummy2;
        while (head != null) {
            if (head.value < target) {
                h1.next = head;
                h1 = h1.next;
            } else {
                h2.next = head;
                h2 = h2.next;
            }
            head = head.next;
        }
        h2.next = null;
        h1.next = dummy2.next;
        return dummy1.next;
    }

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
