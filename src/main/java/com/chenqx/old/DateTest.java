package com.chenqx.old;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.text.ParseException;

/**
 * @author cqx
 * @date 2018/3/29 17:30
 */
public class DateTest {
    public static void main(String[] args) throws ParseException, IOException {
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(simpleDateFormat.format(date));
//        System.out.println(simpleDateFormat.format(simpleDateFormat.parse("0000-12-12")));
//        String s;
//        Scanner scanner = new Scanner(System.in);
//        s = scanner.nextLine();
//        System.out.println(s);
//
//        if (scanner.nextBoolean()){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }
//        System.out.println((int)System.in.read()+"");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
        byte[] b = new byte[1024];
        bufferedInputStream.read(b);
        System.out.println(new String(b));
    }
}
