package SimpleFactroyMode.Operation;

/**
 * 除法计算
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if (getNumberB() <= 0) {
            throw new NumberFormatException();
        }
        return getNumberA() / getNumberB();
    }
}
