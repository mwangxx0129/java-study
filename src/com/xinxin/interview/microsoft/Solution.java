package com.xinxin.interview.microsoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String s = new String();
        Map map = new HashMap();
        Set set = new HashSet();
        System.out.println(26 & 0x1111);
    }


    public static boolean isCircle(List<String> list) {
        Map<Character, Node> graph = generateGraph(list);
        for (Node e: graph.values()) {
//            dfs(e, new HashSet<>(), );
        }
        return  false;
    }

    private static boolean dfs(Node start, Set<Node> isVisited, Node root) {
        if (start == root && isVisited.contains(start)) {
            return true;
        }
        // cycle in the middle
//        if (isVisited.contains(start)) {
//            return false;
//        }
        isVisited.add(start);

        for (Node nx : start.neighbors) {
//            if (isVisited.contains(nx))
            dfs(nx, isVisited, root);
        }

        isVisited.remove(isVisited.size() - 1);
        return false;
    }

    private static Map<Character, Node> generateGraph(List<String> list) {
        Map<Character, Node> map = new HashMap<>();
        // create nodes
        for (String e: list) {
            map.put(e.charAt(0), new Node(e.charAt(0)));
            map.put(e.charAt(e.length() - 1), new Node(e.charAt(e.length() - 1)));
        }

        // create edges
        for (String e: list) {
            Character begin = e.charAt(0);
            Character end = e.charAt(e.length() - 1);
            map.get(begin).neighbors.add(map.get(end));
        }
        return map;
    }

    static class Node {
        Character val;
        List<Node> neighbors;
        Node(char val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }
    }
    // f->k, kxxf
    // f -> new Node(f)
    // k -> new Node(k)

    // new Node(f).[].add()
}
