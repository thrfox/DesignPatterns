package AbstractFactoryMode.Obj;

public class MysqlUser implements IUser {
    @Override
    public void insert() {
        System.out.println("插入mysql的user");
    }

    @Override
    public IUser getUser(int id) {
        System.out.println("获得id=" + id + "的User");
        return null;
    }

}
