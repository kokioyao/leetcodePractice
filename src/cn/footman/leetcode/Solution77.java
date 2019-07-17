package cn.footman.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author footman77
 * @create 2018-11-30 18:02
 */
public class Solution77 {

    private ArrayList<List<Integer>> res;

    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<List<Integer>>();

        if(n <= 0 || k <= 0 || k > n){
            return res;
        }
        LinkedList<Integer> c = new LinkedList<>();
        generateCombinations(n,k,1,c);

        return res;
    }

    private void generateCombinations(int n, int k, int start, LinkedList<Integer> c){
        if(c.size() == k){
            res.add((List<Integer>) c.clone());
            return;
        }

        // 还有k - c.size()个空位, 所以, [i...n] 中至少要有 k - c.size() 个元素
        // i最多为 n - (k - c.size()) + 1
        for(int i = start; i <= n; i++){
            c.addLast(i);
            generateCombinations(n, k, i + 1, c);
            c.removeLast();
        }

        return;
    }
}
