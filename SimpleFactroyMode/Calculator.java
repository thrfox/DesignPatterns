package SimpleFactroyMode;

import SimpleFactroyMode.Operation.Operation;

/**
 * 计算类
 */
public class Calculator {
    public static void main(String[] args) {
        // 获得加法操作
        Operation operation = OperationFactory.getOperation("+");
        operation.setNumberA(10d);
        operation.setNumberB(50d);
        System.out.println(operation.getResult());
    }

}
