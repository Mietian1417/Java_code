/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-12
 * Time: 19:58
 */

public class LinkedList {
    public Node head;
    public Node last;

    //头插法
    public void addFirst(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }

    //尾插法
    public void addLast(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        this.last.next = node;
        node.prev = this.last;
        this.last = node;
    }

    //任意位置插入（第一个数据节点为0号下标）
    public void addIndex(int index, int value) {
        if (this.head == null) {
            return;
        }
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        Node cur = this.head;
        int count = 0;
        while (count + 1 != index) {
            cur = cur.next;
            count++;
        }
        node.next = cur.next;
        cur.next.prev = node;
        cur.next = node;
        node.prev = cur;
    }

    //查找是否包含关键字key是否在双链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.value == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        if (this.head.value == key) {
            this.head = this.head.next;
            this.head.prev = null;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.value == key) {
                cur.next = cur.next.next;
                if (cur.next != null) {
                    //key关键字的节点不是尾结点
                    cur.next.prev = cur;
                } else {
                    //key关键字的节点是尾结点
                    this.last = cur;
                }
                return;
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (this.head == null) {
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.value == key) {
                cur.next = cur.next.next;
                if (cur.next != null) {
                    //key关键字的节点不是尾结点
                    cur.next.prev = cur;
                } else {
                    //key关键字的节点是尾结点
                    this.last = cur;
                }
            } else {
                cur = cur.next;
            }
        }
        if (this.head.value == key) {
            this.head = this.head.next;
            //防止只有一个节点
            if (this.head != null) {
                this.head.prev = null;
            } else {
                //如果只有空节点，头结点和尾结点都要置空
                this.last = null;
            }
        }
    }

    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    //打印双链表
    public void printFirst() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //反向打印（可以测双链表尾结点的操作是否正确）
    public void printLast() {
        Node cur = this.last;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.prev;
        }
        System.out.println();
    }

    //清空双链表
    public void clear() {
        this.head = null;
        this.last = null;
    }
}

