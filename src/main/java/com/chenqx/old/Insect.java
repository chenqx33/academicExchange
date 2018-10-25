package com.chenqx.old;

public class Insect {
    int i = 9;
    int j;

    public Insect() {
        prt("i =" + "j = " + j);
        j = 39;
    }

    static int x1 = prt("Static Insrct.x1 initialized");

    static int prt(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {

    static int k = prt("Beetle.k initialized");

    public Beetle() {
        prt("k = " + k);
        prt("j = " + j);
    }

    static int x2 = prt("static Beetle.x2 initialized");

    static int prt(String s) {
        System.out.println(s);
        return 63;
    }

    public static void main(String[] args) {
        prt("Beetle constructor");
        Beetle b = new Beetle();
    }
}
//Beetle consturctor
//    Static Insrct.x1 initialized
//Beetle.k initialized
//        i = j = 0
//k=63
//j=39


