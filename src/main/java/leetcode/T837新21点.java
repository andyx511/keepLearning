package leetcode;

/**
 * @Classname T837新21点
 * @Description TODO
 * @Date 2020/6/3 9:13
 * @Author ALexNi
 */
public class T837新21点 {
    public static void main(String[] args) {

    }

    public static double new21Game(int N, int K, int W) {
        return 0.0;
    }
    public static void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int[][] newBorad = new  int[row][col];
        // 从原数组复制一份到 copyBoard 中
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newBorad[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // isAlive(board,i,j,newBorad);
            }
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
