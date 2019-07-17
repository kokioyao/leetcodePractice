package cn.footman.leetcode;

/**
 * @author kokio
 * @create 2019-07-17 22:14
 */
public class Solution832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m / 2; j++ ){
                int temp = A[i][j];
                A[i][j] = A[i][m - 1 - j];
                A[i][m - 1 - j] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++ ){
                if(A[i][j] == 0){
                    A[i][j] = 1;
                }else {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }
}
