package cn.footman.leetcode;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-12-02 14:57
 */
public class Solution300 {
    public int lengthOfLIS(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int[] memo = new int[nums.length];
        Arrays.fill(memo,1);

        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    memo[i] = Math.max(memo[i],1 + memo[j]);
                }
            }
        }

        int res = memo[0];
        for(int i = 1; i < nums.length; i++){
            res = Math.max(res,memo[i]);
        }

        return res;
    }
}
