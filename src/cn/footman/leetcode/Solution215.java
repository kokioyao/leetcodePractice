package cn.footman.leetcode;

import org.junit.Test;

/**
 * @author footman77
 * @create 2018-11-20 21:21
 */
public class Solution215 {

    @Test
    public void test(){
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int i = findKthLargest(nums, 4);
        System.out.println(i);
    }
    public int findKthLargest(int[] nums, int k) {
        int n =  nums.length;
        k = n - k;
        int i = find(nums, 0, n - 1, k);
        return i;


    }
    private int find(int[] nums,int l,int r,int k){
        int p = partition(nums,l,r);
        if(p > k){
            return find(nums,l,p - 1,k);
        }else if(p < k){
            return find(nums,p + 1,r,k);
        }else {
            return nums[p];
        }


    }

    private int partition(int[] nums,int l,int r){

        int v = nums[l];

        int j = l;
        for(int i = l + 1; i <= r; i++){
            if(nums[i] < v){
                j++;
                swap(nums,i,j);
            }
        }
        swap(nums,l,j);
        return j;
    }

    private void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
