我们在Node类中实现单链表的每个节点的内容
```java
public class Node {
    public int value;   //节点的数据
    public Node next;   //节点的引用

    //导入节点数据，next不需要初始化，默认为null
    public Node(int value) {
        this.value = value;
    }
}
```

为了只有一个头结点，我们在另外一个MylinkedList类中创建一个头结点
```java
public class MyLinkedList {
    public Node head;
}
```
由于我们要频繁依赖头结点，所以我们在该类中实现单链表的相应方法

**头插法**
```java
//头插法
    public void addFirst(int value) {
        Node node = new Node(value);
        //若一个数据都没有，直接将node节点设为头结点
        if (this.head == null) {
            this.head = node;
            return;
        }
        //节点连接
        node.next = this.head;
        this.head = node;
    }
```

**尾插法**
```java
//尾插法
    public void addLast(int value) {
        Node node = new Node(value);
        //若一个数据都没有，直接将node节点设为头结点
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        //找到尾结点，即节点的引用为null的节点（注意这里必须是cur.next，否则出现错误）
        while (cur.next != null) {
            cur = cur.next;
        }
        //节点连接
        cur.next = node;
    }
```

**插入数据**
```java
//从指定位置插入数据（以0开始计数）
    public void addIndex(int pos, int index) {
        Node node = new Node(index);
        if (pos == 0) {
            addFirst(index);
            return;
        }
        int count = 0;
        //找到pos位置的前一个节点
        Node cur = this.head;
        while (count + 1 != pos) {
            cur = cur.next;
            count++;
        }
        //节点连接
        node.next = cur.next;
        cur.next = node;
    }
```

**查找数据**
```java
//查找单链表是否包含元素data
    public boolean contains(int data) {
        Node cur = this.head;
        //遍历节点本身
        while (cur != null) {
            if (cur.value == data) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
```

**求链表长度**
```java
//链表长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        //遍历节点本身
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
```

**清空单链表**
```java
//清空链表（从头结点开始，依次失去被引用的对象，从而实现清空单链表）
    public void clear() {
        this.head = null;
    }
```

**删除第一个指定关键字**
```java
//删除单链表第一个关键字key
    public void delete(int key) {
        Node cur = this.head;
        //头结点的数据==key，直接指向头结点的下一个节点
        if (this.head.value == key) {
            this.head = this.head.next;
            return;
        }
        //找到节点数据为key的前一个节点
        while (cur.next != null) {
            if (cur.next.value == key) {
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }
```

**删除单链表所有指定关键字**
```java
 //删除单链表所有关键字key
    public void deleteAll(int key) {
        Node cur = this.head;
        //因为是cur.next遍历，无法判断头结点，最后补上头结点的判断
        while (cur.next != null) {
            if (cur.next.value == key) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        //判断头结点的数据是否等于key
        if (this.head.value == key) {
            this.head = this.head.next;
        }
    }
```

**打印单链表**
```java
//打印单链表
    public void print() {
        Node cur = this.head;
        //遍历节点本身
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
    }
}
```

