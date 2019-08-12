package ProxyMode;

public class Main {

    public static void main(String[] args) {
        XiaoHua xiaoHua = new XiaoHua();
        xiaoHua.setName("秋香");

        System.out.println("----代理送花----");
        Proxy proxy = new Proxy(xiaoHua);
        proxy.giveFlower();
        proxy.giveChocolate();

        System.out.println("----小明送花----");
        XiaoMing xiaoMing = new XiaoMing(xiaoHua);
        xiaoMing.giveFlower();
        xiaoMing.giveChocolate();
    }
}
