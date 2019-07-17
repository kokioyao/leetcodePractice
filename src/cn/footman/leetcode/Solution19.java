package cn.footman.leetcode;

import cn.footman.listnode.ListNode;

/**
 * @author footman77
 * @create 2018-11-23 18:31
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode p = dummyHead;
        ListNode q = dummyHead;

        for(int i = 0; i < n + 1; i++){
            q = q.next;
        }

        while (q != null){
            q = q.next;
            p = p.next;
        }

        p.next = p.next.next;

        return dummyHead.next;
    }
}
