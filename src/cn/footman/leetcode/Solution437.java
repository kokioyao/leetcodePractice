package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;

/**
 * @author footman77
 * @create 2018-11-30 10:44
 */
public class Solution437 {
    public int pathSum(TreeNode root, int sum) {

        if(root == null){
            return 0;
        }

        return findPath(root,sum) +
                pathSum(root.left,sum) +
                pathSum(root.right,sum);

    }

    private int findPath(TreeNode node,int sum){

        if(node == null){
            return 0;
        }

        int res = 0;
        if(node.val == sum){
            res += 1;
        }

        res += findPath(node.left,sum - node.val);
        res += findPath(node.right, sum - node.val);
        return res;
    }
}
