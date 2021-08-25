package ru.job4j.tracker;

public class FindById implements UserAction{
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        int id = input.askInt("Input Id for searching: ");
        Item itemId = tracker.findById(id);
        if (itemId != null) {
            System.out.println(itemId);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
