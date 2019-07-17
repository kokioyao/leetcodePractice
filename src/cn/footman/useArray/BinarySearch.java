package cn.footman.useArray;

import cn.footman.complexityExp.MyUtil;

/**
 * @author footman77
 * @create 2018-11-20 11:36
 */
public class BinarySearch {
    public BinarySearch() {
    }


    public static int binarySearch(Comparable[] arr,int n,Comparable target){
        int l = 0;
        int r = n;
        while (l <= r){
            int mid = (r - l) / 2 + l;
            if(arr[mid].compareTo(target) == 0){
                return mid;
            }else if(arr[mid].compareTo(target) > 0){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int n = (int) Math.pow(10,7);
        Integer[] data = MyUtil.generateOrderedArray(n);

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < n ; i++){
            if(i != binarySearch(data,n,i)){
                throw new IllegalArgumentException("can't find");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Binary Search test complete.");
        System.out.println("Time cost: " + (endTime - startTime) + " ms");

    }
}
