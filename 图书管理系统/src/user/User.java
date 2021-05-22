package user;

import book.BookShelf;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-22
 * Time: 14:36
 */
public abstract class User {
    public String name;

    protected IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }

    public abstract void menu();

    public void doOperation(int choice, BookShelf bookShelf) {
        this.iOperations[choice].work(bookShelf);
    }
}
