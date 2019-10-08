package AbstractFactoryMode.Bean;

public class SQLServerDept implements IDepartment {
    @Override
    public void insert() {
        System.out.println("insert SQLServerDept");
    }

    @Override
    public IDepartment getDept(int id) {
        System.out.println("get SQLServerDept id=" + id);
        return null;
    }

}
