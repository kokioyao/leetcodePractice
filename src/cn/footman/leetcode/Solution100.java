package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;

/**
 * @author footman77
 * @create 2018-11-29 16:32
 */
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null){
            return true;
        }

        if(p.val == q.val){
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }else {
            return false;
        }

    }
}
