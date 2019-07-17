package cn.footman.leetcode;

import org.junit.Test;

/**
 * @author footman77
 * @create 2018-11-21 14:30
 */
public class Solution209 {
    @Test
    public void test(){
        int[] nums = {2,3,1,2,4,3};
        int i = minSubArrayLen(7, nums);
        System.out.println(i);
    }

    public int minSubArrayLen(int s, int[] nums) {

        int l = 0;
        int r = -1;
        int sum = 0;
        int ret = nums.length + 1;
        while (l < nums.length){
            if(r < nums.length - 1 && sum < s){
                sum += nums[++r];
            }else{
                sum -= nums[l++];
            }
            if(sum >= s){
                ret = Math.min(ret,(r - l + 1));
            }
        }
        if(ret == nums.length + 1){
            return 0;
        }
        return ret;
    }
}
