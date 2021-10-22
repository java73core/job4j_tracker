package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        int id = input.askInt("Input Id: ");
        String name = input.askStr("Input Name: ");
        Item newItem = new Item(name);
        if (tracker.replace(id, newItem)) {
            out.println("Replace was successfully");
        } else {
            out.println("===Error===");
        }
        return true;
    }
}
