package user;

import operation.*;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-22
 * Time: 14:37
 */
public class AdminUser extends User {
    public AdminUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DeleteOperation(),
                new DisplayOperation()
        };
    }

    public void menu() {
        System.out.println("-------------------------");
        System.out.println("------- 管理员菜单 -------");
        System.out.println("--------1.查找图书--------");
        System.out.println("--------2.新增图书--------");
        System.out.println("--------3.删除图书--------");
        System.out.println("--------4.显示所有图书-----");
        System.out.println("---------0.退出系统-------");
        System.out.println("-------------------------");
    }

}
