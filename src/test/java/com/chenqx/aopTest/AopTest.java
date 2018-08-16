package com.chenqx.aopTest;

import org.junit.Test;

import java.lang.reflect.Proxy;

//https://blog.csdn.net/csujiangyu/article/details/53455094ClassPool
public class AopTest {
    //JDK动态代理
    @Test
    public void test(){
        BarService service = (BarService) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class[]{BarService.class},
                new LogPrintHandler(new BarServiceImp()));
        service.doSomething();
    }

    //动态代码字节生成
    @Test
    public void test2(){

    }
    //自定义类加载器
    @Test
    public void test3(){

    }

}
