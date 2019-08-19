package ObserveMode.BaseObserveMode;

/**
 * 观察者抽象，提供提供方法给通知者调用以更新自身状态
 */
public interface Observe {

    /**
     * 更新自身状态
     */
    void update();
}
