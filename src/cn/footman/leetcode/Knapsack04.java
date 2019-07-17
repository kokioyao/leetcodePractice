package cn.footman.leetcode;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-12-02 10:35
 */
public class Knapsack04 {

    public int knapsack(int[] w,int[] v,int C){


        if(w == null || v == null || w.length != v.length)
            throw new IllegalArgumentException("Invalid w or v");

        if(C < 0)
            throw new IllegalArgumentException("C must be greater or equal to zero.");

        int n = w.length;
        if(n == 0 || C == 0){
            return 0;

        }
        int[] memo = new int[C + 1];

        Arrays.fill(memo,-1);

        for(int j = 0 ; j <= C ; j ++)
            memo[j] = (j >= w[0] ? v[0] : 0 );

        for(int i = 1 ; i < n ; i ++)
            for(int j = C ; j >= w[i] ; j --){

                memo[j] = Math.max(memo[j], v[i] + memo[j - w[i]]);
            }

        return memo[C];
    }
}
