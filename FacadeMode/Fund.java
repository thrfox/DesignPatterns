package FacadeMode;

/**
 * 基金类
 */
public class Fund {

    private NationDebt nationDebt;
    private Stock stock;
    private Realty realty;

    public Fund() {
        this.nationDebt = new NationDebt();
        this.stock = new Stock();
        this.realty = new Realty();
    }

    public Fund(NationDebt nationDebt, Stock stock, Realty realty) {
        this.nationDebt = nationDebt;
        this.stock = stock;
        this.realty = realty;
    }

    /**
     * 买基金
     */
    public void buy() {
        nationDebt.buy();
        stock.buy();
        realty.buy();
    }

    /**
     * 卖基金
     */
    public void sell() {
        nationDebt.sell();
        stock.sell();
        realty.sell();
    }

}
