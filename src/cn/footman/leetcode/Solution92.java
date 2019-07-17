package cn.footman.leetcode;

/**
 * @author footman77
 * @create 2018-11-22 20:39
 */
public class Solution92 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode left = head;
        ListNode leftpre = null;
        ListNode right = head;
        ListNode rightpre = null;

        if(head.next == null ){
            return head;
        }
        if(m == n){
            return head;
        }
        for(int i = 1; i < m ; i++){
            leftpre = left;
            left = left.next;
        }
        for(int i = 1; i < n; i++){
            rightpre = right;
            right = right.next;
        }

        ListNode cur = left;
        ListNode pre = right.next;
        ListNode end = right.next;

        while (cur != end){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        if(leftpre == null){
            return pre;
        }
        leftpre.next = pre;
        return head;


    }
}
