package ru.job4j.tracker;
import java.util.Arrays;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void item() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        Item currentDateTimeFormat = new Item();
        System.out.println("Текущие дата и время после форматирования: " +  currentDateTimeFormat.getCreated().format(formatter));
    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] item = tracker.findAll();
                System.out.println(Arrays.toString(item));
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.println("Input Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.println("Input Name: ");
                String name = scanner.nextLine();
                Item newItem = new Item();
                newItem.setName(name);
                tracker.replace(id, newItem);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Replace was successfully");
                } else {
                    System.out.println("===Error===");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.println("Input id: ");
               int id = Integer.valueOf(scanner.nextLine());
                tracker.delete(id);
                if (tracker.delete(id)) {
                    System.out.println("Delete was successfully");
                } else {
                    System.out.println("===Error===");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.println("Input Id for searching: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item itemId = tracker.findById(id);
                if (itemId != null) {
                    System.out.println(itemId);
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.println("Input Name for searching: ");
                String name = scanner.nextLine();
                Item[] itemName = tracker.findByName(name);
                if (itemName != null) {
                    System.out.println(Arrays.toString(itemName));
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
        }

}
