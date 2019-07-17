package cn.footman.leetcode;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-12-02 0:13
 */
public class Knapsack01 {

    private int[][] memo;

    //其中n为物品个数; C为背包容积
    public int knapsack(int[] w,int[] v,int C){

        int n = w.length;
        if(n == 0 || C == 0)
            return 0;

        memo = new int[n][C + 1];
        Arrays.fill(memo,-1);
        return bestValue(w,v,n - 1,C);
    }

    // 用 [0...index]的物品,填充容积为c的背包的最大价值
    private int bestValue(int[] w,int[] v,int index,int c){
        if(c <= 0 || index < 0){
            return 0;
        }

        if(memo[index][c] != -1){
            return memo[index][c];
        }

        int res = bestValue(w,v,index - 1,c);
        if(c >= w[index]){
            res = Math.max(res,v[index] + bestValue(w,v,index - 1,c - w[index]));
        }

        return memo[index][c] = res;
    }

}
