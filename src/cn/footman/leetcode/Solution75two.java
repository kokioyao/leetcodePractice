package cn.footman.leetcode;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-11-20 19:45
 */
public class Solution75two {

    public static void sortColors(int[] nums){
        int zero = -1;// [0...zero] == 0
        int two = nums.length; // [two...n-1] == 2
        for(int i = 0; i < two;){
            if(nums[i] == 1){
                i++;
            }else if(nums[i] == 2){
                swap(nums,--two,i);
            }else {
                swap(nums,++zero,i++);
            }
        }
    }

    private static void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
