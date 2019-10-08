package AbstractFactoryMode.FactoryMethod;

import AbstractFactoryMode.Bean.IUser;

public interface IFactory {
    public IUser CreateUser();
}
