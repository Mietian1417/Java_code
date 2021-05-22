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
public class DeleteOperation implements IOperation {
    @Override
    public void work(BookShelf bookShelf) {
        System.out.println("删除图书！");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入输出图书的名称：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookShelf.getAllBooksCount(); i++) {
            Book book = bookShelf.getBook(i);
            if (name.equals(book.getName())) {
                for (int j = i; j < bookShelf.getAllBooksCount() - 1; j++) {
                    Book book1 = bookShelf.getBook(j + 1);
                    bookShelf.setBooks(j, book1);
                    //bookShelf.books[i]=bookShelf.books[i+1];
                }
                System.out.println("删除成功！");
                //防止内存泄漏
                bookShelf.setBooks(bookShelf.getAllBooksCount() - 1, null);
                bookShelf.setAllBooksCount(bookShelf.getAllBooksCount() - 1);
                return;
            }
        }
        System.out.println("不存在此书，无法删除！");
    }
}
