import java.util.HashMap;
import java.util.Map;

/**
 * projectName：keepLearning
 * name：Demo
 * description：todo
 * date：2020/5/30 12:12 下午
 * auther：AlexNi
 */
abstract class Person {
    public abstract void eat();
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("开始");
       print("a");
       print("b");

    }
    public static String print(String a){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);
        return a;
    }
}