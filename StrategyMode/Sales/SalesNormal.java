package StrategyMode.Sales;

/**
 * 正常收费方法
 */
public class SalesNormal implements SalesSuper {
    /**
     * 直接返回应收值
     *
     * @param cash 收到的现金
     * @return
     */
    @Override
    public double acceptCash(double cash) {
        return cash;
    }
}
