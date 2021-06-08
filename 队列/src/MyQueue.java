/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-08
 * Time: 18:54
 */
public class MyQueue {
    public Node first;
    public Node last;

    //入队
    public void offer(int data) {
        Node node = new Node(data);
        if (empty()) {
            this.first = node;
            this.last = node;
            return;
        }

        this.last.next = node;
        this.last = node;

    }

    //出队
    public int poll() {
        if (empty()) {
            throw new UnsupportedOperationException("队列为空！");
        }

        int ret = this.first.data;
        this.first = this.first.next;
        return ret;
    }

    //得到队列的头的数据
    public int peek() {
        if (empty()) {
            throw new UnsupportedOperationException("队列为空！");
        }

        return this.first.data;
    }

    //队列是否为空
    public boolean empty() {
        return this.first == null;
    }

    //打印
    public void disPlay() {
        Node cur = this.first;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
