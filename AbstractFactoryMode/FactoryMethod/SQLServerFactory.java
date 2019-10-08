package AbstractFactoryMode.FactoryMethod;

import AbstractFactoryMode.Bean.IUser;
import AbstractFactoryMode.Bean.SQLServerUser;

public class SQLServerFactory implements IFactory {
    @Override
    public IUser CreateUser() {
        return new SQLServerUser();
    }
}
