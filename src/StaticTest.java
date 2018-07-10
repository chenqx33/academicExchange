/**
 * @author cqx
 * @date 2018/3/1 14:13
 */
public class StaticTest {
    public static void main(String[] args) {
        System.out.println(7);
        staticFunction();
    }

    static StaticTest st = new StaticTest();

    static {
        System.out.println("1");
    }

    StaticTest() {
        System.out.println("3");
        System.out.println("a=" + a + ",b=" + b);
    }

    {
        System.out.println("2");
    }
    int a = 110;
    static int b = 112;

    static void staticFunction() {
        System.out.println("4");
    }

}
