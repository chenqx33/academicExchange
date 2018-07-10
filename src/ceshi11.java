import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cqx
 * @date 2018/3/23 16:53
 */
public class ceshi11 {
    public static void main(String[] args) {


        B b = new B();
        A a = new A();
        b = (B) a;
    }


}


class A {
    public A() {
    }

    void show() {
        System.out.println("a");
    }


}

class B extends A {

    void show() {
        System.out.println("b");
    }

    public B() {
    }
}