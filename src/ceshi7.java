import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author cqx
 * @date 2018/3/23 15:58
 */
public class ceshi7 {
    public static void main(String... args) {

        System.out.println(aa("a","b","c"));
    }
    public static String aa(String... a){
        StringBuilder sb = new StringBuilder();
        for (String b: a){
            sb.append(b);
        }
        return sb.toString();
    }
}
