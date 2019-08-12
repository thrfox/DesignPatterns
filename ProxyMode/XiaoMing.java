package ProxyMode;

public class XiaoMing implements GiveGift {

    XiaoHua xiaoHua;

    public XiaoMing() {
    }

    public XiaoMing(XiaoHua xiaoHua) {
        this.xiaoHua = xiaoHua;
    }

    @Override
    public void giveFlower() {
        String name = xiaoHua.getName();
        System.out.println(String.format("给%s送了9朵花", name));
    }

    @Override
    public void giveChocolate() {
        String name = xiaoHua.getName();
        System.out.println(String.format("给%s送了1盒巧克力", name));
    }
}
