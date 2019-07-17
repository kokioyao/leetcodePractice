package cn.footman.leetcode;

import cn.footman.listnode.ListNode;
import org.junit.Test;

/**
 * @author footman77
 * @create 2018-11-23 21:51
 */
public class Solution61 {

    @Test
    public void test(){
        int[] nums = {0,1,2};
        ListNode head = new ListNode(nums);
        ListNode node = rotateRight(head, 4);
        System.out.println(node);

    }
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null){
            return null;
        }

        ListNode p = head;
        int longth = 0;
        ListNode q = head; //循环之后变最后一个节点
        ListNode cur = head;
        for(; cur != null; cur = cur.next){
            q = cur;
            longth++;
        }

        q.next = p;

        while (k > longth){
            k = k - longth;
        }

        for(int i = 0; i < longth - k; i++){
            p = p.next;
            q = q.next;
        }

        q.next = null;
        return p;


    }
}
