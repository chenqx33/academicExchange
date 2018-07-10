import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author cqx
 * @date 2018/4/10 14:20
 */
public class ceshi21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("电");
        list.add("杨");
        list.add("风");
        System.out.println((int)'电');
        System.out.println((int)'杨');
        System.out.println((int)'风');
        System.out.println((int)'a');
        Collections.sort(list);
        //list.sort((o1,o2)->Integer.valueOf(o1)>Integer.valueOf(o2)?0:-1);
        System.out.println(list);    }
}
