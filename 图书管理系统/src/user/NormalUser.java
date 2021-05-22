package user;

import operation.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-22
 * Time: 14:37
 */
public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    public void menu() {
        System.out.println("-------------------------");
        System.out.println("------- 普通用户菜单 -------");
        System.out.println("--------1.查找图书--------");
        System.out.println("--------2.借阅图书--------");
        System.out.println("--------3.归还图书--------");
        System.out.println("--------0.退出系统--------");
    }
}
