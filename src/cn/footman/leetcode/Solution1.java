package cn.footman.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author footman77
 * @create 2018-11-22 0:08
 */
public class Solution1 {

    @Test
    public void test(){
        int[] nums = {0,4,3,0};
        int target = 0;
        int[] ints = twoSum(nums, 0);
        System.out.println(Arrays.toString(ints));
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){

            int complement = target - nums[i];
            if(map.containsKey(complement)){
                int[] res = {i,map.get(complement)};
                return res;
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("error");


    }
}
