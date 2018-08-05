package com.chenqx.old;

/**
 * @author cqx
 * @date 2018/3/29 11:33
 */
public class ThisTest {
    public static void main(String[] args) {
    Zi zi = new Zi();
    zi.show();
    }
}

class Fu {
    public String name = "heihie";

    void sout(){
        System.out.println("fu");
    }
    void show() {
        System.out.println(this);
        System.out.println(this.name);
        this.sout();
    }
}

class Zi extends Fu {
    @Override
    void sout() {
        System.out.println("zi");
    }

    public String name = "haha";
}