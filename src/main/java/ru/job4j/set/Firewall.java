package ru.job4j.set;

import java.util.Iterator;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        Iterator iterator = words.iterator();
        String string = null;
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            if (s.toLowerCase().contains(str.toLowerCase())) {
               string = "Выберите другую статью..."; break;
            }
            string = "Вы сделали правильный выбор!";
        }
        return string;
    }
}