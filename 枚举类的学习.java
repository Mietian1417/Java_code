import java.util.*;

enum Color {
    RED("红"), BLUE("蓝"), GREEN("绿"),
    BLACK("黑"), WHITE("白");

    private Color(String Chinese) {
        this.Chinese = Chinese;
    }

    public String getChinese() {
        return Chinese;
    }

    private final String Chinese;
}

public class ColorTest {
    public static void main(String[] args) {
        Color red = Color.RED;
        System.out.println(red.getChinese());

        //toString方法：返回枚举常量名
        System.out.println(Color.GREEN.toString());

        //values方法（静态）：返回一个包含全部枚举常量的数组
        Color[] colors = Color.values();
        System.out.println(Arrays.toString(colors));

        //ordinal方法：返回enum声明中的的位置（从0开始计数）
        System.out.println(Color.GREEN.ordinal());

        /*compareTo(E other)方法：返回一个整数，如果枚举常量出现在other之前，
        返回负整数，如果this==other，返回0，否则返回正整数*/
        System.out.println(red.compareTo(Color.GREEN));

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a color: (RED, BLUE, GREEN, BLACK, WHITE)");
        String input = reader.next().toUpperCase();

        //valueOf方法（静态）：返回枚举类有指定名字的枚举常量
        Color color = Enum.valueOf(Color.class, input);
        System.out.println("color=" + color);
        System.out.println("Chinese=" + color.getChinese());
        if (color == Color.RED) {
            System.out.println("This color represents luck!");
        }
    }
}
