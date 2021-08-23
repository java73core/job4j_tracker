package ru.job4j.tracker;

public class ShowAllAction implements UserAction{
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] item = tracker.findAll();
        if (item.length > 0) {
            for (Item a: item) {
                System.out.println(a);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
