package BuilderMode;

public class Main {

    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder1());
        director.builderShow();

        Director director2 = new Director(new ConcreteBuilder2());
        director2.builderShow();
    }

}
