package operation;

import book.Book;
import book.BookShelf;


import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-22
 * Time: 14:49
 */
public class FindOperation implements IOperation {
    @Override
    public void work(BookShelf bookShelf) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("查找图书！");
        System.out.print("请输入你要查找的书名：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookShelf.getAllBooksCount(); i++) {
            Book book = bookShelf.getBook(i);
            if (name.equals(book.getName())) {
                System.out.println("找到此书，信息如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有此书！");
    }
}
