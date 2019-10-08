package AbstractFactoryMode.FactoryMethod;

import AbstractFactoryMode.Bean.IUser;
import AbstractFactoryMode.Bean.User;

public class FactoryMethodMain {
    public static void main(String[] args) {
        User user = new User();
        IFactory factory = new SQLServerFactory();
        IUser sqlServerUser = factory.CreateUser();
        user.setId(1);
        sqlServerUser.insert(user);
        sqlServerUser.getUser(1);
    }
}
