package cn.footman.leetcode;

import cn.footman.listnode.ListNode;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.junit.Test;

/**
 * @author footman77
 * @create 2018-11-23 15:30
 */
public class Solution24 {
    @Test
    public void test(){
        int[] nums = {1,2,3,4,5};
        ListNode head = new ListNode(nums);
        ListNode head2 = swapPairs(head);
        System.out.println(head2);

    }
    public ListNode swapPairs(ListNode head) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode p = dummyHead;
        while (p.next != null && p.next.next != null){
            ListNode node1 = p.next;
            ListNode node2 = p.next.next;
            ListNode next = p.next.next.next;

            p.next = node2;
            node2.next = node1;
            node1.next = next;

            p = p.next.next;
        }

        return dummyHead.next;

    }
}
