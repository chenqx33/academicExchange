package old;

import java.util.HashSet;
import java.util.Set;

/**
 * @author cqx
 * @date 2018/3/23 16:26
 */
public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("a");
        System.out.println(set.toString());
    }
}
