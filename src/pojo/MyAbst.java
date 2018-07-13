package pojo;

import java.util.List;

/**
 * @author cqx
 * @date 2018/7/13 10:26
 */
public class MyAbst implements MyIntegerface{


    @Override
    public void print(Object str) {
        System.out.println("Abset-->"+str);
    }

    @Override
    public void printAll(List lists) {
        lists.forEach(this::print);
    }
}
