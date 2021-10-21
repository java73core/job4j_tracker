package ru.job4j.tracker;

public final class SingleTracker {
    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }
    private static SingleTracker singleTracker;

    public static synchronized SingleTracker getSingleTracker() {
        if (singleTracker == null) {
            singleTracker = new SingleTracker();
        }
        return singleTracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return null;
    }

    public Item[] findByName(String key) {
        return null;
    }

    public Item[] findAll() {
        return null;
    }
}