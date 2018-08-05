package com.chenqx.pojo.annotataion;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author cqx
 * @date 2018/7/20 17:47
 */
public class UserCaseTest {
    public static void main(String[] args) {
        List<Integer> userCasses = new ArrayList<>();
        Collections.addAll(userCasses,47,48,49,50);
        trackUseCases(userCasses,PassWordUtils.class);
    }
    public static void trackUseCases(List<Integer> useCases,Class<?> c1){
        for (Method m : c1.getDeclaredMethods()) {
            //获得注解的对象
            UserCase.UserCases uc = m.getAnnotation(UserCase.UserCases.class);
            if (uc != null) {
                System.out.println("Found Use Case:" + uc.id() + " "
                        + uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
        for (int i : useCases) {
            System.out.println("Warning: Missing use case-" + i);
        }
    }
}
