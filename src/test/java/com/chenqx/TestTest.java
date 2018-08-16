package com.chenqx;

import com.sun.javafx.fxml.expression.KeyPath;
import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import com.chenqx.pojo.MyImpl;
import com.chenqx.pojo.MyIntegerface;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * @author cqx
 * @date 2018/7/10 19:13
 */
public class TestTest {

    @org.junit.Test
    public void hello(){
        MyIntegerface<String> impl = new MyImpl();
        impl.printAll(Arrays.asList("1","2","3"));
    }

    //codeReview
    @Test
    public void codeReview(){
        String a = "test";
        List<String> test = Collections.singletonList(a);
        //不可修改
        test.add("testhaha");
    }

    @Test
    public void codeReview2(){
        List<String> list = new ArrayList<>();
        list.add("ni");
        list.add(2,"n");
        System.out.println(list.toString());
    }

    @Test
    public void initList(){
        List<String> list = new ArrayList<String>(){
            @Override
            public boolean add(String s) {
                return false;
            }
        };
        System.out.println(list.add("12"));
    }

    @Test
    public void my(){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(1532066434399l));
    }

    @Test
    public void ce() throws IOException {
        String f = TestTest.class.getClassLoader().getResource("s1.txt").getPath();
        System.out.println(f);
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\nigul\\IdeaProjects\\academicExchange\\src\\main\\resources\\s1"));
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String s1 = br.readLine();
        String s2 = "";
        System.out.println(s1.split(",").length);
        System.out.println(s2.split(",").length);
    }

    @Test
    public void coppyMap(){
        Map<String,String> map = new HashMap<>();
        map.put("one","1");
        Map<String,String> copyMap = new HashMap<>(map);
        copyMap.put("one","onee");
        System.out.println(map.toString());
    }
    @Test
    public void listToString(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        String s = list.toString().replace(", ",",");
        System.out.println(s);
        try {
            list.get(100);
        }catch (Exception e){
            System.out.println(e);
        }
    }



}
