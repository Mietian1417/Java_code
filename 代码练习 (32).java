// 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
// 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。

/*
public class Solution {
    public int jumpFloor(int target) {
        if(target == 1 || target == 2){
            return target;
        }
        return jumpFloor(target - 1) + jumpFloor(target - 2);
    }
}*/

//给出一个链表和一个值 ，以 为参照将链表划分成两部分，使所有小于 的节点都位于大于或等于 的节点之前。
//两个部分之内的节点之间要保持的原始相对顺序。
//例如：
//给出 1→4→3→2→5→21\to 4 \to 3 \to 2 \to 5 \to 21→4→3→2→5→2 和  x=3\ x = 3 x=3,
//返回 1→2→2→4→3→51\to 2 \to 2 \to 4 \to 3 \to 51→2→2→4→3→5.

/*
import java.util.*;

 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 


public class Solution {
*
     *
     * @param head ListNode类
     * @param x int整型
     * @return ListNode类
     

    public ListNode partition(ListNode head, int x) {
        // write code here
        if (head == null) {
            return null;
        }
        ListNode head1 = null;
        ListNode end1 = null;
        ListNode head2 = null;
        ListNode end2 = null;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val < x) {
                if (head1 == null) {
                    head1 = cur;
                    end1 = cur;
                } else {
                    end1.next = cur;
                    end1 = end1.next;
                }
            } else {
                if (head2 == null) {
                    head2 = cur;
                    end2 = cur;
                } else {
                    end2.next = cur;
                    end2 = end2.next;
                }
            }
            cur = cur.next;
        }
        //第一个区域没有数据，返回第二个头结点
        if (head1 == null) {
            return head2;
        }
        end1.next = head2;
        //防止形成循环链表
        if (head2 != null) {
            end2.next = null;
        }
        return head1;
    }
}
*/