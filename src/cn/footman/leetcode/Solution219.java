package cn.footman.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author footman77
 * @create 2018-11-22 18:17
 */
public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if(nums.length <= 1 || nums == null){
            return false;
        }
        if(k <= 0){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size() == k + 1){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
