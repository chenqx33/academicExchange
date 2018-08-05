package com.chenqx.old;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cqx
 * @date 2018/3/29 20:34
 */
public class HashMapTest {
    public static void main(String[] args) {
        System.out.println("Ea".hashCode());  // 165374702
        System.out.println("FB".hashCode()); //  165374702
        Map a = new HashMap();
        a.put("Ea","1");
        a.put("FB","2");
        System.out.println(a.toString());
    }
}
