import java.util.Scanner;

public class test{
    //移动过程
    public static void hanoiMove(char pos1,char pos2){
        System.out.print(pos1+" -> "+pos2+"  ");
    }
    //汉诺塔基本实现逻辑
    public static void hanoi(int x,char pos1,char pos2,char pos3){
        if(x==1){
            hanoiMove(pos1,pos3);
        }
        //移动分为两个过程
        else{
            //先将n-1个盘子从pos1借助pos3移到pos2上
            hanoi(x-1,pos1,pos3,pos2);
            //打印移动过程
            hanoiMove(pos1,pos3);
            //再将n-1个盘子从pos2借助pos1移到pos3上
            hanoi(x-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入要移动盘子的数量：");
        Scanner reader=new Scanner(System.in);
        while(reader.hasNextInt()){
            int a=reader.nextInt();
            hanoi(a,'A','B','C');
            System.out.println();
        }
    }
}
