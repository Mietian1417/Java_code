//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。

/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode cur = listNode;
        ListNode curNext = null;
        ListNode prev = null;
        while(cur != null){
            curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        while(prev != null){
            list.add(prev.val);
            prev = prev.next;
        }
        return list;
    }
}
