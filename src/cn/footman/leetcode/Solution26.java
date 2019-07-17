package cn.footman.leetcode;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-11-20 15:08
 */
public class Solution26 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        System.out.println(i);
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;

        for(int i = 1; i < n; i++){
           if(nums[k] != nums[i]){
               nums[k + 1] = nums[i];
               k += 1;
           }

        }
        return k + 1;
    }

}
