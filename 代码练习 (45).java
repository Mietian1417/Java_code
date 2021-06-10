package 日常练习.实现循环队列;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-10
 * Time: 11:36
 */

//设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
//
//循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。
//
//你的实现应该支持如下操作：
//
//MyCircularQueue(k): 构造器，设置队列长度为 k 。
//Front: 从队首获取元素。如果队列为空，返回 -1 。
//Rear: 获取队尾元素。如果队列为空，返回 -1 。
//enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
//deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
//isEmpty(): 检查循环队列是否为空。
//isFull(): 检查循环队列是否已满。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/design-circular-queue
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

class MyCircularQueue {

    private int[] elem;
    private int front;
    private int real;
    public MyCircularQueue(int k) {
        this.elem = new int[k + 1];
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }

        this.elem[this.real] = value;
        this.real = (this.real + 1) % this.elem.length;

        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }

        this.front = (this.front + 1) % this.elem.length;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }

        return this.elem[this.front];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        if(this.real == 0){
            return this.elem[this.elem.length - 1];
        }

        return this.elem[this.real - 1];

    }

    public boolean isEmpty() {
        return this.front == this.real;
    }

    public boolean isFull() {
        return (this.real + 1) % this.elem.length == this.front;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */