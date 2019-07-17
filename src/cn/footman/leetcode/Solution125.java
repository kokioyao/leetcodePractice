package cn.footman.leetcode;

import org.junit.Test;



/**
 * @author footman77
 * @create 2018-11-21 11:06
 */
public class Solution125 {
    @Test
    public void test(){
        String str = "Damosel, a poem? A carol? Or a cameo pale? (So mad!)";
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);

    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9A-Za-z]","");
        if(s.equals("")){
            return true;
        }
        char[] chars = s.toLowerCase().toCharArray();

        int l = 0;
        int r = chars.length - 1;
        while (l <= r){
            if(l == r){
                return true;
            }
            if(chars[l] == chars[r]){
                l++;
                r--;
            }else {
                return false;
            }
        }
        return true;

    }
}
