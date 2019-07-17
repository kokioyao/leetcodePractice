package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;

/**
 * @author footman77
 * @create 2018-11-30 12:32
 */
public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null){
            return null;
        }
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right,p,q);
        }

        return root;

    }
}
