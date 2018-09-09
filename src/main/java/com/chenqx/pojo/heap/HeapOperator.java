package com.chenqx.pojo.heap;

import java.util.Arrays;

/**
 * 二叉堆本质上是一种完全二叉树，它分为两个类型：最大堆，最小堆
 * 本类采用的是最小堆（都是用数组来存储）
 *
 * url https://mp.weixin.qq.com/s/cq2EhVtOTzTVpNpLDXfeJg 文中有两个错误
 * 我在下面评论：
 * 仔细的看完了，有收获，代码也跑了。有两个小问题。
    buildHead方法里面我觉得应该如下：
    for (int i = (array.length - 2) / 2; i >= 0; i--) {
        downAdjus(array, i, array.length);
    }
    1.因为最后一个非叶子节点的下标不是array.length/2

    2. downAdjus传入的第三个参数应该是总长度，而不是最后一个元素的下标。为什么呢？因为downAdjus中的第一个if中的判断条件 childIndex+1<length
    而不是小于等于
 */
public class HeapOperator {

    /**
     * 上浮调整
     *
     * @param array 待调整的堆
     */
    public static void upAdjust(int[] array) {
        int childIndex = array.length - 1;
        int parentIndex = (childIndex - 1) / 2;
        //temp保存插入的叶子节点的值，用于最后赋值
        int temp = array[childIndex];
        while (childIndex > 0 && temp < array[parentIndex]) {
            //只需要给子节点赋值
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
        //确定好了位置再写入需要上浮的值
        array[childIndex] = temp;
    }

    /**
     * 下沉调整
     *
     * @param array       待调整的堆
     * @param parentIndex 要下沉的父节点的下标
     * @param length      保存堆的数组的长度
     */
    public static void downAdjus(int[] array, int parentIndex, int length) {
        //temp保存父节点的值，用于最后赋值
        int temp = array[parentIndex];
        //默认左儿子<右儿子（不一定存在）
        int minChildIndex = 2 * parentIndex + 1;
        while (minChildIndex < length) {
            //如果有右孩子，且有孩子小于做孩子的值，则定位到右孩子
            if (minChildIndex + 1 < length && array[minChildIndex + 1] < array[minChildIndex]) {
                minChildIndex++;
            }
            //如果父节点小于任何一个孩子的值，直接跳出
            if (temp <= array[minChildIndex]) {
                break;
            }
            //无需真正的交换，同上浮
            array[parentIndex] = array[minChildIndex];
            parentIndex = minChildIndex;
            minChildIndex = parentIndex * 2 + 1;
        }
        array[parentIndex] = temp;
    }

    /**
     *
     * @param array
     */
    public static void buildHeap(int[] array) {
        //第一个i是最后一个非叶子节点，从最后一个非叶子节点开始，一次下沉调整
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            downAdjus(array, i, array.length);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,3,2,6,5,7,8,9,10,0};
        upAdjust(array);
        System.out.println(Arrays.toString(array));

        array = new int[] {7,1,3,10,5,2,8,9,6};
        buildHeap(array);
        System.out.println(Arrays.toString(array));
    }

}














