package StrategyMode.Sales;

/**
 * 打折促销方法
 */
public class SalesRebate implements SalesSuper {
    /**
     * 打折率
     */
    private double discountRate;

    public SalesRebate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double acceptCash(double cash) {
        return cash * discountRate;
    }
}
