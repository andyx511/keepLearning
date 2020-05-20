package Synchronized;

/**
 * @Classname Ndb
 * @Description TODO
 * @Date 2020/5/20 10:26
 * @Author ALexNi
 */
public class Ndb extends Thread{
    // private boolean flag = false;
    private volatile boolean flag = false;
    public boolean isFlag(){
        return this.flag;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag=" + flag);
    }
}