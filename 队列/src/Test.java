import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-08
 * Time: 19:16
 */
public class Test {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(5);
        myQueue.offer(6);
        myQueue.offer(7);
        myQueue.offer(8);
        myQueue.offer(9);

        myQueue.disPlay();

        int ret = myQueue.peek();
        System.out.println(ret);

        int ret1 = myQueue.poll();
        System.out.println(ret1);

        myQueue.disPlay();

        boolean flag = myQueue.empty();
        System.out.println(flag);

        myQueue.poll();
        myQueue.poll();
        myQueue.poll();
        myQueue.poll();
        myQueue.disPlay();
        boolean flag1 = myQueue.empty();
        System.out.println(flag1);

    }
}
