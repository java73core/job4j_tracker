package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void item() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        Item currentDateTimeFormat = new Item();
        System.out.println("Текущие дата и время после форматирования: " +  currentDateTimeFormat.getCreated().format(formatter));
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Тест1"));
        tracker.add(new Item("Тест1"));
        Item[] mas = new Item[100];
        mas = tracker.findByName("Тест1");
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}
