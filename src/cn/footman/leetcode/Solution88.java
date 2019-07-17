package cn.footman.leetcode;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-11-20 20:48
 */
public class Solution88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num = new int[m];
        for(int i = 0; i < m; i++){
            num[i] = nums1[i];
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (j < m && k < n){
            if(num[j] < nums2[k]){
                nums1[i] = num[j];
                j++;
                i++;
            }else {
                nums1[i] = nums2[k];
                k++;
                i++;
            }
        }
        while (j < m){//k=n
            nums1[i] = num[j];
            j++;
            i++;
        }
        while (k < n){
            nums1[i] = nums2[k];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
