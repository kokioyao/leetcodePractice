package cn.footman.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author footman77
 * @create 2018-11-30 14:39
 */
public class Solution46{

    private ArrayList<List<Integer>> res;
    private boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0){
            return res;
        }

        used = new boolean[nums.length];
        LinkedList<Integer> p = new LinkedList<>();
        generatePermutation(nums,0,p);

        return res;

    }

    // p中保存了一个有index-1个元素的排列。
    // 向这个排列的末尾添加第index个元素, 获得一个有index个元素的排列
    private void generatePermutation(int[] nums, int index, LinkedList<Integer> p){

        if(index == nums.length){
            res.add((LinkedList<Integer>)p.clone());
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!used[i]){
                used[i] = true;
                p.addLast(nums[i]);
                generatePermutation(nums,index + 1,p);
                p.removeLast();
                used[i] = false;

            }
        }
        return;
    }
}
