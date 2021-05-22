import book.BookShelf;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-22
 * Time: 14:57
 */
public class Main {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        while (true) {
            System.out.print("请输入你的身份：（1为管理员，0为普通用户）");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    return new AdminUser(name);
                case 0:
                    return new NormalUser(name);
                default:
                    System.out.println("选择错误，请重新选择！");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        User user = login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("您好，" + user.name + "，欢迎来到图书管理系统！");
        while (true) {
            user.menu();
            int choice = scanner.nextInt();
            user.doOperation(choice, bookShelf);
        }
    }


}
