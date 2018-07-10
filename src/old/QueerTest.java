package old;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author cqx
 * @date 2018/4/9 16:00
 */
public class QueerTest {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        a.add("3");
        int i=1;
        Iterator it = a.iterator();
        while(it.hasNext()){
            if(it.next().equals("3")){
                it.remove();
            }
        }
        for (String temp:a){

            if ("1".equals(temp)){
                a.remove(temp);
            }
            System.out.println(i++);
        }
        System.out.println(a);
    }
}
