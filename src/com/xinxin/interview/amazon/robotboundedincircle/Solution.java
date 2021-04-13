package com.xinxin.interview.amazon.robotboundedincircle;

import java.util.Stack;

public class Solution {
    private final static int[][] direction = {
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
    };

    private final int turn(final int currentDirection, final char orientation) {
        return (currentDirection + (orientation == 'L' ? 1 : 3)) % 4;
    }

    private final int[] move(final int[] currentPosition, final int currentDirection) {
        return new int[] {
                currentPosition[0] + direction[currentDirection][0],
                currentPosition[1] + direction[currentDirection][1]
        };
    }

    public boolean isRobotBounded(final String instructions) throws Exception{
        int[] vector = {0, 0};
        int currentDirection = 0;
        for (char c : instructions.toCharArray()) {
            if (c == 'G') {
                vector = this.move(vector, currentDirection);
            } else if (c == 'L' || c == 'R') {
                currentDirection = turn(currentDirection, c);
            } else {
                throw new UnsupportedOperationException("Invalid instructions, only accept G, L, R");
            }
        }
        return (vector[0] == 0 && vector[1] == 0) || currentDirection != 0;
    }
}
