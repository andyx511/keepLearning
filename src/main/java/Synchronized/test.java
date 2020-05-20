package Synchronized;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/5/20 10:11
 * @Author ALexNi
 */
public class test {
    public static void main(String[] args) {
        Ndb ndb = new Ndb();
        ndb.start();
        for (; ; ){
            if (ndb.isFlag()){
                System.out.println("啦啦啦德玛西亚");
            }
        }
    }
}

