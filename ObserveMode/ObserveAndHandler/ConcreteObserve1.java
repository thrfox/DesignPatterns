package ObserveMode.ObserveAndHandler;

/**
 * 具体观察者，需要做的事，不再实现接口
 */
public class ConcreteObserve1 {

    public void run() {
        System.out.println("跑步");
    }

    public void strongTrain() {
        System.out.println("力量训练");
    }
}
