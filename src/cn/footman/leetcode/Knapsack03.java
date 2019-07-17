package cn.footman.leetcode;

/**
 * @author footman77
 * @create 2018-12-02 10:16
 */
public class Knapsack03 {


    public int knapsack(int[] w,int[] v,int C){


        if(w == null || v == null || w.length != v.length)
            throw new IllegalArgumentException("Invalid w or v");

        if(C < 0)
            throw new IllegalArgumentException("C must be greater or equal to zero.");

        int n = w.length;
        if(n == 0 || C == 0){
            return 0;

        }
        int[][] memo = new int[2][C + 1];

        for(int j = 0 ; j <= C ; j ++)
            memo[0][j] = (j >= w[0] ? v[0] : 0 );

        for(int i = 1 ; i < n ; i ++)
            for(int j = 0 ; j <= C ; j ++){
                memo[i%2][j] = memo[(i-1)%2][j];
                if(j >= w[i])
                    memo[i%2][j] = Math.max(memo[i%2][j], v[i] + memo[(i - 1)%2][j - w[i]]);
            }

        return memo[(n - 1)%2][C];
    }

}
