package old;

import java.util.HashMap;

/**
 * 初始化Map
 *
 * @author cqx
 * @date 2018/3/15 15:27
 */
public class InitMap {
    public static void main(String[] args) {
        HashMap h = new HashMap(){{
            put("a","b");
        }};
        System.out.println(h.toString());
    }
}
