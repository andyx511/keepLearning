package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname T287寻找重复的数
 * @Description TODO
 * @Date 2020/5/26 14:38
 * @Author ALexNi
 */
public class T287寻找重复的数 {

    public static void main(String[] args) {

    }

    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])){
                return nums[i];
            }else {
                set.add(nums[i]);
            }
        }
        return -1;
    }
}
