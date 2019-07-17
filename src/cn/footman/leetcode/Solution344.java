package cn.footman.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-11-21 0:10
 */
public class Solution344 {
    @Test
    public void test(){
        String hello = reverseString("hello");
        System.out.println(hello);
    }
    public String reverseString(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s);
        int i = 0;
        int j = stringBuffer.length() - 1;
        while (i < j){
            char c = stringBuffer.charAt(i);

            char c1 = stringBuffer.charAt(j);
            stringBuffer.setCharAt(j,c);
            stringBuffer.setCharAt(i,c1);
            i++;
            j--;
        }
        return stringBuffer.toString();
    }
}
