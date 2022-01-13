package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] strLeft = left.split("\\.", 2);
        String[] strRight = right.split("\\.", 2);
        return Integer.compare(Integer.parseInt(strLeft[0]), Integer.parseInt(strRight[0]));
    }
}