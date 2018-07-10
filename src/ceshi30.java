import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cqx
 * @date 2018/7/6 15:27
 */
public class ceshi30 {
    public static void main(String[] args) {
        String a = "0b0100";
        String b = "0b0001";
        System.out.println(sum(Integer.valueOf(a),Integer.valueOf(b)));

    }
    static String sum(int a,int b){
        Integer sum=a+b;
        return Integer.toBinaryString(sum);
    }
}