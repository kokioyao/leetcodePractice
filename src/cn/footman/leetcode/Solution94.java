package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author footman77
 * @create 2018-11-23 23:11
 */
public class Solution94 {


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root,list);
        return list;
    }

    private void inorderTraversal(TreeNode root,List<Integer> list){
        if(root != null){
            inorderTraversal(root.left,list);
            list.add(root.val);
            inorderTraversal(root.right,list);

        }
    }
}
