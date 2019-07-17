package cn.footman.leetcode;

import cn.footman.listnode.ListNode;
import org.junit.Test;

/**
 * @author footman77
 * @create 2018-11-22 22:46
 */
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            throw new IllegalArgumentException("error");
        }

        ListNode pre = head;
        ListNode cur = head.next;

        while (cur != null){
            if(cur.val == pre.val){
                cur = cur.next;
                pre.next = cur;
            }else {
                pre = cur;
                cur = cur.next;

            }

        }
        return head;
    }
    @Test
    public void test(){
        int[] arr = {1,1,2,3,3};
        ListNode head = new ListNode(arr);
        System.out.println(head);
        head = deleteDuplicates(head);
        System.out.println(head);
    }


    public ListNode deleteDuplicatesTwo(ListNode head){
        ListNode current = head;
        if(current != null && current.next != null){
            if(current.next.val == current.val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return head;
    }

}
