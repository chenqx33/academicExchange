import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);

    }

}
class ConstClass
{
    static
    {
        System.out.println("ConstClass init!");
    }
    public static  final String HELLOWORLD = "hello world";

    ConstClass() throws NoSuchFieldException {
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
    }
}
