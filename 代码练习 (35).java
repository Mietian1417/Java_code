// 删除字符集合的相同字符，从左到右，多组输入
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            sb.append(scanner.nextLine());
            for(int i = 0;i<sb.length() - 1;i++){
                for(int j = i + 1; j < sb.length();j++){
                    if(sb.charAt(i)==sb.charAt(j)){
                        sb.replace(j,j+1," ");
                    }
                }
            }
            String str=sb.toString();
            System.out.println(str.replaceAll(" ", ""));
        }
    }
}