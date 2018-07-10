import java.util.HashMap;
import java.util.Map;

/**
 * @author cqx
 * @date 2018/4/9 14:41
 */
public class ceshi19 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","a");
        map.put("3","a");
        map.put("2","a");
        map.put("b","a");
        map.put("a","a");
        map.put("6","a");
        for (String s : map.keySet()){
            System.out.println(s);
        }
    }
}
