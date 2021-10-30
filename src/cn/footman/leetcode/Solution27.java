package cn.footman.leetcode;

/**
 * @author footman77
 * @create 2018-11-20 15:05
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {

//        change something
        int n = nums.length;
        int k = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
