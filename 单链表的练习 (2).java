//以某数为基准，重新排列单链表
    public Node sort(int x) {
        if (this.head == null) {
            return null;
        }
        Node head1 = null;
        Node end1 = null;
        Node head2 = null;
        Node end2 = null;
        Node cur = this.head;
        while (cur != null) {
            if (cur.value < x) {
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



//合并两个有序单链表，并且返回新的头结点
    public static Node mergeTwoLists(Node head1, Node head2) {
        Node newHead = new Node();
        Node cur = newHead;
        if (head1 == null || head2 == null) {
            return null;
        }
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                cur.next = head1;
                head1 = head1.next;
                cur = cur.next;
            } else {
                cur.next = head2;
                head2 = head2.next;
                cur = cur.next;
            }
        }
        if (head1 == null) {
            cur.next=head2;
        } else {
            cur.next=head1;
        }
        return newHead.next;
    }