package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;

/**
 * @author footman77
 * @create 2018-11-29 19:51
 */
public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {

        if(root == null){
            return 0;
        }
        int sum = 0;
        if(root.left != null && root.left.left == null && root.left.right == null){
           sum = root.left.val;
        }

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + sum;


    }
}
