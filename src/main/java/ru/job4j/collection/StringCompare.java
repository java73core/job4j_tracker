package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] cleft = left.toCharArray();
        char[] cright = right.toCharArray();
        int rsl = 0;
        if (left.length() == right.length()) {
            for (int i = 0; i < cleft.length; i++) {
                rsl = rsl + Character.compare(cleft[i], cright[i]);
            }
        } else {
            rsl = left.length() - right.length();
            if (left.length() > right.length()) {
                for (int i = 0; i < cright.length; i++) {
                    rsl = rsl + Character.compare(cleft[i], cright[i]);
                }
            } else {
                for (int i = 0; i < cleft.length; i++) {
                    rsl = rsl + Character.compare(cleft[i], cright[i]);
                }
            }
        }
        return rsl;
    }
}