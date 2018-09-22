package com.chenqx.pojo.algorithm;

import java.util.Map;

public class ClimbingStairs2 {
    public int getClimbingWays(int n, Map<Integer, Integer> map) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int value = getClimbingWays(n - 1, map) + getClimbingWays(n - 2, map);
        map.put(n, value);
        return value;
    }
}
