package ru.job4j.profession.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSort {
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.nullsLast(Comparator.naturalOrder()));
        return data;
    }
}