package AbstractFactoryMode.FactoryMethod;

import AbstractFactoryMode.Bean.IDepartment;
import AbstractFactoryMode.Bean.IUser;

public interface IFactory {
    public IUser CreateUser();

    public IDepartment CreateDepartment();
}
