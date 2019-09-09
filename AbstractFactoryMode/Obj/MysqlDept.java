package AbstractFactoryMode.Obj;

public class MysqlDept implements IDepartment {
    @Override
    public void insert() {
        System.out.println("insert MysqlDept");
    }

    @Override
    public IDepartment getDept(int id) {
        System.out.println("get MysqlDept id=" + id);
        return null;
    }
}
