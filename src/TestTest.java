import java.util.Arrays;

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
}
