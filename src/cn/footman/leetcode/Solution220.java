package cn.footman.leetcode;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author footman77
 * @create 2018-11-22 19:42
 */
public class Solution220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {


        TreeSet<Long> set = new TreeSet<>();

        for(int i = 0;i < nums.length; i++){
            if(set.ceiling((long)nums[i] - t) != null &&
                    set.ceiling((long)nums[i] - t) <= (long)nums[i] + t){
                return true;
            }
            set.add((long)nums[i]);
            if(set.size() == k + 1){
                set.remove((long)nums[i - k]);
            }
        }
        return false;
    }
}
