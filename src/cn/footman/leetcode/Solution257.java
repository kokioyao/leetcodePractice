package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author footman77
 * @create 2018-11-29 22:59
 */
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        if(root.left == null && root.right == null){
            res.add(Integer.toString(root.val));
            return res;
        }

        List<String> leftPaths = binaryTreePaths(root.left);
        for(String s : leftPaths){
            res.add(Integer.toString(root.val) + "->" + s);
        }

        List<String> rightPaths = binaryTreePaths(root.right);
        for(String s : rightPaths){
            res.add(Integer.toString(root.val) + "->" + s);
        }

        return res;
    }
}
