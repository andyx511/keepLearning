package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname T974和可被整除的子数组
 * @Description TODO
 * @Date 2020/5/27 9:09
 * @Author ALexNi
 */
public class T974和可被整除的子数组 {
    public static void main(String[] args) {
        int[] a = new int[]{4,5,0,-2,-3,1};
        int k = 5;
//        int h = 0%5;
//        System.out.println(h);
        System.out.println(subarraysDivByK(a,k));
    }
    public static int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> record = new HashMap<>();
        record.put(0, 1);
        int sum = 0, ans = 0;
        for (int elem: A) {
            sum += elem;
            // 注意 Java 取模的特殊性，当被除数为负数时取模结果为负数，需要纠正
            int modulus = (sum % K + K) % K;
            int same = record.getOrDefault(modulus, 0);
            ans += same;
            record.put(modulus, same + 1);
        }
        return ans;
    }
}
