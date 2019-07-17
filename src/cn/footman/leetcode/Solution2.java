package cn.footman.leetcode;

import cn.footman.listnode.ListNode;
import org.junit.Test;

/**
 * @author footman77
 * @create 2018-11-22 23:23
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int num1 = 0;
        int num2 = 0;
        int carry = 0;

        while (l1 != null || l2 != null){
            num1 = (l1 != null) ? l1.val : 0 ;

            num2 = (l2 != null) ? l2.val : 0 ;

            int sum = carry + num1 + num2;

            carry = sum / 10;

            curr.next = new ListNode(sum % 10);

            curr = curr.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;


    }

    @Test
    public void test(){
        int[] nums1 = {9};
        int[] nums2 = {1,9,9,9,9,9,9,9,9,9};
        ListNode l1 = new ListNode(nums1);
        ListNode l2 = new ListNode(nums2);

        ListNode head = addTwoNumbers(l1, l2);
        System.out.println(head);
    }
}
