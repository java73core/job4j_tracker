package ru.job4j.tracker;

import java.util.List;
import java.util.stream.Collectors;

public class ItemDescByName {

    public List<Item> sorted(List<Item> items) {
        return items.stream()
                .sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
                .collect(Collectors.toList());
    }
}

