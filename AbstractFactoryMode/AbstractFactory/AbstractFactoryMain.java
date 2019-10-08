package AbstractFactoryMode.AbstractFactory;

import AbstractFactoryMode.Bean.IDepartment;
import AbstractFactoryMode.Bean.IUser;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        IUser user = DataAccess.createUser();
        user.getUser(1);

        IDepartment dept = DataAccess.createDept();
        dept.getDept(2);

    }
}
