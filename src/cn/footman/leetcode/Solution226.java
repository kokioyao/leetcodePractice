package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;

/**
 * @author footman77
 * @create 2018-11-29 16:13
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }



        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;

        return root;
    }
}
