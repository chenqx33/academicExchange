import java.util.HashMap;
import java.util.Map;

/**
 * @author cqx
 * @date 2018/3/29 20:34
 */
public class ceshi16 {
    public static void main(String[] args) {
        System.out.println("Ea".hashCode());  // 165374702
        System.out.println("FB".hashCode()); //  165374702
        Map a = new HashMap();
        a.put("ABCDEa123abc","1");
        a.put("ABCDFB123abc","2");
        System.out.println(a.toString());
    }
}
