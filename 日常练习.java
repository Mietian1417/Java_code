//给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。
//
//每次「迁移」操作将会引发下述活动：
//
//    位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
//    位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。
//    位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。
//
//请你返回 k 次迁移操作后最终得到的 二维网格。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/shift-2d-grid
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

/*
public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for (int a = 0; a < k; a++) {
            int j;
            int[] temp = new int[10];
            int tempLast = 0;
            for (int i = grid.length - 1; i >= 0; i--) {
                for (j = grid[i].length - 1; j >= 0; j--) {
                    if (j == grid[i].length - 1) {
                        temp[i] = grid[i][j];
                        if (i == grid.length - 1) {
                            tempLast = temp[i];
                        }
                    }
                    if (j != grid[i].length - 1) {
                        grid[i][j + 1] = grid[i][j];
                    }
                }
                if (i < grid.length - 1) {
                    grid[i + 1][0] = temp[i];
                }
            }
            grid[0][0] = tempLast;
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            lists.add(new ArrayList<>());
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                lists.get(i).add(grid[i][j]);
            }
        }
        return lists;
    }
}

class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<List<Integer>> lists = solution.shiftGrid(array, 1);
        System.out.println(lists);
    }
}*/


//在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。
//
//如果小镇的法官真的存在，那么：
//
//    小镇的法官不相信任何人。
//    每个人（除了小镇法官外）都信任小镇的法官。
//    只有一个人同时满足属性 1 和属性 2 。
//
//给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示标记为 a 的人信任标记为 b 的人。
//
//如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的标记。否则，返回 -1。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/find-the-town-judge
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    
/*
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustOther = new int[n];
        int[] otherTrust = new int[n];
        for(int[] t : trust){
            trustOther[t[0] - 1]++;
            otherTrust[t[1] - 1]++;
        }
        for(int i = 0; i < n; i++){
            if(trustOther[i] == 0 && otherTrust[i] == n - 1){
                return i + 1;
            }
        }
        return -1;
    }
}*/

//设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
//
//在链表类中实现这些功能：
//
//    get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
//    addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
//    addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
//    addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
//    deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/design-linked-list
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class MyLinkedList {

    public Node head;
    class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
    }
    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index<0){
            return -1;
        }
        Node cur =this.head;
        int count =0;
        while(index!=count&&cur!=null){
            count++;
            cur=cur.next;
        }
        if(cur==null){
            return -1;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node =new Node(val);
        if(head == null){
            this.head=node;
            node.next=null;
            return;
        }
        node.next=this.head;
        this.head=node;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node =new Node(val);
        if(this.head==null){
            this.head=node;
            node.next=null;
            return;
        }

        Node cur =this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);
            return;
        }
        Node cur =this.head;
        Node node =new Node(val);
        int count=0;
        while(count+1!=index&&cur.next!=null){
            count++;
            cur=cur.next;
        }
        if(cur==null){
            return;
        }
        node.next=cur.next;
        cur.next=node;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index==0){
            this.head=this.head.next;
        }
        int count =0;
        Node cur =this.head;
        while(count+1!=index&&cur!=null){
            count++;
            cur=cur.next;
        }
        if(cur==null){
            return;
        }
        if(cur.next==null){
            cur=null;
            return;
        }
        cur.next=cur.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
