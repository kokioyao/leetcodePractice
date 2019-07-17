package cn.footman.leetcode;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-11-20 13:59
 */
public class Solution283 {

    public static void moveZeroes(int[] nums) {

        int n = nums.length;

        int zeroIndex = 0;
        for(int i = 0; i < n - 1 ; i++){
            if(nums[i] == 0){
                zeroIndex = i;
                for(int j = i + 1; j < n; j++){
                    if(nums[j] != 0){
                        nums[zeroIndex] = nums[j];
                        nums[j] = 0;
                        break;
                    }

                }
            }

        }

    }

    public static void main(String[] args) {
        int[] nums ={0,1,0};
//        moveZeroes(nums);
        test(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void test(int[] nums){
        int n = nums.length;
        int m = 0;
        for(int i = 0; i < n;i++){
            if(nums[i] != 0){
                nums[m] = nums[i];
                m++;
            }
        }
        if(m < n){
            for(int i = m; i < n; i++){
                nums[i] = 0;
            }
        }
    }

}
