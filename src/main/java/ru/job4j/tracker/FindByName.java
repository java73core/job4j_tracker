package ru.job4j.tracker;

import java.util.List;

public class FindByName implements UserAction {
    private final Output out;

    public FindByName(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, SqlTracker tracker) {
       out.println("=== Find items by name ===");
        String name = input.askStr("Input Name for searching: ");
        List<Item> itemName = tracker.findByName(name);
        if (itemName.size() != 0) {
            for (Item a: itemName) {
                out.println(a);
            }
        } else {
                out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
