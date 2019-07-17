package cn.footman.leetcode;

import org.junit.Test;

/**
 * @author footman77
 * @create 2018-11-21 10:12
 */
public class Solution345 {

    @Test
    public void test(){
        String hello = reverseVowels("hello");
        System.out.println(hello);

    }


    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j){
            if(!isVowel(chars[i])){
                i++;
            }
            if(!isVowel(chars[j])){
                j--;
            }
            if(isVowel(chars[i]) && isVowel(chars[j])){
                swap(chars,i,j);
                i++;
                j--;
            }
        }
        return new String(chars);
    }


    public boolean isVowel(char c){

        char[] chars = {'a','e','o','i','u','A','U','I','O','E'};
        for(int i =0; i < chars.length; i++){
            if(c == chars[i]){
                return true;
            }
        }
        return false;
    }

    public void swap(char[] chars,int i,int j){
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }
}
