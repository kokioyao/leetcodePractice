package cn.footman.leetcode;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-12-01 22:06
 */
public class Solution343 {

    private int[] memo;
    public int integerBreak(int n) {

        memo = new int[n + 1];
        Arrays.fill(memo,-1);

        return breakInteger(n);


    }

    private int breakInteger(int n){
        if( n == 1){
            return 1;
        }

        if(memo[n] != -1){
            return memo[n];
        }

        int res = -1;
        for(int i = 1; i <= n - 1; i++){
            res = max3(res,i * (n - i),i * breakInteger(n - i));
        }
        memo[n] = res;
        return res;
    }


    private int max3(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }

}
