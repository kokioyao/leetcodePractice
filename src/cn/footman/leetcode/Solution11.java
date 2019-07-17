package cn.footman.leetcode;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author footman77
 * @create 2018-11-21 10:35
 */
public class Solution11 {

    @Test
    public void test(){
        int[] h = {1,8,6,2,5,4,8,3,7};
        int i = maxArea2(h);
        System.out.println(i);

    }

    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;

        while (i < j){
            maxArea = Math.max(maxArea,Math.min(height[i],height[j]) * (j - i));
            if(height[i] < height[j]){
                i++;
            }else {
                j--;
            }

        }
        return maxArea;
    }

    public int maxArea2(int[] height){
        int l  = 0;
        int r = height.length - 1;

        int maxArea = 0;
        for(int i = 0; i < r; i ++){
            for(int j = i + 1; j <= r; j++){
                maxArea = Math.max(maxArea,Math.min(height[i],height[j]) * (j - i));
            }
        }
        return maxArea;
    }
}
