package leetcode;

import java.util.concurrent.SynchronousQueue;

/**
 * projectName：keepLearning
 * name：T43
 * description：todo
 * date：2020/8/13 9:38 下午
 * auther：AlexNi
 */
public class T43 {
    public static String multiply(String num1, String num2) {
        Long a = Long.valueOf(num1);
        Long b = Long.valueOf(num2);
        return String.valueOf(a*b);
    }

    public static void main(String[] args) {
        int a = 1<<20;
        System.out.println(a);
    }
}
