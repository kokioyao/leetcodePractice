package cn.footman.leetcode;

import java.util.Arrays;

/**
 * @author kokio
 * @create 2019-07-24 10:13
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;

        for(int i = 0; i < len - 1; i = i + 2){
            if(nums[i] != nums[i + 1]){
                return nums[i];
            }
        }
        return nums[len - 1];
    }




}
