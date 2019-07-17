package cn.footman.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author footman77
 * @create 2018-11-22 14:28
 */
public class Solution15two {
    @Test
    public void tset(){
        int[] nums = {-1, 0, 1, 2, -1, -4, 3,-3};
        List<List<Integer>> lists = threeSum(nums);
        for(List<Integer> list : lists){
            System.out.println(Arrays.toString(list.toArray()));
        }
    }


    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[ i - 1]){
                continue;
            }
            int target = -nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r){
                if(nums[l] + nums[r] == target){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]){
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]){
                        r--;
                    }
                }else if(nums[l] + nums[r] > target){
                    r--;
                }else {
                    l++;
                }

            }
        }
        return res;
    }

}
