package ru.job4j.profession.comparator;

import java.util.Comparator;

public class NaturalOrder {
    public static Comparator<String> naturalOrder() {
        return Comparator.naturalOrder();
    }
}
