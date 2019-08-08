package SimpleFactroyMode;

import SimpleFactroyMode.Operation.*;

/**
 * 【重要】
 * 简单工厂
 */
public class OperationFactory {
    /**
     * 获得计算的方法
     * @param operateTag 操作标记 + - * /
     * @return
     */
    public static Operation getOperation(String operateTag){
        switch (operateTag) {
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMulti();
            case "/":
                return new OperationDiv();
            default:
                return null;
        }
    }
}
