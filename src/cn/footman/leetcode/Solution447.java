package cn.footman.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author footman77
 * @create 2018-11-22 16:28
 */
public class Solution447 {
    public int numberOfBoomerangs(int[][] points) {

        int res = 0;
        for(int i = 0; i < points.length; i++){

            Map<Integer, Integer> map = new HashMap<>();
            for(int j = 0;j < points.length; j++ ){
                if(j != i){
                    int dis = dis(points[j], points[i]);
                    if(map.containsKey(dis)){
                        map.put(dis,map.get(dis) + 1);
                    }else {
                        map.put(dis,1);
                    }
                }
            }

            for(Integer dis : map.keySet()){
                res +=map.get(dis) * (map.get(dis) - 1);
            }
        }
        return res;
    }

    private int dis(int[] a,int[] b){
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }

}
