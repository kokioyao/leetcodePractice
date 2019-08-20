package cn.footman.leetcode;

/**
 * @author kokio
 * @create 2019-08-19 13:33
 */
public class Solution896 {
    public boolean isMonotonic(int[] A) {
        int len = A.length;
        int flag = 0;
        int flag2 = 0;

        for(int i = 0 ; i < len - 1; i++){
            if(A[i] >= A[i + 1]){
                flag += 1;
            }
            if(A[i] <= A[i + 1]){
                flag2 += 1;
            }

        }

        if(flag == len - 1 || flag2 == len - 1){
            return true;
        }else {
            return false;
        }





    }
}
