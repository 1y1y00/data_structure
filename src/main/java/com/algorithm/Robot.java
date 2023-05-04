package com.algorithm;

public class Robot {

    public static boolean isRobotBounded(String instructions) {
        int[][] direc = {{0, 1},{1, 0}, {0, -1}, {-1, 0}};
        int direcIndex = 0;
        int x = 0, y = 0;
        int n = instructions.length();
        for (int idx = 0; idx < n; idx++) {
            char instruction = instructions.charAt(idx);
            if (instruction == 'G') {
                x = x + direc[direcIndex][0];
                System.out.println(x);
                y= y + direc[direcIndex][1];
                System.out.println(y);
            } else if (instruction == 'L') {
                direcIndex += 3;
                System.out.println(direcIndex);
                direcIndex %= 4;
                System.out.println(direcIndex);
            } else {
                direcIndex++;
                direcIndex %= 4;
            }
        }
        return direcIndex != 0 || (x == 0 && y == 0);
    }

    public static void main(String[] args) {
        String a = "GGLLGG";
        boolean robotBounded = isRobotBounded(a);
        System.out.println(robotBounded);
        // int[][] direc = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        // int i = direc[0][0];
        // int i1 = direc[0][1];
        // System.out.println(i);
        // System.out.println(i1);
    }

}
