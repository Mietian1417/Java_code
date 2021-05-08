import java.util.*;

class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }
}

class NodeTest {
    public Node head;

    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if (this.head == null) {
            this.head = node;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public void deleteAll(int key) {
        Node cur = this.head;
        if (cur == null) {
            return;
        }
        while (cur.next != null) {
            if (cur.next.value == key) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        if (this.head.value == key) {
            this.head = this.head.next;
        }
    }

    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    public void print() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NodeTest nodeTest = new NodeTest();
        int input = reader.nextInt();
        for (int i = 0; i < input; i++) {
            nodeTest.addLast(reader.nextInt());
        }
        nodeTest.deleteAll(reader.nextInt());
        System.out.println(nodeTest.size());
        nodeTest.print();
    }
}