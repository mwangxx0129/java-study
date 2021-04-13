package com.xinxin.interview.amazon.robotboundedincircle;

import java.util.Stack;

public class Solution {
    private final static int[][] directions = {
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
    };

    // For undo operation
    //  Store position
    Stack<int[]> positionHistory = new Stack();
    //  Store direction
    Stack<Integer> directionHistory = new Stack();

    private final int turn(final int currentDirection, final char orientation) {
        return (currentDirection + (orientation == 'L' ? 1 : 3)) % 4;
    }

    private final int[] move(final int[] position, final int direction) {
        return new int[] {
                position[0] + directions[direction][0],
                position[1] + directions[direction][1]
        };
    }

    private final void record(final int[] currentPosition, final int currentDirection) {
        positionHistory.add(currentPosition);
        directionHistory.add(currentDirection);
    }

    private final void undo() {
        if (positionHistory.isEmpty()) {
            throw new UnsupportedOperationException("Invalid undo");
        } else {
            positionHistory.pop();
        }

        if (directionHistory.isEmpty()) {
            throw new UnsupportedOperationException("Invalid undo");
        } else {
            directionHistory.pop();
        }
    }

    public boolean isRobotBounded(final String instructions) throws UnsupportedOperationException{
        int[] vector = {0, 0};
        int direction = 0;


        for (char c : instructions.toCharArray()) {
            if (c == 'G') {
                vector = this.move(vector, direction);
                record(vector, direction);
            } else if (c == 'L' || c == 'R') {
                direction = turn(direction, c);
                record(vector, direction);
            } else if (c == 'U') {
                undo();
                vector = positionHistory.peek();
                direction = directionHistory.peek();
            } else {
                throw new UnsupportedOperationException("Invalid instructions, only accept G, L, R");
            }
        }
        return (vector[0] == 0 && vector[1] == 0) || direction != 0;
    }
}
