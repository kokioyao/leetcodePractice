package cn.footman.leetcode;

import org.junit.Test;

/**
 * @author kokio
 * @create 2018-12-28 1:52
 */
public class Solution7 {
    @Test
    public void test(){
        System.out.println(reverse(1534236469));
    }
    public int reverse(int x) {
        int temp = x;
        boolean flag = true;
        if(x < 0){
            flag = false;
            temp = Math.abs(x);
        }
        String s = String.valueOf(temp);
        StringBuffer stringBuffer = new StringBuffer(s);
        StringBuffer reverse = stringBuffer.reverse();
        int i = 0;
        try {
            i = Integer.parseInt(reverse.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        if(!flag){
            i = -i;
        }
        return i;
    }
}
