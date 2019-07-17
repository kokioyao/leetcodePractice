package cn.footman.leetcode;

import javafx.util.Pair;

import java.util.LinkedList;

/**
 * @author footman77
 * @create 2018-11-28 23:05
 */
public class Solution279 {
    public int numSquares(int n) {

        if(n == 0)
            return 0;

        LinkedList<Pair<Integer, Integer>> queue = new LinkedList<Pair<Integer, Integer>>();
        queue.addLast(new Pair<Integer, Integer>(n, 0));

        boolean[] visited = new boolean[n+1];
        visited[n] = true;

        while(!queue.isEmpty()){
            Pair<Integer, Integer> front = queue.removeFirst();
            int num = front.getKey();
            int step = front.getValue();

            if(num == 0)
                return step;

            for(int i = 1 ; num - i*i >= 0 ; i ++){
                int a = num - i*i;
                if(!visited[a]){
                    if(a == 0) return step + 1;
                    queue.addLast(new Pair(a, step + 1));
                    visited[a] = true;
                }
            }
        }

        throw new IllegalStateException("No Solution.");
    }
}
