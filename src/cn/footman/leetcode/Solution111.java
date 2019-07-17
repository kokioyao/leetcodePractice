package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;

/**
 * @author footman77
 * @create 2018-11-29 15:20
 */
public class Solution111 {
    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if(left > 0 && right > 0){
            return 1 + Math.min(left,right);
        }else {
            return left + right + 1;
        }


    }


}
