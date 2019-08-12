package ProxyMode;

/**
 * 代理类，代理小明追校花，同时代理还可以增强小明
 */
public class Proxy implements GiveGift {

    XiaoMing xiaoMing;

    public Proxy(XiaoHua xiaoHua) {
        this.xiaoMing = new XiaoMing(xiaoHua);
    }

    public Proxy() {
    }

    @Override
    public void giveFlower() {
        xiaoMing.giveFlower();
        System.out.println("还连送了99天");
    }

    @Override
    public void giveChocolate() {
        xiaoMing.giveChocolate();
        System.out.println("还是德芙巧克力");
    }
}
