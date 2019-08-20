package ObserveMode.ObserveAndHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * 伪委托者类，
 * 只能保证观察者的update方法有相同的参数与返回值，否则需要反射实现
 * 针对该例，update无参且无返回值
 */
public class Event {
    /**
     * runable只针对该无参无返回值的例子，**更应用反射实现，以应对有参有返回等多种情况**
     */
    private List<Runnable> eventHandler = new ArrayList<>();

    public void addEvent(Runnable runnable) {
        eventHandler.add(runnable);
    }

    public void removeEvent(Runnable runnable) {
        eventHandler.remove(runnable);
    }

    public void removeAllEvent() {
        eventHandler.clear();
    }

    public void exec() {
        eventHandler.forEach(Runnable::run);
    }
}
