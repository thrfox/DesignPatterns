package FacadeMode;

/**
 * 投资类
 */
public class Investment {

    protected String name;

    public void buy() {
        System.out.println("买" + name);
    }

    public void sell() {
        System.out.println("卖" + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
