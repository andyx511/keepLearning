package leetcode;

/**
 * @Classname T718
 * @Description TODO
 * @Date 2020/7/1 14:28
 * @Author ALexNi
 */
//给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
//
// 示例 1:
//
//
//输入:
//A: [1,2,3,2,1]
//B: [3,2,1,4,7]
//输出: 3
//解释:
//长度最长的公共子数组是 [3, 2, 1]。
//
//
// 说明:
//
//
// 1 <= len(A), len(B) <= 1000
// 0 <= A[i], B[i] < 100
//
// Related Topics 数组 哈希表 二分查找 动态规划


//leetcode submit region begin(Prohibit modification and deletion)
public class T718 {
    public static void main(String[] args) {
        int[] a = {3,2,1,2,1};

        int[] b = {3,2,1,4,7};
        System.out.println(findLength(a,b));
    }
    public static int findLength(int[] A, int[] B) {
        int max = 0;
        int[][] dp = new int[A.length + 1][B.length + 1];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    if (i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                } else {
                    dp[i][j] = 0;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
