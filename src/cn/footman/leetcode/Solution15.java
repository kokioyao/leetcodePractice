package cn.footman.leetcode;

import org.junit.Test;

import java.util.*;

/**
 * @author footman77
 * @create 2018-11-22 11:36
 */
public class Solution15 {

    @Test
    public void tset(){
        int[] nums = {-1, 0, 1, 2, -1, -4, 3,-3};
        List<List<Integer>> lists = threeSum(nums);
        for(List<Integer> list : lists){
            System.out.println(Arrays.toString(list.toArray()));
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();

        List<List<Integer>> listAll = new ArrayList<>();

        for(int i = 0; i < nums.length - 2;i++){
            int target = -nums[i];
            for(int j = i + 1; j < nums.length ;j++){
                if(map.containsKey(target - nums[j])){
                    List<Integer> list = new ArrayList<>();
                    list.add(-target);
                    list.add(target - nums[j]);
                    list.add(nums[j]);
                    listAll.add(list);
                    map.remove(target - nums[j]);
                }else {
                    map.put(nums[j],j);
                }

            }
            map.clear();
        }


        HashSet<List<Integer>> set = new HashSet<>(listAll);
        listAll.clear();
        listAll.addAll(set);

        return listAll;
    }
}
