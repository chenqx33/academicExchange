package com.chenqx.pojo.algorithm;

public class Mining {
    public int getMostGold(int n, int w, int[] g, int[] p) {
        int[] preResults = new int[p.length];
        int[] results = new int[p.length];
        //填充边界格子的值
        for (int i = 0; i <= w; i++) {
            if (i < p[0]) {
                preResults[i] = 0;
            } else {
                preResults[i] = g[0];
            }
        }
        //填充其他格子的值,外层循环的是金矿数量，内层是工人数
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= w; j++) {
                if (j < p[i]) {
                    results[j] = preResults[j];
                } else {
                    results[j] = Math.max(preResults[j], preResults[j - p[i]] + g[i]);
                }
                preResults = results;
            }
        }
        return results[n];

    }
}
