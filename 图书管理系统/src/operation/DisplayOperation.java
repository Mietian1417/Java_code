package operation;

import book.Book;
import book.BookShelf;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-22
 * Time: 14:51
 */
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookShelf bookShelf) {
        System.out.println("显示所有图书信息！");
        for (int i = 0; i < bookShelf.getAllBooksCount(); i++) {
            Book book = bookShelf.getBook(i);
            System.out.println(book);
        }
    }
}
