/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-07
 * Time: 21:02
 */
public class Test {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);

        int r = myStack.push(8);
        System.out.println(r);

        myStack.disPlay();

        myStack.pop();
        myStack.disPlay();

        int ret1 = myStack.peek();
        System.out.println(ret1);
        myStack.disPlay();


        int ret2 = myStack.search(5);
        System.out.println(ret2);

        boolean ret3 = myStack.empty();
        System.out.println(ret3);

    }
}
