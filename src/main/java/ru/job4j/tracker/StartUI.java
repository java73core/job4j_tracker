package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void item() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        Item currentDateTimeFormat = new Item();
        System.out.println("Текущие дата и время после форматирования: " +  currentDateTimeFormat.getCreated().format(formatter));
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] item = tracker.findAll();
                for (Item a: item) {
                    System.out.println(a);
                }

            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                int id = Integer.valueOf(input.askStr("Input Id: "));
                String name = input.askStr("Input Name: ");
                Item newItem = new Item(name);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Replace was successfully");
                } else {
                    System.out.println("===Error===");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
               int id = Integer.valueOf(input.askStr("Input id: "));
               if (tracker.delete(id)) {
                    System.out.println("Delete was successfully");
                } else {
                    System.out.println("===Error===");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                int id = Integer.valueOf(input.askStr("Input Id for searching: "));
                Item itemId = tracker.findById(id);
                if (itemId != null) {
                    System.out.println(itemId);
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 5) {
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
            } else if (select == 6) {
                System.out.println("=== Exit Program ===");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = (Input) new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
