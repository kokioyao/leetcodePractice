package cn.footman.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-11-23 17:57
 */
public class Solution905 {
    public int[] sortArrayByParity(int[] A) {
        int l = 0;
        int r = A.length - 1;
        while (l < r){
            if(A[l] % 2 == 1 && A[r] % 2 == 0){
                swap(A,l,r);
                l++;
                r--;
            }else if(A[l] % 2 == 0){
                l++;
            }else{
                r--;
            }
        }
        return A;
    }

    private void swap(int[] A , int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    @Test
    public void test(){
        int[] num = {3,1,2,4};
        int[] ints = sortArrayByParity(num);
        System.out.println(Arrays.toString(ints));
    }
}
