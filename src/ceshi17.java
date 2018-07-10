import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cqx
 * @date 2018/4/4 17:27
 */
public class ceshi17 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));
        List<String> list2 = Arrays.asList("d","e");
        list.addAll(list2);
        System.out.println(list.toString());
    }
}
