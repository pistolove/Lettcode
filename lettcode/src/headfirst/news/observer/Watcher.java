package headfirst.news.observer;

/**
 * 观察者
 * @author liqqc
 */
public interface Watcher {

    void update(Watched o, Object arg);
}
