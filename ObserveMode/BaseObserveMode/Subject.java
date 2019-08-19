package ObserveMode.BaseObserveMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者类，通知各观察者更新状态
 */
public class Subject {

    private List<Observe> observes = new ArrayList<>();

    /**
     * 通知观察者
     */
    public void notifyObserve() {
        observes.forEach(Observe::update);
    }

    /**
     * 增加观察者
     *
     * @param observe
     */
    public void addObserve(Observe observe) {
        observes.add(observe);
    }

    public void removeObserve(Observe observe) {
        observes.remove(observe);
    }

}
