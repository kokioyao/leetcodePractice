package cn.footman.leetcode;

import cn.footman.listnode.ListNode;

import java.util.Stack;

/**
 * @author footman77
 * @create 2018-11-23 11:27
 */
public class Solution445 {



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode curl1 = l1;
        ListNode curl2 = l2;

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        while (curl1 != null){
            st1.push(curl1.val);
            curl1 = curl1.next;
        }
        while (curl2 != null){
            st2.push(curl2.val);
            curl2 = curl2.next;
        }
        int carry = 0;
        int sum = 0;
        ListNode next = null;
        while (!st1.isEmpty() && !st2.isEmpty()){
            int x = st1.pop();
            int y = st2.pop();

            sum = carry + x + y;
            carry = sum / 10;

            ListNode cur = new ListNode(sum % 10);
            cur.next = next;
            next = cur;
        }

        if(!st1.isEmpty()){
            while (!st1.isEmpty()){

                int x = st1.pop();

                sum = carry + x;
                carry = sum / 10;

                ListNode cur = new ListNode(sum % 10);
                cur.next = next;
                next = cur;
            }
        }else {
            while (!st2.isEmpty()){

                int x = st2.pop();

                sum = carry + x;
                carry = sum / 10;

                ListNode cur = new ListNode(sum % 10);
                cur.next = next;
                next = cur;
            }
        }

        if(carry > 0){
            ListNode cur = new ListNode(carry);
            cur.next = next;
            next = cur;
        }

        return next;

    }
}
