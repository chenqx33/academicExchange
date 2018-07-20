import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import pojo.MyAbst;
import pojo.MyImpl;
import pojo.MyIntegerface;

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
        String a = "test";
        Set<String> test = Collections.singleton(a);
        //不可修改
        test.add("testhaha");
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




}
