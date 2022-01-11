package ru.job4j.tracker;

import java.util.List;
import java.util.stream.Collectors;

public class ItemAscByName {

    public List<Item> sorted(List<Item> items) {
      return items.stream()
              .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
              .collect(Collectors.toList());
    }
}
