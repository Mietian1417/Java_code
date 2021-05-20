//编写一个日期类，要求按xxxx-xx-xx 的格式输出日期，实现加一天的操作。
//输入描述:
//输入第一行表示测试用例的个数m，接下来m行每行有3个用空格隔开的整数，
//分别表示年月日。测试数据不会有闰年。
//输出描述:
//输出m行。按xxxx-xx-xx的格式输出，表示输入日期的后一天的日期。


import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int year,month,day;
        int temp[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        while(m-- > 0){
            year = sc.nextInt();
            month = sc.nextInt();
            day = sc.nextInt();
            if(month==12 && day==31){
                year++;
                month = 1;
                day = 1;
            }else{
                if(day<temp[month]){
                    day++;
                }else{
                    month++;
                    day = 1;
                }
             }
            System.out.printf("%04d-%02d-%02d",year,month,day);
            System.out.println();
        }
    }
}