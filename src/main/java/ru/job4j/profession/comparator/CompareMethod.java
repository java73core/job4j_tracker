package ru.job4j.profession.comparator;

public class CompareMethod {

    public static int ascendingCompare(int first, int second) {
    return Integer.compare(first, second);
    }

    public static int descendingCompare(int first, int second) {
    return Integer.compare(second, first);
    }
}
