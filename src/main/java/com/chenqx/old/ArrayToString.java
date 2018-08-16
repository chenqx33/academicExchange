package com.chenqx.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cqx
 * @date 2018/3/23 16:10
 */
public class ArrayToString {
    public static void main(String[] args) {
        String[] str = {"a","b","c"};
        List<String> s = new ArrayList();
        s.add("1");
        s.add("1");
        s.add("1");
        s.add("1");
        s.add("1");
        s.add("1");
        System.out.println(s.toArray()[1]);
        String str2=String.join("-",str);
        System.out.println(str2);
        String str3 = Arrays.stream(str).collect(Collectors.joining("-"));
        System.out.println(str3);
        String str4 = Arrays.stream(str).collect(Collectors.joining());
        System.out.println(str4);
        String str5 = Arrays.stream(str).collect(Collectors.joining(",","{","}"));
        System.out.println(str5);

    }
}
