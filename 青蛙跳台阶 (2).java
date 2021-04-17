import java.util.*;

public class test{
    public static int frogJump(int x){
        if (x == 1) {
            return 1;
        } else if (x == 2) {
            return 2;
        }
        else{
            return frogJump(x-1)+frogJump(x-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入青蛙要跳的台阶数：");
        Scanner reader=new Scanner(System.in);
        int a=reader.nextInt();
        System.out.println("青蛙有"+frogJump(a)+"种跳法");
    }
}
