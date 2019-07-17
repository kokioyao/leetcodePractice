package cn.footman.leetcode;

import java.util.Scanner;

/**
 * @author footman77
 * @create 2018-12-08 13:04
 */
public class Solutionstt {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(lengthOfLIS(arr));
    }
    public static int lengthOfLIS(int[] nums) {
        int len=nums.length;
        int res=0;
        int dp[]=new int[len];
        int index[]=new int[len];
        dp[0]=1;
        index[0]=0;
        for(int i=1;i<len;i++){
            if(nums[i]>nums[index[i-1]]){
                dp[i]=dp[i-1]++;
                index[i]=i;
            }else{
                dp[i]=dp[i-1];
                if(nums[i]>nums[index[i-2]])
                index[i]=index[i-1];
            }
        }
        res=dp[len-1];
        return res;
    }

}
