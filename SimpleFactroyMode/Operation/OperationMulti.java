package SimpleFactroyMode.Operation;

/**
 * 乘法计算
 */
public class OperationMulti extends Operation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
