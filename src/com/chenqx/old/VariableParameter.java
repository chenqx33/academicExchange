package com.chenqx.old;

/**
 * @author cqx
 * @date 2018/3/23 15:58
 */
public class VariableParameter {
    public static void main(String... args) {

        System.out.println(aa("a","b","c"));
    }
    public static String aa(String... a){
        StringBuilder sb = new StringBuilder();
        for (String b: a){
            sb.append(b);
        }
        return sb.toString();
    }
}
