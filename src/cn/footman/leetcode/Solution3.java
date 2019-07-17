package cn.footman.leetcode;

import org.junit.Test;

/**
 * @author footman77
 * @create 2018-11-21 15:22
 */
public class Solution3 {
    @Test
    public void test(){
        int abcabcbb = lengthOfLongestSubstring("pwwkew");
        System.out.println(abcabcbb);
    }

    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int l = 0;
        int r = -1;
        int res = 0;

        while (l < s.length()){
            if(r < s.length() - 1 && freq[s.charAt(r + 1)] == 0){

                freq[s.charAt(++r)] ++;
                res = Math.max(res,r - l + 1);
            }else {

                freq[s.charAt(l++)] --;
            }


        }
        return res;
    }
}
