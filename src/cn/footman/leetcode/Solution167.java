package cn.footman.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-11-20 23:28
 */
public class Solution167 {
    @Test
    public void test(){
        int[] nums = {2,7,11,15};
        int[] ints = twoSum(nums, 9);
        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i + 1,j + 1};
                }
            }
        }
        throw new IllegalArgumentException("errot");
    }
}
