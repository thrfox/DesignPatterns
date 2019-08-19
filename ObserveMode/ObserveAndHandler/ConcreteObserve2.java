package ObserveMode.ObserveAndHandler;

/**
 * 具体观察者，需要做的事，不再实现接口
 */
public class ConcreteObserve2 {

    public void watchTv() {
        System.out.println("看电视");
    }

    public void eat() {
        System.out.println("吃薯条");
    }
}
