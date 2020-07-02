package 线程;

/**
 * @Classname 线程组
 * @Description TODO
 * @Date 2020/6/3 15:26
 * @Author ALexNi
 */
public class 线程组 {
    public static void main(String[] args) {
        Thread testThread = new Thread(() -> {
            System.out.println("testThread当前线程组名字：" +
                    Thread.currentThread().getThreadGroup().getName());
            System.out.println("testThread线程名字：" +
                    Thread.currentThread().getName());
        });

        testThread.start();
        System.out.println("执行main方法线程名字：" + Thread.currentThread().getName());
    }
}
