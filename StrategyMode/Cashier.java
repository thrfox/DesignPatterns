package StrategyMode;

import StrategyMode.Sales.SalesType;

/**
 * 收银类
 */
public class Cashier {
    public static void main(String[] args) {
        CashContext returnContext = new CashContext(SalesType.RETURN);
        // 交500块钱,满300减100
        System.out.println(returnContext.getResultPrice(100d));
        // 打八折
        CashContext rebateContext = new CashContext(SalesType.REBATE);
        System.out.println(rebateContext.getResultPrice(500d));

    }
}
