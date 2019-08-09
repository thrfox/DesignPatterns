package StrategyMode.Sales;

/**
 * 促销父类接口
 */
public interface SalesSuper {

    /**
     * 通过cash，由实现类实现不同的促销方法
     *
     * @param cash 收到的现金
     * @return
     */
    double acceptCash(double cash);
}
