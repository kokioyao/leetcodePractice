package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;
import com.sun.org.apache.bcel.internal.generic.IFLE;

/**
 * @author footman77
 * @create 2018-11-29 16:45
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {

        if(root == null){
            return true;
        }

        return isMirror(root.left,root.right);

    }


    private boolean isMirror(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }

        if(left != null && right != null && left.val == right.val){
            return isMirror(left.left,right.right) && isMirror(left.right,right.left);
        }else {
            return false;
        }

    }
}
