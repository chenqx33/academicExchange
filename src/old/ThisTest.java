package old;

/**
 * @author cqx
 * @date 2018/3/29 11:33
 */
public class ThisTest {
    public static void main(String[] args) {
    Zi zi = new Zi();
    zi.show();
    }
}

class Fu {
    public String name = "heihie";

    void show() {
        System.out.println(this);
        System.out.println(this.name);
    }
}

class Zi extends Fu {
    public String name = "haha";
}