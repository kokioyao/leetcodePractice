package cn.footman.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author footman77
 * @create 2018-11-21 21:44
 */
public class Solution242 {
    @Test
    public void test(){
        boolean anagram = isAnagram("anagram", "nagaram");
        System.out.println(anagram);
    }

    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();


        if(t.length() != s.length()){
            return false;
        }
        char[] c1 = s.toCharArray();
        for(char c : c1){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else {
                map.put(c,1);
            }

        }

        for(int i = 0; i < t.length();i++){
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i))  > 0){

                map.put(t.charAt(i),map.get(t.charAt(i)) - 1);
            }else {
                return false;
            }
        }

        return true;

    }
}
