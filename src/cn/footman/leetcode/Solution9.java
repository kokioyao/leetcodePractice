package cn.footman.leetcode;

import org.junit.Test;

/**
 * @author kokio
 * @create 2018-12-28 2:07
 */
public class Solution9 {

    @Test
    public void test(){
        System.out.println(isPalindrome(1221));
    }
    //愚蠢啊，小于零的肯定都是无法完成的啊啊！！！！
    public boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        String[] strings = s.split("");
        int left = 0;
        int right = strings.length - 1;
        while (left < right){
            if(strings[left].equals(strings[right])){
                left++;
                right--;
            }else {
                return false;
            }

        }
        return true;
    }
}
