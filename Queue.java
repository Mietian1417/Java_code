package Iterable.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-08
 * Time: 18:41
 */
public class MethodTest {
    public static void main(String[] args) {
        Queue<Integer> queue =new LinkedList<>();
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);
        queue.add(9);
        
        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue.poll());
        System.out.println(queue.remove());

        System.out.println(queue);
    }
}