package cn.footman.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author footman77
 * @create 2018-11-21 18:44
 */
public class Solution438 {
    @Test
    public void test(){
        List<Integer> anagrams = findAnagrams("cbaebabacd", "abc");
        for(Integer a : anagrams){
            System.out.println(a);
        }
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[256];
        for(int i = 0; i < p.length(); i++){
            freq[p.charAt(i)]++;
        }

        int l = 0;
        int r = 0;
        int count = p.length();
        while (r < s.length()){
            if(freq[s.charAt(r)] >= 1){
                count--;
            }
            freq[s.charAt(r)]--;
            r++;
            if(count == 0){
                list.add(l);
            }
            if(r - l == p.length()){
                if(freq[s.charAt(l)] >= 0){
                    count++;
                }
                freq[s.charAt(l)]++;
                l++;
            }

        }
        return list;
    }
}
