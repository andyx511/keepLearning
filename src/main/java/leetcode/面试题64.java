package leetcode;

import java.util.concurrent.Callable;

/**
 * @Classname 面试题64
 * @Description TODO
 * @Date 2020/6/2 11:08
 * @Author ALexNi
 */
public class 面试题64 {
    public static void main(String[] args) {
        System.out.println(sumNums(9));
    }


    public static int sumNums(int n) {
        int a = n==0?n:sumNums(n-1)+n;
        return a;
    }
}
