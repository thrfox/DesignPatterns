package SimpleFactroyMode.Operation;

/**
 * 加法计算
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
