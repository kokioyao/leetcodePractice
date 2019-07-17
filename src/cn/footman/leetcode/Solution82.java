package cn.footman.leetcode;

import cn.footman.listnode.ListNode;
import org.junit.Test;

/**
 * @author footman77
 * @create 2018-11-23 14:07
 */
public class Solution82 {

    @Test
    public void test(){
        int[] nums = {1,1,1,3,3};
        ListNode head = new ListNode(nums);
        ListNode head1 = deleteDuplicates(head);
        System.out.println(head1);
    }


    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode cur = head;
        ListNode pre = dummyHead;
        boolean flag = false;
        while (cur != null){
            flag = false;
            while (cur.next != null && cur.val == cur.next.val ){
                flag = true;
                cur.next = cur.next.next;
            }

            if(flag){
                ListNode next = cur.next;
                pre.next = next;
                cur = next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        if(dummyHead.next == null){
            return null;
        }
        return dummyHead.next;
    }
}
