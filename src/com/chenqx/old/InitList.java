package com.chenqx.old;

import java.util.Arrays;
import java.util.List;

/**
 * @author cqx
 * @date 2018/3/15 15:25
 */
public class InitList {
       public static void main(String[] args) {
        List<String> name = Arrays.asList("xxx","yyy","zzz");
        //name.add("aaa");   //这么初始化不支持增加元素
        name.forEach(System.out::println);
    }
}
