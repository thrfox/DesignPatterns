package AbstractFactoryMode.Obj;

public class SQLServerUser implements IUser {
    @Override
    public void insert() {
        System.out.println("插入sqlserver user");
    }

    @Override
    public IUser getUser(int id) {
        System.out.println("获得id=" + id + "的User");
        return null;
    }

}
