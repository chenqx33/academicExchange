package com.chenqx.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GoShopping {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Integer> shoppingCart = new ArrayList<>(Arrays.asList(0, 0, 0));
    private static List<Integer> priceBook = new ArrayList<>(Arrays.asList(1, 2, 3));
    private static List<String> products = new ArrayList<>(Arrays.asList("买萝卜(1元/个)", "买橘子(2元/个)", "买菠萝(3元/个)"));

    public static void main(String[] args) {

        while (true) {
            System.out.println("请输入您的操作");
            System.out.println("1购物 2打印购物小票（结账）3放弃操作");
            switch (scanner.nextInt()) {
                case 1:
                    addToShoppingCart();
                    break;
                case 2:
                    payment();
                    break;
                case 3:
                    System.out.println("欢迎下次光临。");
                    return;
                default:
                    System.out.println("操作错误，请按照一下规则进行操作。\n");
            }
        }
    }

    private static void addToShoppingCart() {
        System.out.println("点击产品前面的数字，多点多买，0退出");
        for (int i = 0; i < products.size(); i++) {
            System.out.print(i+1);
            System.out.println(products.get(i));
        }
        while (true) {
            switch (scanner.nextInt()) {
                case 0:
                    return;
                case 1:
                    shoppingCart.set(0, shoppingCart.get(0) + 1);
                    break;
                case 2:
                    shoppingCart.set(1, shoppingCart.get(1) + 1);
                    break;
                case 3:
                    shoppingCart.set(2, shoppingCart.get(2) + 1);
                    break;
                default:
                    System.out.println("请正确输入！");
            }
        }
    }

    private static void payment() {
        int total = 0;
        for (int i = 0; i < shoppingCart.size(); i++) {
            if (shoppingCart.get(i) == 0) continue;
            System.out.print(products.get(i) + "\t");
            System.out.print(shoppingCart.get(i) + "\t");
            System.out.println("合计：" + priceBook.get(i) * shoppingCart.get(i));
            total += priceBook.get(i) * shoppingCart.get(i);
        }
        if (total >= 0) {
            System.out.println("总额"+total+"请输入付款金额");
            while (true) {
                int pay = scanner.nextInt();
                if (pay == total) {
                    System.out.println("付款成功。");
                    return;
                }
                if (pay < total) System.out.println("余额不足,请重新输入：");
                if (pay > total) {
                    System.out.println("返给您：" + (pay - total) + "元");
                    return;
                }

            }
        } else {
            System.out.println("您什么也没有购买。");
        }
    }
}
