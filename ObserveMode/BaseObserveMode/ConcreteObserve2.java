package ObserveMode.BaseObserveMode;

/**
 * 具体观察者，需要做的事
 */
public class ConcreteObserve2 implements Observe {
    @Override
    public void update() {
        watchTv();
        eat();
    }

    public void watchTv() {
        System.out.println("看电视");
    }

    public void eat() {
        System.out.println("吃薯条");
    }
}
