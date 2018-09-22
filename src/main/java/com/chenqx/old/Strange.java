package com.chenqx.old;

/**
 * @author cqx
 * @date 2018/3/27 16:42
 */
public class Strange {
    public static void main(String[] args) {
        Object helo = helo();
        String[] s = new String[]{"f", "m"};
        System.out.println(helo(s));
    }

    public static String helo(String... str) {
        System.out.println(str==null);
        return str[1];

    }
}
