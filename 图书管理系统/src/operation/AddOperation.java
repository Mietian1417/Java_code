package operation;

import book.Book;
import book.BookShelf;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-22
 * Time: 14:45
 */
public class AddOperation implements IOperation {
    @Override
    public void work(BookShelf bookShelf) {
        System.out.println("新增图书！");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入书的名称：");
        String name = scanner.nextLine();
        System.out.print("请输入书的作者：");
        String author = scanner.nextLine();
        System.out.print("请输入书的类型：");
        String type = scanner.nextLine();
        System.out.print("请输入书的价格：");
        double price = scanner.nextDouble();
        for (int i = 0; i < bookShelf.getAllBooksCount(); i++) {
            Book book = bookShelf.getBook(i);
            if (name.equals(book.getName())) {
                System.out.println("存在该书，无法添加！");
                return;
            }
        }
        Book book = new Book(name, author, price, type);
        if (bookShelf.getAllBooksCount() == bookShelf.bookSize()) {
            bookShelf.books = Arrays.copyOf(bookShelf.books, 2 * bookShelf.bookSize());
        }
        bookShelf.setBooks(bookShelf.getAllBooksCount(), book);
        bookShelf.setAllBooksCount(bookShelf.getAllBooksCount() + 1);
        System.out.println("新增成功！");
    }
}
