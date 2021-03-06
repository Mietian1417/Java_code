//打印日历
import java.time.*;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        int month=date.getMonthValue();
        int today=date.getDayOfMonth();

        date=date.minusDays(today-1);//date=today-(today-1) 当前月的第一天
        DayOfWeek weekday=date.getDayOfWeek();
        int value=weekday.getValue();


        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while(date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth()); //打印每个日期
            if(date.getDayOfMonth()==today){
                System.out.print("*");  //标记指定日期
            }
            else{
                System.out.print(" ");
            }
            date=date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1){
                System.out.println();
            }
        }
        if(date.getDayOfWeek().getValue()!=1){
            System.out.println();
        }
    }
}
