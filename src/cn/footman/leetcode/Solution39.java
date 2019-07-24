package cn.footman.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kokio
 * @create 2019-07-18 09:54
 */
public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<>();
        if(Arrays.asList(candidates).contains(target)){
            List<Integer> arrayList = new ArrayList<>();
            arrayList.add(target);
            list.add(arrayList);
        }


        for(int i = 0; i < candidates.length; i++){
            int res = target % candidates[i];
            int retailer = target / candidates[i];
        }
        return list;

    }
}
