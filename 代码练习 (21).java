//输入两个无环的单链表，找出它们的第一个公共结点。
// （注意因为传入数据是链表，
// 所以错误测试数据的提示是用其他方式显示的，
// 保证传入数据是正确的）

/*
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = 0;
        int len2 = 0;
        ListNode shortNode = pHead1;
        ListNode longNode = pHead2;
        //计算链表长度
        while (shortNode != null) {
            len1++;
            shortNode = shortNode.next;
        }
        while (longNode != null) {
            len2++;
            longNode = longNode.next;
        }
        shortNode = pHead1;
        longNode = pHead2;
        int len = len2 - len1;
        if (len < 0) {
            len = len1 - len2;
            shortNode = pHead2;
            longNode = pHead1;
        }
        while (len != 0) {
            longNode = longNode.next;
            len--;
        }
        while (shortNode != longNode) {
            shortNode = shortNode.next;
            longNode = longNode.next;
        }
        //没有交点
        if (shortNode == null) {
            return null;
        }
        return shortNode;
    }
}
*/
