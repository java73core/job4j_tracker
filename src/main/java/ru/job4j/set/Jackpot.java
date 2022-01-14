package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> strings = new HashSet<>();
        for (String str: combination) {
          strings.add(str);
        }
        return strings.size() == 1;
    }
}