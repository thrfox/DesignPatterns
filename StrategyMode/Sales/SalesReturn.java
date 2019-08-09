package StrategyMode.Sales;

/**
 * 满减促销方法
 */
public class SalesReturn implements SalesSuper {

    /**
     * moneyCondition 满减条件
     */
    private double moneyCondition;
    /**
     * moneyReturn 满后返还
     */
    private double moneyReturn;

    public SalesReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    /**
     * 促销方法计算
     *
     * @param cash 收到的现金
     * @return
     */
    @Override
    public double acceptCash(double cash) {
        if (cash >= moneyCondition) {
            return (cash - moneyReturn) <= 0 ? 0.01d : cash - moneyReturn;
        }
        return cash;
    }
}
