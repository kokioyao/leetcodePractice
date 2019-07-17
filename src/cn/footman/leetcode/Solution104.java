package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;

/**
 * @author footman77
 * @create 2018-11-29 15:04
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        return 1 + Math.max(maxDepth(root.right),maxDepth(root.left));
    }
}
