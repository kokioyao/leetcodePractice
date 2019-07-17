package cn.footman.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author footman77
 * @create 2018-11-21 23:04
 */
public class Solution290 {

    @Test
    public void test(){
        boolean b = wordPattern("ccbba", "dog dog cat cat dog");
        System.out.println(b);
    }
    public boolean wordPattern(String pattern, String str) {
        HashMap<String, String> map = new HashMap<>();


        String[] keys = pattern.split("");
        String[] values = str.split(" ");

        if(keys.length != values.length){
            return false;
        }
        if(pattern.equals("") && values.length == 1){
            return true;
        }
        for(int i = 0; i < keys.length;i++){
            if(map.containsKey(keys[i]) && !map.get(keys[i]).equals(values[i]) ){
                return false;
            }else if(!map.containsKey(keys[i]) && map.containsValue(values[i])) {
                return false;

            }else {

                map.put(keys[i],values[i]);
            }

        }
        return true;
    }

    @Test
    public void test01(){
        String str = "";
        String[] s = str.split("");
        System.out.println(Arrays.toString(s));
    }
}
