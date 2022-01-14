package ru.job4j.set;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        Set<Character> pan = new HashSet<>();
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", "");
        char[] pangram = s.toCharArray();
        for (Character t: pangram) {
            pan.add(t);
        }
        if (pan.size() == 26) {
            return true;
        }
        return false;
    }
}