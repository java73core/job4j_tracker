package ru.job4j.tracker;

public class FindById implements UserAction {
    private final Output out;

    public FindById(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, SqlTracker tracker) {
        out.println("=== Find item by Id ===");
        int id = input.askInt("Input Id for searching: ");
        Item itemId = tracker.findById(id);
        if (itemId != null) {
           out.println(itemId);
        } else {
            out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
