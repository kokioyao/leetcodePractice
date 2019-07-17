package cn.footman.leetcode;

import java.util.HashSet;

/**
 * @author footman77
 * @create 2018-11-22 18:33
 */
public class Solution217 {


    public boolean containsDuplicate(int[] nums) {

        if(nums == null || nums.length <= 1){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
