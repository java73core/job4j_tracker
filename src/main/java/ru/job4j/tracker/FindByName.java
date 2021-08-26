package ru.job4j.tracker;

public class FindByName implements UserAction{
    private final Output out;

    public FindByName(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
       out.println("=== Find items by name ===");
        String name = input.askStr("Input Name for searching: ");
        Item[] itemName = tracker.findByName(name);
        if (itemName.length != 0) {
            for (Item a: itemName) {
                out.println(a);
            }
        } else {
                out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
