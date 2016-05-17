package headfirst.news.observer;

public interface Watched {
    public void addObserver(Watcher o);

    public abstract void deleteObserver(Watcher o);

    public abstract void notifyObservers();

    public void deleteObservers();
}