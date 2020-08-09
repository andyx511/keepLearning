package 算法;

/**
 * projectName：keepLearning
 * name：死锁
 * description：todo
 * date：2020/8/9 9:20 上午
 * auther：AlexNi
 */
public class 死锁 {
    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {
        new 死锁().deadLock();
    }

    private void deadLock() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    try {
                        Thread.currentThread().sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println("1");
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                    synchronized (A) {
                        System.out.println("2");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
