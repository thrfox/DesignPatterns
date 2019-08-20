package ObserveMode.ObserveAndHandler;

/**
 * 具体观察者，需要做的事
 */
public class ConcreteObserve2 {

    public void fallen() {
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
