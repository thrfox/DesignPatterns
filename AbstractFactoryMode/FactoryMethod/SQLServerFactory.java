package AbstractFactoryMode.FactoryMethod;

import AbstractFactoryMode.Bean.IDepartment;
import AbstractFactoryMode.Bean.IUser;
import AbstractFactoryMode.Bean.SQLServerDept;
import AbstractFactoryMode.Bean.SQLServerUser;

public class SQLServerFactory implements IFactory {
    @Override
    public IUser CreateUser() {
        return new SQLServerUser();
    }

    @Override
    public IDepartment CreateDepartment() {
        return new SQLServerDept();
    }
}
