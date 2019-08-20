package ObserveMode.ObserveAndHandler;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.setSubjectState("优秀");
        ConcreteObserve1 concreteObserve1 = new ConcreteObserve1("强人", concreteSubject);
        // 委托加入观察者1的调用方法
        concreteSubject.getEvents().addEvent(concreteObserve1::keepFitness);
        // 委托加入2
        ConcreteObserve2 concreteObserve2 = new ConcreteObserve2();
        concreteSubject.getEvents().addEvent(concreteObserve2::fallen);
        // 主题通知
        concreteSubject.notifyObserve();

        concreteSubject.setSubjectState("及格");

        concreteSubject.notifyObserve();


    }

}
