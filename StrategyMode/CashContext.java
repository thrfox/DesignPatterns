package StrategyMode;

import StrategyMode.Sales.*;

/**
 * 策略类,由该类的构造器传入的具体实现类，实现具体的算法
 */
public class CashContext {

    private SalesSuper salesSuper;

    /**
     * 简单工厂，通过参数返回不同的算法类
     *
     * @param salesType
     */
    public CashContext(SalesType salesType) {
        switch (salesType) {
            case NORMAL:
                this.salesSuper = new SalesNormal();
                break;
            case RETURN:
                // 满300减100
                this.salesSuper = new SalesReturn(300d, 100d);
                break;
            case REBATE:
                // 打八折
                this.salesSuper = new SalesRebate(0.8);
                break;
            // 默认正常收费
            default:
                this.salesSuper = new SalesNormal();
                break;
        }
    }

    /**
     * 传入总价，进行促销计算后获得实付款
     *
     * @param totalPrice 总价
     * @return
     */
    public double getResultPrice(double totalPrice) {
        return salesSuper.acceptCash(totalPrice);
    }


}
