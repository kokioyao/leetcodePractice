package cn.footman.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kokio
 * @create 2019-07-24 10:43
 */
public class Solution387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        char[] array = s.toCharArray();

        for(int i = 0; i< array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i]) + 1);
            }else {
                map.put(array[i], 1);
            }
        }

        for(int i = 0; i< array.length; i++){
            if(map.get(array[i]) == 1){
                return i;
            }
        }
        return -1;


    }
}
