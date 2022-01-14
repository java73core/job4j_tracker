package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<Character> setChar = new HashSet<>();
        char[] ch = s.toCharArray();
        for (char g: ch) {
            setChar.add(g);
        }
        return ch.length == setChar.size();
    }
}