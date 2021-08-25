package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Input id: ");
        if (tracker.delete(id)) {
            System.out.println("Delete was successfully");
        } else {
            System.out.println("===Error===");
        }
        return true;
    }
}
