package cn.footman.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author footman77
 * @create 2018-11-21 22:07
 */
public class Solution202 {
    @Test
    public void test(){
        boolean happy = isHappy(91);
        System.out.println(happy);
    }

    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1 ){
            if(!set.add(n)){
                return false;
            }
            int result = 0;
            while (n != 0){
                int remainder = n % 10;
                result += remainder * remainder;
                n /= 10;
            }

            n = result;
        }
        return true;
    }
}
