package cn.footman.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-11-20 23:35
 */
public class Solution167two {

    @Test
    public void test(){
        int[] nums = {5,25,75};
        int[] ints = twoSum(nums, 100);
        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        for(int i = 0; i < n; i++){
            int res = target - numbers[i];

            int j = binarySearch(numbers, i + 1, res);
            if(j == -1){
                continue;
            }
            return new int[]{i + 1,j + 1};
        }
        throw new IllegalArgumentException("error");

    }

    public int binarySearch(int[] arr,int k,int target){
        int l = k;
        int r = arr.length - 1;
        while (r >= l){
            int mid = (r - l) / 2 + l;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return -1;

    }
}
