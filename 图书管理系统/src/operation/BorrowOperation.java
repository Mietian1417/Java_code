package operation;

import book.Book;
import book.BookShelf;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-22
 * Time: 14:52
 */
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookShelf bookShelf) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要借阅的书的名称：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookShelf.getAllBooksCount(); i++) {
            Book book = bookShelf.getBook(i);
            if (name.equals(book.getName()) && !book.isCondition()) {
                book.setCondition(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("没有此书，无法借阅或者此书已借出！");
    }
}
