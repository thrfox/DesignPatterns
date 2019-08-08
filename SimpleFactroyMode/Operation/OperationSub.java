package SimpleFactroyMode.Operation;

/**
 * 减法计算
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
