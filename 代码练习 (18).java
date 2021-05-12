//输入一个链表，反转链表后，输出新链表的表头。
//public class Solution {
//    public ListNode ReverseList(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        if (head.next == null) {
//            return head;
//        }
//        ListNode cur = head;
//        ListNode curNext = cur.next;
//        cur.next = null;
//        cur = curNext;
//        while (cur != null) {
//            curNext = cur.next;
//            cur.next = head;
//            head = cur;
//            cur = curNext;
//        }
//        return head;
//    }
//}

// 输入一个链表，输出该链表中倒数第k个结点。
// 如果该链表长度小于k，请返回空。

//方法一

//import java.util.*;
//
/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param pHead ListNode类
//     * @param k     int整型
//     * @return ListNode类
//     */
//    public ListNode FindKthToTail(ListNode pHead, int k) {
//        // write code here
//        int count = 0;
//        ListNode cur = pHead;
//        while (cur != null) {
//            cur = cur.next;
//            count++;
//        }
//        if (k > count || k == 0) {
//            return null;
//        }
//        ListNode slow = pHead;
//        ListNode fast = pHead;
//        while (k - 1 != 0) {
//            fast = fast.next;
//            k--;
//        }
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return slow;
//    }
//}

//方法二
//import java.util.*;
//
///*
// * public class ListNode {
// *   int val;
// *   ListNode next = null;
// *   public ListNode(int val) {
// *     this.val = val;
// *   }
// * }
// */
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param pHead ListNode类
//     * @param k     int整型
//     * @return ListNode类
//     */
//    public ListNode FindKthToTail(ListNode pHead, int k) {
//        // write code here
//        int count = 0;
//        int temp = k;
//        if (temp == 0 || pHead == null) {
//            return null;
//        }
//        ListNode slow = pHead;
//        ListNode fast = pHead;
//        while (k - 1 != 0) {
//            fast = fast.next;
//            count++;
//            if (fast == null) {
//                return null;
//            }
//            k--;
//        }
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next;
//            count++;
//        }
//        count++;
//        if (temp > count) {
//            return null;
//        }
//        return slow;
//    }
//}
