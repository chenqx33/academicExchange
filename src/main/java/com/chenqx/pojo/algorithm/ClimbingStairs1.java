package com.chenqx.pojo.algorithm;

public class ClimbingStairs1 {

    public int getClimbingWays(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return getClimbingWays(n - 1) + getClimbingWays(n - 2);
    }
}
