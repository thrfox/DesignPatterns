package AbstractFactoryMode.FactoryMethod.SimpleFactory;

import AbstractFactoryMode.Bean.IDepartment;
import AbstractFactoryMode.Bean.IUser;
import AbstractFactoryMode.Bean.User;
import AbstractFactoryMode.FactoryMethod.IFactory;

public class SimpleFactoryMain {
    public static void main(String[] args) {
        // 简单工厂获取SQLSERVER的工厂对象
        IFactory factory = DataAccess.getFactory(DataAccess.DB.SQLSERVER);

        IUser user = factory.CreateUser();
        IDepartment department = factory.CreateDepartment();
        user.insert(new User());
        department.getDept(1);
    }
}
