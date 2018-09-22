package com.chenqx.pojo.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MinStack2 {
    private List<Integer> data = new ArrayList<Integer>();
    private List<Integer> mins = new ArrayList<Integer>();

    public void push(int num) {
        data.add(num);
        if(mins.size() == 0) {
            // 初始化mins
            mins.add(num);
        } else {
            // 辅助栈mins每次push当时最小值
            int min = getMin();
            if (num >= min) {
                mins.add(min);
            } else {
                mins.add(num);
            }
        }
    }

    public int pop() {
        // 栈空，异常，返回-1
        if(data.size() == 0) {
            return -1;
        }
        // pop时两栈同步pop
        mins.remove(mins.size() - 1);
        return data.remove(data.size() - 1);
    }

    public int getMin() {
        // 栈空，异常，返回-1
        if(mins.size() == 0) {
            return -1;
        }
        // 返回mins栈顶元素
        return mins.get(mins.size() - 1);
    }
}
