package cn.footman.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-11-20 23:57
 */
public class Solution167Three {

    @Test
    public void test(){
        int[] nums = {5,25,75};
        int[] ints = twoSum(nums, 100);
        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;

        int ret = 0;
        while (i < j){
            ret = numbers[i] + numbers[j];
            if (ret > target) {
                j--;
            }else if(ret < target){
                i++;
            }else {
                break;
            }
        }
        return new int[]{i + 1,j + 1};


    }
}
