package AbstractFactoryMode.FactoryMethod.SimpleFactory;

import AbstractFactoryMode.FactoryMethod.IFactory;
import AbstractFactoryMode.FactoryMethod.MysqlFactory;
import AbstractFactoryMode.FactoryMethod.SQLServerFactory;

/**
 * 根据不同的配置，创建不同的工厂
 */
public class DataAccess {
    enum DB {
        /**
         * SQLServer
         */
        SQLSERVER,
        /**
         * Mysql
         */
        MYSQL
    }

    public static IFactory getFactory(DB db) {
        IFactory factory = null;
        switch (db) {
            case MYSQL:
                factory = new MysqlFactory();
                break;
            case SQLSERVER:
                factory = new SQLServerFactory();
                break;
            default:
                break;
        }
        return factory;
    }
}
