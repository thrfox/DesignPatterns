package ObserveMode.BaseObserveMode;

public class Main {

    public static void main(String[] args) {

        // 添加两个观察者
        Subject subject = new Subject();
        // 观察值指定通知者(主题)
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserve1 concreteObserve1 = new ConcreteObserve1("胖子", concreteSubject);
        concreteSubject.addObserve(concreteObserve1);

        concreteSubject.setSubjectState("优秀");
        concreteSubject.notifyObserve();
        concreteSubject.setSubjectState("及格");
        concreteSubject.notifyObserve();

        // 观察者不指定主题
        ConcreteObserve2 concreteObserve2 = new ConcreteObserve2();
        subject.addObserve(concreteObserve2);

        // 通知观察者
        subject.notifyObserve();

        System.out.println("-----------------------");
        //移除观察者后再通知
        subject.removeObserve(concreteObserve2);

        subject.notifyObserve();
    }
}
