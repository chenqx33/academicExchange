import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author cqx
 * @date 2018/3/23 16:29
 */
public class ceshi10 {
    public static void main(String[] args) {
        String[] strings = {"a","b","c","a"};
        Stream<String> stream = Arrays.stream(strings);
        Set set = stream.collect(Collectors.toSet());
        System.out.println("over");
    }
}
