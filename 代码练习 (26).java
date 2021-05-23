//将两个有序的链表合并为一个新链表，
//要求新的链表是通过拼接两个链表的节点来生成的，且合并后新链表依然有序。

import java.util.*;
 
/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
 
public class Solution {
    /**
     *
     * @param l1 ListNode类
     * @param l2 ListNode类
     * @return ListNode类
     */
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        ListNode head = new ListNode(0);
        ListNode tail = head;
 
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if(l1 == null && l2 != null){
            tail.next = l2;
        }
        if(l1 != null && l2 == null){
            tail.next = l1;
        }
        return head.next;
    }
}