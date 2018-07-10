package old;

/**
 * @author cqx
 * @date 2018/3/23 11:39
 */
public class ThreadTest {
    static int count=0;

    public static void main(String[] args) {
        add("a");
    }
    public static void add(String str){
        if("a".equals(str)){
            count=100;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(count);
        }else{
            count=200;
            System.out.println(count);
        }
    }
}
