package com.chenqx.old;

public class Dogs {
    Dog d1;
    Dog d2;
    {
        d1 = new Dog(1);
        d2 = new Dog(2);
        System.out.println("d1 & d2 initialized");
    }
    Dogs(){
        System.out.println("Dogs()");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Dogs d = new Dogs();
    }
}
//Dogs()
//Dog(1)
//Dogs()
//Dog(2)
//d1 & d2 initialized
//Insid main()


class Dog{
    Dog(int marker){
        super();
        System.out.println("Dog("+marker+")");
    }
    void f(int marker){
        System.out.println("f("+marker+")");
    }
}
