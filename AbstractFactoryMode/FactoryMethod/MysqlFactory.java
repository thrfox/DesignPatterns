package AbstractFactoryMode.FactoryMethod;

import AbstractFactoryMode.Bean.IUser;
import AbstractFactoryMode.Bean.MysqlUser;

public class MysqlFactory implements IFactory {
    @Override
    public IUser CreateUser() {
        return new MysqlUser();
    }
}
