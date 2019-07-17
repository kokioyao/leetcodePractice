package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;

/**
 * @author footman77
 * @create 2018-11-29 18:12
 */
public class Solution222 {
    public int countNodes(TreeNode root) {

        if(root == null){
            return 0;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;

        return countNodes(left) + countNodes(right) + 1;

    }
}
