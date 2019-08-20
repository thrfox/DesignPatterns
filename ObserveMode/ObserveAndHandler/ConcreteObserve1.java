package ObserveMode.ObserveAndHandler;

/**
 * 具体观察者，需要做的事
 */
public class ConcreteObserve1 {

    private String name;
    /**
     * 可以保存一个具体通知者的引用，指定主题
     */
    private ConcreteSubject subject;

    /**
     * 观察者的状态
     */
    private String state;

    public ConcreteObserve1() {
    }

    public ConcreteObserve1(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }


    public void keepFitness() {
        if (subject != null) {
            state = subject.getSubjectState();
        }
        run();
        strongTrain();
    }

    public void run() {
        System.out.println(name + "跑步，状态是" + state);
    }

    public void strongTrain() {
        System.out.println(name + "力量训练" + state);
    }
}
