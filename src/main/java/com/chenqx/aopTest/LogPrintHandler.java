package com.chenqx.aopTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogPrintHandler implements InvocationHandler {
    private Object target;

    public LogPrintHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行AOP织入的代码!!!");
        Object ret = method.invoke(this.target, args);
        return ret;
    }
}
