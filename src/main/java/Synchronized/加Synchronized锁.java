package Synchronized;

/**
 * @Classname 加Synchronized锁
 * @Description TODO
 * @Date 2020/5/20 10:25
 * @Author ALexNi
 */
public class 加Synchronized锁 {
    public static void main(String[] args) {
        Ndb ndb = new Ndb();
        ndb.start();
        for (; ; ){
            synchronized (ndb){
                if (ndb.isFlag()){
                    System.out.println("啦啦啦德玛西亚");
                }
            }
        }
    }
}
