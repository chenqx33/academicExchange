package com.chenqx.pojo;

import java.util.List;

/**
 * @author cqx
 * @date 2018/7/13 10:24
 */
public interface MyIntegerface<E> {
    void print(E str);
    void printAll(List<E> lists);

}
