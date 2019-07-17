package cn.footman.leetcode;

import cn.footman.listnode.ListNode;
import org.junit.Test;

/**
 * @author footman77
 * @create 2018-11-23 14:55
 */
public class Solution21 {

    @Test
    public void test(){
        int[] nums1 = {1,2,4};
        int[] nums2 = {1,3,4};
        ListNode l1 = new ListNode(nums1);
        ListNode l2 = new ListNode(nums2);

        ListNode listNode = mergeTwoLists(l1, l2);
        System.out.println(listNode);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode head = result;
        while (l1 != null && l2!= null){
            if(l1.val > l2.val){
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }else {
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            head = head.next;

        }
        while (l1 == null && l2 != null){
            head.next = new ListNode(l2.val);
            l2 = l2.next;
            head = head.next;
        }
        while (l2 == null && l1 != null){
            head.next = new ListNode(l1.val);
            l1 = l1.next;
            head = head.next;
        }

        return result.next;
    }

}
