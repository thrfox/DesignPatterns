package ObserveMode.ObserveAndHandler;

public class ConcreteSubject extends Subject {

    /**
     * 主题状态
     */
    private String subjectState;

    private Event events = new Event();

    /**
     * 执行委托者下的被委托的方法
     */
    @Override
    public void notifyObserve() {
        events.exec();
    }

    public Event getEvents() {
        return events;
    }

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
