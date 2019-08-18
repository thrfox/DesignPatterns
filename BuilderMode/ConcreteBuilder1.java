package BuilderMode;

/**
 * 具体的建造类，对各个组件进行装配
 */
public class ConcreteBuilder1 implements Builder {

    Product product;

    public ConcreteBuilder1() {
        this.product = new Product();
    }

    @Override
    public void buildPart1() {
        product.addItem("组件A");
    }

    @Override
    public void buildPart2() {
        product.addItem("组件B");
    }

    @Override
    public void getResult() {
        product.show();
    }
}
