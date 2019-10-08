package AbstractFactoryMode.FactoryMethod;

import AbstractFactoryMode.Bean.IDepartment;
import AbstractFactoryMode.Bean.IUser;
import AbstractFactoryMode.Bean.MysqlDept;
import AbstractFactoryMode.Bean.MysqlUser;

public class MysqlFactory implements IFactory {
    @Override
    public IUser CreateUser() {
        return new MysqlUser();
    }

    @Override
    public IDepartment CreateDepartment() {
        return new MysqlDept();
    }
}
