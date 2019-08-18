package BuilderMode;

/**
 * 建造指挥者，控制需要建造的步骤
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
        builder.buildPart1();
        builder.buildPart2();
    }

    /**
     * *-*展示builder的组件
     */
    public void builderShow() {
        this.builder.getResult();
    }
}
