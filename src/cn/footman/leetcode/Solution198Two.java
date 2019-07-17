package cn.footman.leetcode;

/**
 * @author footman77
 * @create 2018-12-01 23:32
 */
public class Solution198Two {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return 0;
        }

        int[] memo = new int[nums.length];

        memo[n - 1] = nums[n - 1];
        for( int i = n - 2; i >= 0; i--){
            //memo[i]
            for(int j = i; j < n; j++ ){
                memo[i] = Math.max(memo[i],
                                    nums[j] + (j + 2 < n ? memo[j + 2] :0));
            }
        }

        return memo[0];
    }
}
