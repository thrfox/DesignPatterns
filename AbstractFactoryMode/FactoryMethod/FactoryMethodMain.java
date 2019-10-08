package AbstractFactoryMode.FactoryMethod;

import AbstractFactoryMode.Bean.Department;
import AbstractFactoryMode.Bean.IDepartment;
import AbstractFactoryMode.Bean.IUser;
import AbstractFactoryMode.Bean.User;

public class FactoryMethodMain {
    public static void main(String[] args) {
        User user = new User();
        // 此时只需要更改工厂，后面的不用动
//        IFactory factory = new SQLServerFactory();
        IFactory factory = new MysqlFactory();
        IUser iuser = factory.CreateUser();

        // user
        user.setId(1);
        iuser.insert(user);
        iuser.getUser(1);

        //dept
        IDepartment dept = factory.CreateDepartment();
        dept.insert(new Department());
        dept.getDept(1);
    }
}
