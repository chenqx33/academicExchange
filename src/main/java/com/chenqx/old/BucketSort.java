package com.chenqx.old;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cqx
 * @date 2018/7/3 19:32
 */
public class BucketSort {

    public static void main(String[] args) {

        int[] a = {1, 2, 4, 5, 63, 1, 5, 56, 12, 34, 57, 2, 6, 56, 100};
        int[] aa = new int[101];
        for (int i = 0; i < aa.length; i++) {
            aa[i] = 0;//初始化桶
        }
        List<String> aaa = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            //这样就分别把这个数组中的数分到了对应的地方
            //根据分数，找到和分数相同的编号的桶，并且把小球放入桶内
            aa[a[i]] = aa[a[i]] + 1;
        }
        for (int i = 0; i < aa.length; i++) {
            if (aa[i] != 0) {
                for (int j = 0; j < aa[i]; j++) {
                    aaa.add(i + "");
                }
            }
        }
        System.out.println("--最终的排序是-----" + aaa.toString());

    }
}