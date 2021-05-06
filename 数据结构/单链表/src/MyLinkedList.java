/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-06
 * Time: 20:23
 */
public class MyLinkedList {
    public Node head;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //查找关键字key是否在单链表中
    public boolean contains(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.value==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    //删除第一次出现关键字key的节点
    public void remove(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.next.value==key){
                break;
            }
            cur=cur.next;
        }
        assert cur != null;
        cur.next=cur.next.next;
    }


    //打印链表
    public void print() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //任意位置插入（以第一个数据节点为0号下标为准）
    public void addIndex(int index,int data){
        if(index==0){
            this.addFirst(data);
            return;
        }
        if(index==this.size()){
            this.addLast(data);
            return;
        }

        Node node=new Node(data);
        Node cur=this.head;
        int count=0;
        //找到index位置的前一个节点
        while (count + 1 != index) {
            cur = cur.next;
            count++;
        }
        node.next=cur.next;
        cur.next=node;
    }


    //清空单链表
    public void clear(){
        this.head=null;
    }

    //计算链表长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

}

