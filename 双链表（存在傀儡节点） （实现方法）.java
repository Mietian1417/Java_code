public class LinkedNodeList {
    public Node head = new Node();
    public Node last = new Node();

    public void createHeadNode(int value) {
        this.head.value = value;
        this.last = this.head;
    }

    //头插法
    public void addFirst(int value) {
        Node node = new Node(value);
        if (this.head.next == null) {
            this.head.next = node;
            this.last = node;
            node.prev = this.head;
        } else {
            node.next = this.head.next;
            this.head.next.prev = node;
            this.head.next = node;
            node.prev = this.head;
        }
    }

    //尾插法
    public void addLast(int value) {
        Node node = new Node(value);
        this.last.next = node;
        node.prev = this.last;
        this.last = node;
    }

    //插入从1号下标开始计数（不算头结点）
    public void addIndex(int index, int value) {
        if (index <= 1 && index >= size()) {
            return;
        }
        int count = 0;
        Node cur = this.head.next;
        Node node = new Node(value);
        while (count + 1 != index) {
            cur = cur.next;
            count++;
        }
        node.next = cur.next;
        cur.next.prev = node;
        cur.next = node;
        node.prev = cur;
    }

    //查看key关键字是否在双链表中
    public boolean contains(int key) {
        Node cur = this.head.next;
        while (cur != null) {
            if (key == cur.value) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现的key关键字
    public void remove(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.value == key) {
                cur.next = cur.next.next;
                if (cur.next != null) {
                    cur.next.prev = cur;
                } else {
                    this.last = cur;
                }
                return;
            }
            cur = cur.next;
        }
    }

    //删除所有的关键字key
    public void removeAllKey(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (key == cur.next.value) {
                cur.next = cur.next.next;
                if (cur.next != null) {
                    cur.next.prev = cur;
                } else {
                    this.last = cur;
                }
            } else {
                cur = cur.next;
            }
        }
    }

    //得到双链表长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //打印
    public void printFirst() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //反向打印
    public void printLast() {
        Node cur = this.last;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.prev;
        }
        System.out.println();
    }

    public void rudelyClear() {
        this.head = null;
        this.last = null;
    }

    public void strictClear() {
        Node cur = this.head;
        Node curNext;
        while (cur != null) {
            curNext = cur.next;
            cur.prev = null;
            cur.next = null;
            cur = curNext;
        }
        this.head = null;
        this.last = null;
    }
}
