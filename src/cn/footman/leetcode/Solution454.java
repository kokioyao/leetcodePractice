package cn.footman.leetcode;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author footman77
 * @create 2018-11-22 14:58
 */
public class Solution454 {

    @Test
    public void test(){
        //-1,-1]
        //[-1,1]
        //[-1,1]
        //[1,-1]
        int[] a = {-1, -1};
        int[] b = {-1, 1};
        int[] c = {-1, 1};
        int[] d = {1,-1};
        int count = fourSumCount(a, b, c, d);
        System.out.println(count);
    }


    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if(A == null || B == null || C == null || D == null){
            throw new IllegalArgumentException("error");
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < C.length; i++){
            for(int j = 0 ; j < D.length; j++){
                int sum = C[i] + D[j];
                if(map.containsKey(sum)){
                    map.put(sum,map.get(sum) + 1);
                }else {
                    map.put(sum,1);
                }

            }
        }


        int res = 0;
        for(int i = 0; i< A.length; i++){
            for(int j = 0; j < B.length; j++){
                if(map.containsKey(-A[i] - B[j])){
                    res  += map.get(-A[i] - B[j]);
                }
            }
        }
        return res;

    }
}
