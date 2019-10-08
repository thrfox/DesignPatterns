package AbstractFactoryMode.AbstractFactory;

import AbstractFactoryMode.Bean.IDepartment;
import AbstractFactoryMode.Bean.IUser;

public class DataAccess {
    private static final String SQLSERVER = "SQLServer";
    private static final String MYSQL = "Mysql";

    /**
     * 假设dbName为配置文件配置
     */
    private static String dbName = MYSQL;

    /**
     * 反射获取相应的数据库表对象
     */

    public static IUser createUser() {
        String className = String.format("AbstractFactoryMode.Bean.%sUser", dbName);
        IUser iUser = null;
        try {
            iUser = (IUser) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return iUser;
    }

    public static IDepartment createDept() {
        String className = String.format("AbstractFactoryMode.Bean.%sDept", dbName);
        IDepartment dept = null;
        try {
            dept = (IDepartment) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return dept;
    }

}
