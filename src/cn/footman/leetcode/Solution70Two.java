package cn.footman.leetcode;

/**
 * @author footman77
 * @create 2018-12-01 17:01
 */
public class Solution70Two {



    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = 1;
        for(int i = 2; i <= n;i++){
            memo[i] = memo[i-1] + memo[i - 2];
        }
        return memo[n];

    }


}
