package cn.footman.leetcode;

import java.util.Arrays;

/**
 * @author footman77
 * @create 2018-12-02 15:37
 */
public class Solution455 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gi = g.length - 1;
        int si = s.length - 1;

        int res = 0;

        while (gi >= 0 && si >= 0){
            if(s[si] >= g[gi]){
                res++;
                si--;
            }
            gi--;
        }
        return res;
    }
}
