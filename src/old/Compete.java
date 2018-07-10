package old;

/**
 * @author cqx
 * @date 2018/4/23 15:14
 */
public class Compete extends Thread {

     private int count = 5;

    @Override
    public synchronized void run() {
        count--;
        System.out.println(this.currentThread().getName() + " count" + count);
    }

    public static void main(String[] args) {
        Compete ceshi26 = new Compete();
        Thread thread1 = new Thread(ceshi26, "thread1");
        Thread thread2 = new Thread(ceshi26, "thread2");
        Thread thread3 = new Thread(ceshi26, "thread3");
        Thread thread4 = new Thread(ceshi26, "thread4");
        Thread thread5 = new Thread(ceshi26, "thread5");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
