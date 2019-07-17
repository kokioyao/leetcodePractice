package cn.footman.leetcode;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-11-20 16:18
 */
public class Solution75 {
    public static void sortColors(int[] nums) {

        int n = nums.length;
        int k = 0;
        int j = 0;
        int m = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                k++;
            }
            if(nums[i] == 1){
                j++;
            }
            if(nums[i] == 2){
                m++;
            }
        }
        for(int i = 0; i < n; i++){
            if(i < k){
                nums[i] = 0;
            }else if(i <  k + j){
                nums[i] = 1;
            }else {
                nums[i] = 2;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);

        System.out.println(Arrays.toString(arr));
    }
}
