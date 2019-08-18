package FacadeMode;

public class Client {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buy();
        fund.sell();
    }
}
