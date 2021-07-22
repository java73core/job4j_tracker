package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void item() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        Item currentDateTimeFormat = new Item();
        System.out.println("Текущие дата и время после форматирования: " +  currentDateTimeFormat.getCreated().format(formatter));
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showItem(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] item = tracker.findAll();
        for (Item a: item) {
            System.out.println(a);
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        int id = input.askInt("Input Id: ");
        String name = input.askStr("Input Name: ");
        Item newItem = new Item(name);
        if (tracker.replace(id, newItem)) {
            System.out.println("Replace was successfully");
        } else {
            System.out.println("===Error===");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Input id: ");
        if (tracker.delete(id)) {
            System.out.println("Delete was successfully");
        } else {
            System.out.println("===Error===");
        }
    }

    public static void findByIdItem(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        int id = input.askInt("Input Id for searching: ");
        Item itemId = tracker.findById(id);
        if (itemId != null) {
            System.out.println(itemId);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
    }

    public static void findByNameItem(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Input Name for searching: ");
        Item[] itemName = tracker.findByName(name);
        if (itemName.length != 0) {
            for (Item a: itemName) {
                System.out.println(a);
            }
        } else {
            System.out.println("Заявки с таким именем не найдены");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showItem(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findByIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findByNameItem(input, tracker);
            } else if (select == 6) {
                System.out.println("=== Exit Program ===");
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = (Input) new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
