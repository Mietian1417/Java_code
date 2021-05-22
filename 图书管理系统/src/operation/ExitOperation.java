package operation;

import book.BookShelf;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-22
 * Time: 14:53
 */
public class ExitOperation implements IOperation {
    @Override
    public void work(BookShelf bookShelf) {
        System.out.println("退出图书管理系统！");
        System.exit(0);
    }
}
