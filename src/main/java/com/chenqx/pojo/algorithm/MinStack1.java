package com.chenqx.pojo.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MinStack1 {
    private List<Integer> data = new ArrayList<Integer>();

    public void push(int num) {
        data.add(num);
    }

    public int pop() {
        // 栈空，异常，返回-1
        if (data.size() == 0) {
            return -1;
        }
        return data.remove(data.size() - 1);
    }

    public int getMin(){
        return 0;
    }
}
