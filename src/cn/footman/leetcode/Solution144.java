package cn.footman.leetcode;



import cn.footman.listnode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author footman77
 * @create 2018-11-23 23:03
 */
public class Solution144 {


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root,list);
        return list;

    }
    private void preorderTraversal(TreeNode root,List<Integer> list){
        if(root != null){
            list.add(root.val);
            preorderTraversal(root.left,list);
            preorderTraversal(root.right,list);
        }
    }
}
