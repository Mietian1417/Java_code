//翻转单链表
    public void overTurn1() {
        if (this.head == null) {
            return;
        }
        if (this.head.next == null) {
            return;
        }
        Node cur = this.head;
        Node curNext = cur.next;
        cur.next = null;
        cur = curNext;
        while (cur != null) {
            curNext = cur.next;
            cur.next = this.head;
            this.head = cur;
            cur = curNext;
        }
    }

    //翻转单链表
    public void overTurn2() {
        Node prev = null;
        Node cur = this.head;
        Node curNext = null;
        while (cur != null) {
            curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        this.head = prev;
    }

    //找到中间节点，如果有两个，返回后面的节点
    public Node middleNode() {
        Node slow = this.head;
        Node fast = this.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        assert slow != null;
        return slow;
    }

    //找到倒数第k个节点
    public Node lastNumber(int k) {
        if (k <= 0 || k > this.size()||this.head==null) {
            return null;
        }
        Node slow = this.head;
        Node fast = this.head;
        while (k - 1 != 0) {
            fast = fast.next;
            k--;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }