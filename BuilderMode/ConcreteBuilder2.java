package BuilderMode;

/**
 * 具体的建造类，对各个组件进行装配
 */
public class ConcreteBuilder2 implements Builder {

    Product product;

    public ConcreteBuilder2() {
        this.product = new Product();
    }

    @Override
    public void buildPart1() {
        product.addItem("组件X");
    }

    @Override
    public void buildPart2() {
        product.addItem("组件Y");
    }

    @Override
    public void getResult() {
        product.show();
    }
}
