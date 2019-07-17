package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;

/**
 * @author footman77
 * @create 2018-11-29 20:50
 */
public class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {

        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            return root.val == sum;
        }

        return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum - root.val);

    }
}
