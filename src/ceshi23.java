import java.lang.reflect.Field;

/**
 * @author cqx
 * @date 2018/4/10 17:59
 */
public class ceshi23 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class cache = Integer.class.getDeclaredClasses()[0];
        Field myCache = cache.getDeclaredField("cache");
        myCache.setAccessible(true);
        Integer[] newCache = (Integer[])myCache.get(cache);

        int a=2;
        newCache[130] = 5;
        Integer[] dd = (Integer[])myCache.get(cache);

        int c=2;
        int b=a+a;
        System.out.println(a+","+b+","+c);
        System.out.println();
    }
}
