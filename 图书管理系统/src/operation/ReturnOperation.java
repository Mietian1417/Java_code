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
public class ReturnOperation implements IOperation {
    @Override
    public void work(BookShelf bookShelf) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要归还的书的名称：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookShelf.getAllBooksCount(); i++) {
            Book book = bookShelf.getBook(i);
            if (name.equals(book.getName()) && book.isCondition()) {
                book.setCondition(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有此书，无法归还或该书没有借出！");
    }
}
