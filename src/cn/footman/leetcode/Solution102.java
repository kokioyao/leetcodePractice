package cn.footman.leetcode;

import cn.footman.listnode.TreeNode;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author footman77
 * @create 2018-11-24 14:53
 */
public class Solution102 {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> lists = new ArrayList<>();

        if(root == null){
            return lists;
        }

        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.addLast(new Pair<>(root,0));

        while (!queue.isEmpty()){
            Pair<TreeNode, Integer> front = queue.removeFirst();
            TreeNode node = front.getKey();
            int level = front.getValue();

            if(level == lists.size()){
                lists.add(new ArrayList<Integer>());
            }

            lists.get(level).add(node.val);
            if(node.left != null){
                queue.addLast(new Pair<>(node.left,level + 1));
            }
            if(node.right != null){
                queue.addLast(new Pair<>(node.right,level + 1));
            }

        }
        return lists;

    }
}
