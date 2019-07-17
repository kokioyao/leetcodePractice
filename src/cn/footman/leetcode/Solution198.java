package cn.footman.leetcode;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-12-01 23:18
 */
public class Solution198 {

    private int[] memo;

    public int rob(int[] nums) {

        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return tryRob(nums,0);

    }

    private int tryRob(int[] nums,int index){

        if(index > nums.length){
            return 0;
        }

        if(memo[index] != -1){
            return memo[index];
        }

        int res = 0;
        for(int i = index; i < nums.length; i++){
            res = Math.max(res,nums[i] + tryRob(nums,index + 2));
        }
        memo[index] = res;
        return res;

    }
}
