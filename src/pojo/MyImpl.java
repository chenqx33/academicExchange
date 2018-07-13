package pojo;

/**
 * @author cqx
 * @date 2018/7/13 10:31
 */
public class MyImpl extends MyAbst {
    @Override
    public void print(Object str) {
        System.out.println("Impl==>"+str);
    }
}
