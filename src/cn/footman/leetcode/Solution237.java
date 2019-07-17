package cn.footman.leetcode;

import cn.footman.listnode.ListNode;

/**
 * @author footman77
 * @create 2018-11-23 17:33
 */
public class Solution237 {
    public void deleteNode(ListNode node) {
        if(node == null || node.next ==null){
            throw new IllegalArgumentException("error");
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
