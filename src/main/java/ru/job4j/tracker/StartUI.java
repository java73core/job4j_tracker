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
        tracker.add(new Item(1,"Тест"));
        tracker.add(new Item(2,"Тест1"));
        System.out.println(tracker.findById(2));

    }
}
