
    //删除单链表的重复数据（留一个数据本身）
    public void deleteRepeat() {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.value == cur.value) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
    }

    //删除有序单链表的重复数据
    public Node deleDuplication() {
        Node cur = this.head;
        Node newHead = new Node();
        Node tmp = newHead;
        while (cur != null) {
            if (cur.next != null && cur.value == cur.next.value) {
                while (cur.next != null && cur.value == cur.next.value) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;  //防止重复部分在末尾
        return newHead.next;
    }

    //判断单链表是否为回文结构
    public boolean chkPalindrome() {
        Node slow = this.head;
        Node fast = this.head;
        Node newHead = this.head;
        //找到中间节点
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node cur = slow.next;
        Node curNext = null;
        //翻转中间节点后面的链表
        while (cur != null) {
            curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;

        }
        while (newHead != slow) {
            if (newHead.value != slow.value) {
                return false;
            }
            //偶数情况下
            if (newHead.next == slow) {
                return true;
            }
            newHead = newHead.next;
            slow = slow.next;
        }
        return true;
    }



 //创造交点
    public static void getIntersection(Node head1, Node head2) {
        head1.next.next = head2.next;
    }

    //找到两个单链表相交的起始节点
    public static Node getIntersectionNode(Node head1, Node head2) {
        int len1 = 0;
        int len2 = 0;
        Node shortNode = head1;
        Node longNode = head2;
        //计算链表长度
        while (shortNode != null) {
            len1++;
            shortNode = shortNode.next;
        }
        while (longNode != null) {
            len2++;
            longNode = longNode.next;
        }
        shortNode = head1;
        longNode = head2;
        int len = len2 - len1;
        if (len < 0) {
            len = len1 - len2;
            shortNode = head2;
            longNode = head1;
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