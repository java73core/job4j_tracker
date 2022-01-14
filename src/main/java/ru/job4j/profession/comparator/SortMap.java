package ru.job4j.profession.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        Map<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());
        map1.putAll(map);
        return map1;
    }
}
