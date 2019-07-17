package cn.footman.leetcode;

import cn.footman.listnode.ListNode;
import org.junit.Test;

/**
 * @author footman77
 * @create 2018-11-22 20:29
 */
public class Solution206 {



    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;


        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    @Test
    public void test(){
        int[] arr = {1,2,3,4,5};
        ListNode head = new ListNode(arr);
        System.out.println(head);

        head = reverseList(head);
        System.out.println(head);
    }
}
