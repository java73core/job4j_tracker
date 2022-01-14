package ru.job4j.profession.comparator;

import java.util.Comparator;

public class NullFirstMethod {
    public static Comparator<String> nullFirst() {
        Comparator<String> comparator = Comparator.nullsFirst(Comparator.naturalOrder());
        return comparator;
    }
}